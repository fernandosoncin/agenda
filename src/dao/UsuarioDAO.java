/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioM;

/**
 *
 * @author Leopo
 */
public class UsuarioDAO {
        PreparedStatement pst;
        String sql;
    static public UsuarioM valida(String usuarioAux, String senha) throws SQLException{
        PreparedStatement pst;
        String sql;
           sql = "select * from Usuario where usuario = ? and senha = ?";
           pst = Conexao.getInstance().prepareStatement(sql);
           pst.setString(1, usuarioAux);
           pst.setString(2, senha);
           UsuarioM usuario;
           usuario = null;
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               usuario = new UsuarioM(rs.getInt("id"),
                       rs.getString("nome"), 
                       rs.getString("usuario"),
                       rs.getString("senha"),
                       rs.getBoolean("admin")
               );
            }
            pst.close();
            return usuario;
    }
    public List<UsuarioM> listaTodos() throws SQLException{
        List<UsuarioM> listaUser = new ArrayList<UsuarioM>();
        sql = "select * from Usuario";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaUser.add(new UsuarioM(rs.getInt("id"),
                       rs.getString("nome"), 
                       rs.getString("usuario"),
                       rs.getBoolean("administrador")
                    )
                );
        }
        pst.close();
        return listaUser;
    }
    
    static public void salvar(UsuarioM usuario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Usuario values(?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, usuario.getNome());
        pst.setString(3, usuario.getUsuario());
        pst.setString(4,usuario.getSenha());
        pst.setBoolean(5, usuario.isAdmin());
        pst.execute();
        pst.close();
    }   
        static public void excluir(UsuarioM usuario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Usuario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, usuario.getId());
        pst.execute();
        pst.close();
    }
        static public void alterar(UsuarioM usuario) throws SQLException{
         PreparedStatement pst;
         String sql;
         sql = "update Usuario set usuario = ?, senha = ?, admin = ?, masp = ?, nome = ?, contato = ? where id = ?";
         pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, usuario.getNome());
        pst.setString(3, usuario.getUsuario());
        pst.setString(4,usuario.getSenha());
        pst.setBoolean(5, usuario.isAdmin());
        pst.execute();
        pst.close();
     } 
}
