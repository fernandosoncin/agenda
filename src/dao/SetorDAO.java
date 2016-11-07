/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SetorM;

/**
 *
 * @author NUPSI-04
 */
public class SetorDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (SetorM setor) throws SQLException{
        sql = "insert into setor values (?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, setor.getNome());
        pst.setInt(3, setor.getRamal());
        pst.execute();
        pst.close();
    }
}
