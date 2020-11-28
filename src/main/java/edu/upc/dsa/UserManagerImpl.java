package edu.upc.dsa;

import edu.upc.dsa.models.User;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.LinkedList;

public class UserManagerImpl implements UserManager{

    //llamamos al fichero de propiedades log4j
    final static Logger logger = Logger.getLogger(UserManagerImpl.class);

    //implementamos la fachada como Singleton
    private static UserManager instance;

    //lista encadenada muestras de usuario-lista encadenada de muestras
    private LinkedList<User> samplesUser;

    //inicializamos la matriz de usuarios
    private HashMap<String, User> users;

    //constructor privado vacio de momento
    private UserManagerImpl() {
    }

    //aqui implementamos el singleton
    public static UserManager getInstance() {
        if (instance==null) instance = new UserManagerImpl();
        return instance;
    }

    //funcion que implementa el contrato UserManager
    //función añadir usuario
    //Add a new User
    public void addUser(String idUser, String name, String lastname, String birthDate, String health){
        this.users.put(idUser, new User(idUser, name, lastname, birthDate, health));
    }

    @Override
    public User addUser(User u) {
        return null;
    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public void clear() {

    }

    //aqui mostraremos el id del user
    /*@JsonIgnore
    @ApiModelProperty(hidden = true)
    public String getUserId() {
        return this.idUser;
    }*/



}
