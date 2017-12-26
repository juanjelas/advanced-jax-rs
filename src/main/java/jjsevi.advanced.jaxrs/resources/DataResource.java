package jjsevi.advanced.jaxrs.resources;

import jjsevi.advanced.jaxrs.model.MyDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("date/{dateString}")
public class DataResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRequestedDate(@PathParam("dateString") MyDate dateString){
        return "Got " + dateString.toString();
    }
}
