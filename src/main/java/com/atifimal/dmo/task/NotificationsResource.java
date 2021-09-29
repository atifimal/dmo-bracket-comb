package com.atifimal.dmo.task;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Path("/ws")
public class NotificationsResource {

    @EJB
    private AppService appService;

    @GET
    @Path("/comb/{number}")
    public Response BracketCombinations(@PathParam("number") int num) throws NamingException {
        return Response.ok().entity(appService.getResult(num))
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }
}