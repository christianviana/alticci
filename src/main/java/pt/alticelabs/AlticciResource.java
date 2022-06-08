package pt.alticelabs;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/alticci")
public class AlticciResource {
	
	@Inject
    AlticciService alticciService;

    @GET
    @Path("{n}")
    public Long get(@PathParam("n") Long n) {
        return alticciService.alticci(n);
    }

    

}