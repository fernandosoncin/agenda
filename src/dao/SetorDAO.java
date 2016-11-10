package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FuncionarioM;
import model.SetorM;


public class SetorDAO {
    PreparedStatement pst;
    String sql;
    
    
    static public void salvar (SetorM setor) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into setor values (?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, setor.getNome());
        pst.setInt(3, setor.getRamal());
        pst.execute();
        pst.close();
    }
    
    public List<SetorM> ListaSetor() throws SQLException{
    List<SetorM> listaSetor;
    listaSetor = new ArrayList<>();
    
    sql = "select * from setor order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    
    while (rs.next()){
        listaSetor.add(new SetorM(rs.getInt("id"), 
                                  rs.getString("nome"), 
                                  rs.getInt("ramal")));
    }
    pst.close();
    return listaSetor;
    }
    
    static public void excluir (SetorM setor) throws SQLException{
        PreparedStatement pst;
        String sql;
        
        sql = "delete from setor where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,setor.getId());
        pst.execute();
        pst.close();
    }
    
    static public void alterar (SetorM setor) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update setor set nome=?, ramal=? where id=? ";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, setor.getNome());
        pst.setInt(2, setor.getRamal());
        pst.setInt(3, setor.getId());
        pst.execute();
        pst.close();
        
    }
        public SetorM busca(int id) throws SQLException{
        sql = "select * from setor where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        SetorM set = null;
        SetorM setor = new SetorM();

        while(rs.next()){
           set = new SetorM(rs.getInt("id"), rs.getString("nome"),rs.getInt("ramal"));
        }
        pst.close();
        return set;
    }
}
