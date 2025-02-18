package io.github.manoelpiovesan.resources;

import io.github.manoelpiovesan.services.EmbedService;
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

    /**
     * Embed a document
     * @param document the document to be embedded
     * @return the embedding of the document
     */
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response embedResource(String document) {
        return Response.ok(embedService.getEmbed(document)).build();
    }
}
