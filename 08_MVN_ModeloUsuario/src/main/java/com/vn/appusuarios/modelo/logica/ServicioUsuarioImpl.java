/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.logica;

import com.vn.appusuarios.modelo.Usuario;
import com.vn.appusuarios.modelo.dao.DaoUsuario;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Equipo 5
 */
public class ServicioUsuarioImpl implements ServicioUsuario {

    DaoUsuario dao = new DaoUsuario();

    /**
     * Método que valida la id, debe ser mayor o igual a un caracter
     *
     * @param id la id a validar
     * @return el valor del texto parseado en int
     */
    public int validarId(String id) {
        if (id.length() >= 1) {
            return Integer.parseInt(id);
        }
        return -1;
    }

    /**
     * Método que valida el nombre, debe cumplir que tenga entre 1 y 50
     * caracteres
     *
     * @param nombre el nombre a validar
     * @return retorna un booleano en true si ha sido validado
     */
    public boolean validarNombre(String nombre) {
        if (nombre.length() > 1 && nombre.length() <= 50) {
            return true;
        }
        return false;
    }

    /**
     * Valida que el email tenga entre 1 y 255 caracteres y comprueba con una
     * expresion regular que se trate de un email.
     *
     * @param email el email a validar
     * @return retorna un booleano en true si ha sido validado
     */
    public boolean validarEmail(String email) {
        if (email.length() > 1 && email.length() <= 255 && Pattern.matches("^(.+)@(.+)$", email)) {
            return true;
        }
        return false;
    }

    /**
     * Método que valida una contraseña, debe tener más de 4 caracteres y menos
     * de 50.
     *
     * @param password la contraseña a validar
     * @return retorna un booleano en true si ha sido validado
     */
    public boolean validarPassword(String password) {
        if (password.length() >= 4 && password.length() <= 50) {
            return true;
        }
        return false;
    }

    /**
     * Método que valida la edad del usuario, debe tener más de 12 años.
     *
     * @param edad la edad a validar
     * @return retorna un booleano en true si ha sido validado
     */
    public boolean validarEdad(String edad) {
        if (Integer.parseInt(edad) > 12) {
            return true;
        }
        return false;
    }

    /**
     * Método que crea un usuario tras validar los datos nuevos
     *
     * @param email email del usuario nuevo
     * @param password contraseña del usuario nuevo
     * @param nombre nombre del usuario nuevo
     * @param edad edad del usuario nuevo
     * @return retorna un objeto usuario con los datos recibidos
     */
    @Override
    public Usuario crear(String email, String password, String nombre, String edad) {
        if (validarEmail(email) && validarPassword(password) && validarNombre(nombre) && validarEdad(edad) && (obtenerPorEmail(email) == null)) {
            return dao.crear(email, password, nombre, Integer.parseInt(edad));
        }
        return null;
    }

    /**
     * Método que obtiene un objeto usuario tras validar su id.
     *
     * @param id la id por la que se buscará el usuario
     * @return un objeto usuario
     */
    @Override
    public Usuario obtenerPorId(String id) {
        int i = validarId(id);
        if (i > 0) {
            return dao.obtenerPorId(i);
        }
        return null;
    }

    /**
     * Método que obtiene un objeto usuario por email tras ser validado
     *
     * @param email el email del usuario a buscar
     * @return retorna un obejto usuario encontrado
     */
    @Override
    public Usuario obtenerPorEmail(String email) {
        if (validarEmail(email)) {
            return dao.obtenerPorEmail(email);
        }
        return null;
    }

    /**
     * Retorna la coleccion de usuarios
     *
     * @return una coleccion de usuarios encontrados
     */
    @Override
    public List<Usuario> obtenerTodos() {
        return dao.obtenerTodos();
    }

    /**
     * Método que modifica por ID y valida todos los campos a crear y que el
     * email no exista o que si existe se corresponda a la id a modificar .
     *
     * @param id id a validar del usuario
     * @param email email a validar del usuario
     * @param password contraseña a validar del usuario
     * @param nombre nombre a validar del usuario
     * @param edad edad a validar del usuario
     * @return retorna el usuario modificado tras ser validado
     */
    @Override
    public Usuario modificarPorId(String id, String email, String password, String nombre, String edad) {
        int i = validarId(id);
        if (validarEmail(email) && validarPassword(password)
                && validarNombre(nombre) && validarEdad(edad) && i > 0
                && ((obtenerPorEmail(email) == null) || (i == obtenerPorEmail(email).getId()))) {
            return dao.modificarPorId(i, email, password, nombre, Integer.parseInt(edad));
        }
        return null;
    }

    /**
     * Método que modifica el usuario con los datos de un nuevo usuario creado.
     *
     * @param usuarioNuevosDatos el objeto usuario que será modificado
     * @return el nuevo usuario modificado
     */
    @Override
    public Usuario modificar(Usuario usuarioNuevosDatos) {
        return dao.modificar(usuarioNuevosDatos);
    }

    /**
     * Método que valida la id para eliminar un usuario
     *
     * @param id la id a validar
     * @return booleano que confirma el borrado
     */
    @Override
    public boolean eliminarPorId(String id) {
        int i = validarId(id);
        if (i > 0) {
            return dao.eliminarPorId(i);
        }
        return false;
    }
}
