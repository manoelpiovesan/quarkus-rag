package io.github.manoelpiovesan;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author Manoel Rodrigues
 */

@Path("/embed")
public class EmbedResource {

    @Inject
    EmbedService embedService;

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response embedResource(String document) {
        return Response.ok(embedService.getEmbed(document)).build();
    }
}
