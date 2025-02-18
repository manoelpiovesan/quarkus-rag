package io.github.manoelpiovesan;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.json.Json;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Map;

/**
 * @author Manoel Rodrigues
 */
@ApplicationScoped
public class EmbedService {
    @Inject
    @RestClient
    EmbedClient embedClient;

    public float[] getEmbed(String document) {
        DocumentDTO documentDTO = new DocumentDTO(document);
        EmbedDTO response = embedClient.getEmbed(documentDTO);
        System.out.println(response);
        return response.embedding;
    }

}
