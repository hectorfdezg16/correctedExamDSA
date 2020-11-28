package edu.upc.dsa.models;

import java.util.ArrayList;

public class Laboratory {

    String idLaboratory;
    String nameLaboratory;

    ArrayList<Sample> sampleByUser(String idUser) {
        return null;
    }

    ArrayList<Laboratory> avalaibleLaboratory(String idLaboratory) {
        return null;
    }

    //constructor vacio JSON
    public Laboratory() {
    }

    //constructor con parametros asignados


    public Laboratory(String idLaboratory, String nameLaboratory) {
        this.idLaboratory = idLaboratory;
        this.nameLaboratory = nameLaboratory;
    }

    public String getIdLaboratory() {
        return idLaboratory;
    }

    public void setIdLaboratory(String idLaboratory) {
        this.idLaboratory = idLaboratory;
    }

    public String getNameLaboratory() {
        return nameLaboratory;
    }

    public void setNameLaboratory(String nameLaboratory) {
        this.nameLaboratory = nameLaboratory;
    }
}
