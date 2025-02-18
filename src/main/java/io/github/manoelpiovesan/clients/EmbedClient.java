package io.github.manoelpiovesan.clients;

import io.github.manoelpiovesan.entities.DocumentDTO;
import io.github.manoelpiovesan.entities.EmbedDTO;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * @author Manoel Rodrigues
 */
@RegisterRestClient(baseUri = "http://localhost:5005")
public interface EmbedClient {

    /**
     * Make a POST request to the Embedding service
     * @param documentDTO
     * @return
     */
    @POST
    @Path("/embed")
    EmbedDTO getEmbed(DocumentDTO documentDTO);

}
