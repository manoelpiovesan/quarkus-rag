package io.github.manoelpiovesan;

import jakarta.json.JsonObject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Map;

/**
 * @author Manoel Rodrigues
 */
@RegisterRestClient(baseUri = "http://localhost:5005")
public interface EmbedClient {

    @POST
    @Path("/embed")
    EmbedDTO getEmbed(DocumentDTO documentDTO);

}
