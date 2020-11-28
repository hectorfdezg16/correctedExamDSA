package edu.upc.dsa;

import edu.upc.dsa.models.User;

public interface UserManager {

    //aqui implementamos nuevas funciones clase usermanager
    //definimos contrato
    //primero función añadir usuario en principio con todos los parámetros
    public User addUser(User u);


    //numero de usuarios en el sistema
    public int numUsers();

    //limpiamos todas las estructuras de datos
    public void clear();


}
