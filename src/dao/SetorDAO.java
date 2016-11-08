package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SetorM;


public class SetorDAO {

    
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
}
