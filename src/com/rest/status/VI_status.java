package com.rest.status;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/VI/status")
public class VI_status {
	private static final String version = "0.0.1";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<h1><p> Java Web Service</p></h1>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<h1><p> Version :</p></h1>" + version;
	}

}
