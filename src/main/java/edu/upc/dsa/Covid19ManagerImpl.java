package edu.upc.dsa;

import edu.upc.dsa.models.*;
import org.apache.log4j.Logger;

import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager {

    //llamamos al fichero de propiedades log4j
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    //implementamos la fachada como Singleton
    private static Covid19Manager instance;

    //aqui pondremos nuestro contenedor de laboratorios
    private Laboratory[] containerLaboratory;

    //lista encadenada muestras de usuario-lista encadenada de muestras
    private LinkedList<Sample> samplesUser;

    //nos falta implementar la cola de muestras procesadas
    //ya que no lo podemos hacer como pila
    //lo ultimo que entra es lo utlimo en salir
    Queue <Sample> processedSamples;

    //inicializamos la matriz de usuarios
    private HashMap<String, User> users;

    //inicializamos numeros de cada entidad
    //no se si los utilizaré
    private int numSamples;
    private int numLaboratories;

    //aqui estableceremos la lista de muestras pendientes de procesar
    //lo propongo como una estructura de datos de cola


    //constructor privado vacio de momento
    private Covid19ManagerImpl() {

        numSamples = 0;
        containerLaboratory = new Laboratory[L];
        samplesUser = new LinkedList<>();
        users = new HashMap<>();

    }

    //aqui implementamos el singleton
    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    @Override
    public Queue<Sample> samplesprocessedbyLaboratory(String idLaboratory) throws LaboratoryNotFoundException {
        return null;
    }

    //funcion que implementa el contrato UserManager
    //función añadir usuario
    //Add a new User
    public void addUser(String idUser, String name, String lastname, String birthDate, String health){
            this.users.put(idUser, new User(idUser, name, lastname, birthDate, health));
    }

    //implementamos todos los otros metodos

    @Override
    public Sample getSample(String idSample, String idClinic, String idUser, String idLaboratory, String extractionDate) throws SampleNotFoundException {
        return null;
    }

    @Override
    public void sendSample(String idSample, String idUser, String idLaboratory) {

    }

    @Override
    public void sendInformBySample(String idSample, String idUser, String idLaboratory) {

    }

    @Override
    public int numUsers() {
        return 0;
    }

    @Override
    public ArrayList<Sample> sampleProcessedByUser(String userId) throws SampleNotFoundException {
        return null;
    }

    @Override
    public void addLaboratory(String idLaboratory, String nameLaboratory) {

    }

    @Override
    public void clear() {
            instance=null;
            containerLaboratory=null;
            containerLaboratory = new Laboratory[L];
            samplesUser.clear();
            users.clear();
    }

}
