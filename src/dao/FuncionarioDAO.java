package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FuncionarioM;



public class FuncionarioDAO {
    
    PreparedStatement pst;
    String sql;
    
    static public void salvar (FuncionarioM funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Funcionario values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, funcionario.getNome());
        pst.setString(3, funcionario.getEndereco());
        pst.setString(4, funcionario.getCidadeestado());
        pst.setString(5, funcionario.getTelresidencial()); 
        pst.setString(6, funcionario.getTelcomercial1());
        pst.setString(7, funcionario.getTelcomercial2());
        pst.setString(8, funcionario.getCelular1());
        pst.setString(9, funcionario.getCelular2());
        pst.setString(10, funcionario.getCelular3());
        pst.setString(11, funcionario.getEmail());
        pst.setString(12, funcionario.getDia());
        pst.setString(13, funcionario.getHorario());
        pst.setString(14, funcionario.getObservacao());
        pst.setInt(15, funcionario.getSetor().getId());
        pst.setBoolean(16, funcionario.getDocente());
        pst.setBoolean(17, funcionario.getInativo());
         
        pst.execute();
        pst.close();
    }
    
    static public FuncionarioM buscaNome(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        FuncionarioM funcionario = null;
        SetorDAO setorDAO = new SetorDAO();
        
        sql = "select * from Funcionario where nome like ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Nome);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           funcionario = new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidade_estado"),
                   rs.getString("tel_residencial"),
                   rs.getString("tel_comercial1"),
                   rs.getString("tel_comercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   setorDAO.busca(rs.getInt("id_setor")),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo"));
                   
        }
        pst.close();
        
        return funcionario;
    }
                               
    static public FuncionarioM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        FuncionarioM funcionario = null;
        SetorDAO setorDAO = new SetorDAO();
        
        sql = "select * from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           funcionario = new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidade_estado"),
                   rs.getString("tel_residencial"),
                   rs.getString("tel_comercial1"),
                   rs.getString("tel_comercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   setorDAO.busca(rs.getInt("id_setor")),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo"));
                   
        }
        pst.close();
        
        return funcionario;
    }
    
    static public void excluir(FuncionarioM funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getId());
        pst.execute();
        pst.close();
    }
      
    static public void alterar(FuncionarioM funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "update Funcionario set "
                 + "nome = ?, "
                 + "endereco = ?, "
                 + "cidade_estado = ?, "
                 + "tel_residencial  = ?, "
                 + "tel_comercial1  = ?, "
                 + "tel_comercial2  = ?, "
                 + "celular1  = ?, "
                 + "celular2  = ?, "
                 + "celular3  = ?, "
                 + "email  = ?, "
                 + "setor  = ?, "
                 + "dia  = ?, "
                 + "horario  = ?, "
                 + "observacao  = ?, "
                 + "id_setor = ?, "
                 + "docente  = ?, "
                 + "inativo  = ?, "
                
                 + "where id = ?";
         pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(0, funcionario.getNome());
        pst.setString(1, funcionario.getNome());
        pst.setString(2, funcionario.getEndereco());
        pst.setString(3, funcionario.getCidadeestado());
        pst.setString(4, funcionario.getTelresidencial());
        pst.setString(5, funcionario.getTelcomercial1());
        pst.setString(6, funcionario.getTelcomercial2());
        pst.setString(7, funcionario.getCelular1());
        pst.setString(8, funcionario.getCelular2());
        pst.setString(9, funcionario.getCelular3());
        pst.setString(10, funcionario.getEmail());
        pst.setString(11, funcionario.getDia());
        pst.setString(12, funcionario.getHorario());
        pst.setString(13, funcionario.getObservacao());
        pst.setInt(14, funcionario.getSetor().getId());
        pst.setBoolean(15, funcionario.getDocente());
        pst.setBoolean(16, funcionario.getInativo());
        pst.setInt(17,0);
        
         pst.execute();
         pst.close();
     }
    
    public List<FuncionarioM> listaTodos() throws SQLException{
        List<FuncionarioM> listaFuncionario = new ArrayList<>();
        sql = "select * from Funcionario order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        SetorDAO setorDAO = new SetorDAO();
        
        while(rs.next()){
           listaFuncionario.add(new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidade_estado"),
                   rs.getString("tel_residencial"),
                   rs.getString("tel_comercial1"),
                   rs.getString("tel_comercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   setorDAO.busca(rs.getInt("id_setor")),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo")));
                   
        }
      
        
        pst.close();
        return listaFuncionario;
    }
    
    public List<FuncionarioM> listaFuncionario() throws SQLException{     
    List<FuncionarioM> listaFuncionario;
    listaFuncionario = new ArrayList<>();
    
    sql = "select * from Funcionarios order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()){
           listaFuncionario.add(new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidade_estado"),
                   rs.getString("tel_residencial"),
                   rs.getString("tel_comercial1"),
                   rs.getString("tel_comercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   SetorDAO.busca(rs.getInt("id_setor")),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo")));
        }
    pst.close();
    return listaFuncionario;
    }
    
}