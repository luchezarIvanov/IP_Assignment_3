package bg.elsys.ip.rest;

import java.util.List;

import javax.ws.rs.Consumes;
//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class with the handler functions
 * @author Lachezar Ivanov
 * @version 1.0
 */
@Path("/planes")
public class PlaneResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPlanes() {
		List<Plane> planeList = PlaneList.getInstance().getPlaneList();
		return Response.ok(planeList).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addPlane(Plane plane) {
		List<Plane> temp = PlaneList.getInstance().getPlaneList();
		temp.add(plane);
		PlaneList.getInstance().setPlaneList(temp);
		return Response.ok(temp).build();
	}
}