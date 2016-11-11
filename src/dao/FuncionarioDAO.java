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
        pst.setString(4, funcionario.getCidadeestado()); //Cidadeestado -> CidadeEstado
        pst.setString(5, funcionario.getTelresidencial()); // Residencial -> TelResidencial
        pst.setString(6, funcionario.getTelcomercial1());
        pst.setString(7, funcionario.getTelcomercial2());
        pst.setString(8, funcionario.getCelular1());
        pst.setString(9, funcionario.getCelular2());
        pst.setString(10, funcionario.getCelular3());
        pst.setString(11, funcionario.getEmail());
        pst.setString(12, funcionario.getSetor());
        pst.setString(13, funcionario.getDia());
        pst.setString(14, funcionario.getHorario());
        pst.setString(15, funcionario.getObservacao());
        pst.setBoolean(16, funcionario.getDocente());
        pst.setBoolean(17, funcionario.getInativo());
        pst.setInt(18, funcionario.getId_setor()); 
        
        pst.execute();
        pst.close();
    }
                                //MÉTODO = AÇÕES, PORTANTO, busca -> buscaR *trocar no DAO do Setor.
    static public FuncionarioM buscar(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        FuncionarioM funcionario = null;
        SetorDAO setor = new SetorDAO();
        
        sql = "select * from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        /*while(rs.next()){
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
                   rs.getString("setor"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   rs.getInt("docente"),
                   rs.getInt("inativo"),
                   setor.buscar(rs.getInt("id_setor")));
        }*/
        pst.close();
        
        return funcionario;
    }
    
    static public void excluir(FuncionarioM funcionario) throws SQLException{
        //Vai usar esse método?
        PreparedStatement pst;
        String sql;
        sql = "delete from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getId_setor()); //falta o getID
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
                 + "id_setor = ?, " //id do setor é pego no combo box
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
        pst.setString(11, funcionario.getSetor());
        pst.setString(12, funcionario.getDia());
        pst.setString(13, funcionario.getHorario());
        pst.setString(14, funcionario.getObservacao());
        pst.setBoolean(15, funcionario.getDocente());
        pst.setBoolean(16, funcionario.getInativo());
        //pst.setInt(17, funcionario.getId_setor().getInt()); //falta get e set da chave estrangeira²
        pst.setInt(18,0);
        
         pst.execute();
         pst.close();
     }
    
    public List<FuncionarioM> listaTodos() throws SQLException{
        List<FuncionarioM> listaFuncionario = new ArrayList<FuncionarioM>();
        sql = "select * from Funcionario order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
       
        SetorDAO setor = new SetorDAO();
        
        /*while(rs.next()){
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
                   rs.getString("setor"),
                   rs.getString("dia"),
                   rs.getString("horario"),
                   rs.getString("observacao"),
                   rs.getString("docente"),
                   rs.getString("inativo"),
                   setor.buscar(rs.getInt("id_setor") // de novo.
                   );
        }*/
      
        
        pst.close();
        return listaFuncionario;
    }
    

}
