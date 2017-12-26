package jjsevi.advanced.jaxrs.resources;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class MyResource {

    @PathParam("pathParam") private String pathParamExample;
    @QueryParam("query") private String queryParamExample;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
        return "Path param used " + pathParamExample + " and Query param used " + queryParamExample;
    }
}
