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
        sql = "insert into setor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
        pst.setBoolean(15, funcionario.getDocente());
        pst.setBoolean(16, funcionario.getInativo());
        pst.setInt(17, funcionario.getSetor().getId()); 
        
        pst.execute();
        pst.close();
    }
                               
    static public FuncionarioM busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        FuncionarioM funcionario = null;
        SetorDAO setor = new SetorDAO();
        
        sql = "select * from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           funcionario = new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidadeestado"),
                   rs.getString("telresidencial"),
                   rs.getString("telcomercial1"),
                   rs.getString("telcomercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo"),
                   setor.busca(rs.getInt("id_setor")));
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
                 + "cidadeestado = ?, "
                 + "residencial  = ?, "
                 + "telcomercial  = ?, "
                 + "telresidencial  = ?, "
                 + "telcomercial1  = ?, "
                 + "telcomercial2  = ?, "
                 + "celular1  = ?, "
                 + "celular2  = ?, "
                 + "celular3  = ?, "
                 + "email  = ?, "
                 + "setor  = ?, "
                 + "dia  = ?, "
                 + "horario  = ?, "
                 + "observacao  = ?, "
                 + "docente  = ?, "
                 + "inativo  = ?, "
                 + "id_setor = ?, "
                 + "where id = ?";
         pst = Conexao.getInstance().prepareStatement(sql);
         
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
        pst.setBoolean(14, funcionario.getDocente());
        pst.setBoolean(15, funcionario.getInativo());
        pst.setInt(16, funcionario.getSetor().getId()); 
        pst.setInt(17,0);
        
         pst.execute();
         pst.close();
     }
    
    public List<FuncionarioM> listaTodos() throws SQLException{
        List<FuncionarioM> listaFuncionario = new ArrayList<FuncionarioM>();
        sql = "select * from Funcionario order by nome";
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
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo"),
                   SetorDAO.busca(rs.getInt("id_setor"))
                   ));
        }
      
        
        pst.close();
        return listaFuncionario;
    }
    
    public List<FuncionarioM> listaFuncionario() throws SQLException{     
    List<FuncionarioM> listaFuncionario;
    listaFuncionario = new ArrayList<>();
    
    sql = "select * from funcionarios order by nome";
    pst = Conexao.getInstance().prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()){
           listaFuncionario.add(new FuncionarioM(
                   rs.getInt("id"),
                   rs.getString("nome"),
                   rs.getString("endereco"),
                   rs.getString("cidadeestado"),
                   rs.getString("telresidencial"),
                   rs.getString("telcomercial1"),
                   rs.getString("telcomercial2"),
                   rs.getString("celular1"),
                   rs.getString("celular2"),
                   rs.getString("celular3"),
                   rs.getString("email"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   rs.getBoolean("docente"),
                   rs.getBoolean("inativo"),
                   SetorDAO.busca(rs.getInt("id_setor"))
                   ));
        }
    pst.close();
    return listaFuncionario;
    }
    
}
