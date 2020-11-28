package edu.upc.dsa.services;


import edu.upc.dsa.Covid19Manager;
import edu.upc.dsa.Covid19ManagerImpl;
import edu.upc.dsa.models.Laboratory;
import edu.upc.dsa.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@Api(value = "/Covid", description = "Endpoint to Text Service")
@Path("Covid")
public class CovidService {

    private Covid19Manager c19;


    public CovidService() {
        this.c19 = Covid19ManagerImpl.getInstance();
    }

    //hacemos el post de un user /añadimos un usuario al servicio
    //y le damos una respuesta correcta al haberlo añadido
    @POST
    @ApiOperation(value = "add user", notes = "x")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful")
    })

    @Path("/adduser")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User u) {
        String idUser = u.getIdUser();
        String name = u.getName();
        String lastname = u.getLastname();
        String birthdate = u.getBirthDate();
        String health = u.getHealth();
        this.c19.addUser(idUser, name, lastname, birthdate, health);

        return Response.status(201).build();
    }

    //añadimos también un laboratorio al servicio con un post
    @POST
    @ApiOperation(value = "add laboratory", notes = "x")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful")
    })
    @Path("/addlaboratory")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addLaboratory(Laboratory lab) {
        String idLaboratory = lab.getIdLaboratory();
        String nameLaboratory = lab.getNameLaboratory();
        this.c19.addLaboratory(idLaboratory, nameLaboratory);

        return Response.status(201).build();
    }

}
