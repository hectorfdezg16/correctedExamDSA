package edu.upc.dsa.models;

public class Sample {

    //variables iniciales
    //estas variables hay que relacionarlas con las diferentes entidades creadas
    String idSample;
    String idClinic;
    String idUser;
    String idLaboratory;
    String extractionDate;

    //constructor vacio para el JSon
    public Sample() {
    }

    public Sample(String idSample, String idClinic, String idUser, String idLaboratory, String extractionDate) {
        this.idSample = idSample;
        this.idClinic = idClinic;
        this.idUser = idUser;
        this.idLaboratory = idLaboratory;
        this.extractionDate = extractionDate;
    }
}
