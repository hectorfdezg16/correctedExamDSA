package edu.upc.dsa;

import edu.upc.dsa.models.*;

import java.util.*;

public interface Covid19Manager {

    //para empezar crearemos algunos numeros ya
    public static final int L = 3;
    public static final int U = 20;
    public static final int S = 20;


    //lista de muestras procesadas en un laboratorio
    public Queue<Sample> samplesprocessedbyLaboratory(String idLaboratory) throws LaboratoryNotFoundException;
    //aqui implementamos nuevas funciones clase usermanager
    //definimos contrato
    //primero función añadir usuario en principio con todos los parámetros
    public void addUser(String idUser, String name, String lastname, String birthDate, String health);

    //extraer muestra laboratorio
    public Sample getSample(String idSample, String idClinic, String idUser, String idLaboratory, String extractionDate) throws SampleNotFoundException;

    //enviar el laboratorio una muestra de un usuario
    public void sendSample(String idSample,String idUser, String idLaboratory);

    //una vez procesadas se genera un informe asociado a esta muestra
    //el informe lleva positivo/negativo y un comentario
    public void sendInformBySample(String idSample, String idUser, String idLaboratory);

    //numero de usuarios en el sistema
    public int numUsers();

    //mostrar todas las muestras de un usuario procesadas(resultado y contenido)
    public ArrayList<Sample> sampleProcessedByUser(String userId) throws SampleNotFoundException;

    //create Laboratory
    public void addLaboratory(String idLaboratory, String nameLaboratory);

    //limpiamos todas las estructuras de datos
    public void clear();


}
