package edu.upc.dsa.models;

public class User {

    //variables iniciales
    String idUser;
    String name;
    String lastname;
    String birthDate;
    String health;

    //constructor vacio para el json
    public User() {
    }

    //constructor con los parametros requeridos
    public User(String idUser, String name, String lastname, String birthDate, String health) {
        this.idUser = idUser;
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.health = health;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    //generamos el toString por si hace falta mostrar algun resultado en consola

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", health='" + health + '\'' +
                '}';
    }
}
