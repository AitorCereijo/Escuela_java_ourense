/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.dao;

import com.vn.appusuarios.modelo.Usuario;
import com.vn.appusuarios.modelo.dao.IDaoUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 6
 */
public class DaoUsuario implements IDaoUsuario {

    private Connection con;

    /**
     * Metodo que crea y devuelve un usuario con los parámetros recibidos
     *
     * @param email email del usuario
     * @param password contraseña del usuario
     * @param nombre nombre del usario
     * @param edad edad del usuario
     * @return objeto Usuario nuevo
     */
    @Override
    public Usuario crear(String email, String password, String nombre, int edad) {
        try {
            String sqlQuery = "INSERT into usuario (email, password, nombre, edad) values (?,?,?,?)";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(2, password);
            sentenciaSQL.setString(3, nombre);
            sentenciaSQL.setInt(4, edad);
            sentenciaSQL.executeUpdate();
            return obtenerPorEmail(email);
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Constructor de la clase en el que se inicializa la conexión
     */
    public DaoUsuario() {
        try { //
            cargarDrivers();
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/db_usuarios",
                    "root",
                    "1234"
            );
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private  static void cargarDrivers() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se ha cargado DerbyDB");
        }
    }
    /**
     * Método que obtiene un Usuario buscandolo por su id.
     *
     * @param id id del usuario
     * @return objeto usuario encontrado
     */
    @Override
    public Usuario obtenerPorId(int id) {
        try {
            String sqlQuery = "SELECT email, password, nombre, edad FROM usuario WHERE id= ?";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setInt(1, id);
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario(
                        id,
                        resultado.getString("email"),
                        resultado.getString("password"),
                        resultado.getString("nombre"),
                        resultado.getInt("edad"));

                System.out.println("ID: " + id + " Email: " + resultado.getString("email")
                        + " Password: " + resultado.getString("password") + " Nombre: "
                        + resultado.getString("nombre") + " Edad: " + resultado.getInt("edad"));

                sentenciaSQL.close();
                return usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método que obtiene un usuario por email
     *
     * @param email email del usuario a buscar
     * @return objeto usuario encontrado
     */
    @Override
    public Usuario obtenerPorEmail(String email) {

        try {
            String sqlQuery = "SELECT id, email, password, nombre, edad FROM usuario WHERE email = ?";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("email"),
                        resultado.getString("password"),
                        resultado.getString("nombre"),
                        resultado.getInt("edad"));
                sentenciaSQL.close();
                return usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Metodo que devuelve todos los objetos encontrados dentro de la tabla
     *
     * @return una coleccion de usuarios
     */
    @Override
    public List<Usuario> obtenerTodos() {

        try {

            String sqlQuery = "SELECT * FROM usuario";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            ResultSet resultado = sentenciaSQL.executeQuery();
            List<Usuario> lista = new ArrayList<Usuario>();

            while (resultado.next()) {

                System.out.println("Id: " + resultado.getInt("id") + " Nombre: " + resultado.getString("nombre") + " Email: " + resultado.getString("email"
                        + "Edad: " + resultado.getInt("edad")));

                lista.add(new Usuario(resultado.getInt("id"), resultado.getString("email"), resultado.getString("password"), resultado.getString("nombre"), resultado.getInt("edad")));

            }
            sentenciaSQL.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método que modifica por ID todos campos alterados en un usuario con
     * coincidencia en id.
     *
     * @param id id del usuario a modificar
     * @param email nuevo email
     * @param password nueva contraseña
     * @param nombre nuevo nombre
     * @param edad nueva edad
     * @return nuevo objeto usuario modificado
     */
    @Override
    public Usuario modificarPorId(int id, String email, String password, String nombre, int edad) {

        try {

            String sqlQuery = "UPDATE usuario SET email=?,password=?,nombre=?,edad=? WHERE id=?";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(2, password);
            sentenciaSQL.setString(3, nombre);
            sentenciaSQL.setInt(4, edad);
            sentenciaSQL.setInt(5, id);

            sentenciaSQL.executeUpdate();
            System.out.println("El usuario ha sido actualizado por id");

            Usuario usuario = new Usuario(id, email, password, nombre, edad);
            sentenciaSQL.close();

            return usuario;

        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Método que modifica un usuario ya existente con los datos de un nuevo
     * usario
     *
     * @param usuarioNuevosDatos el nuevo usuario
     * @return retorna el usuario modificado
     */
    @Override
    public Usuario modificar(Usuario usuarioNuevosDatos) {

        try {

            String sqlQuery = "UPDATE usuario SET email=?,password=?,nombre=?,edad=? WHERE id=?";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, usuarioNuevosDatos.getEmail());
            sentenciaSQL.setString(2, usuarioNuevosDatos.getPassword());
            sentenciaSQL.setString(3, usuarioNuevosDatos.getNombre());
            sentenciaSQL.setInt(4, usuarioNuevosDatos.getEdad());
            sentenciaSQL.setInt(5, usuarioNuevosDatos.getId());

            sentenciaSQL.executeUpdate();

            System.out.println("El usuario ha sido actualizado por usuario");

            Usuario usuario = new Usuario(usuarioNuevosDatos.getId(), usuarioNuevosDatos.getEmail(), usuarioNuevosDatos.getPassword(), usuarioNuevosDatos.getNombre(), usuarioNuevosDatos.getEdad());
            sentenciaSQL.close();
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * Método que elimina un usuario en la tabla buscado por su id
     *
     * @param id el id del usuario a eliminar
     * @return booleano que confirma si se ha borrado
     */
    @Override
    public boolean eliminarPorId(int id) {

        try {
            String sqlQuery = "DELETE  FROM usuario WHERE id=?";
            PreparedStatement sentenciaSQL = con.prepareStatement(sqlQuery);
            sentenciaSQL.setInt(1, id);
            sentenciaSQL.executeUpdate();

            System.out.println("El usuario ha sido eliminado");
            sentenciaSQL.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
