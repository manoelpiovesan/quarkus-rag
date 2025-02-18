package io.github.manoelpiovesan.services;


import io.github.manoelpiovesan.clients.EmbedClient;
import io.github.manoelpiovesan.entities.DocumentDTO;
import io.github.manoelpiovesan.entities.EmbedDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * @author Manoel Rodrigues
 */
@ApplicationScoped
public class EmbedService {
    @Inject
    @RestClient
    EmbedClient embedClient;

    /**
     * Get the embedding of a document
     * @param document the document to be embedded
     * @return the embedding of the document
     */
    public float[] getEmbed(String document) {
        DocumentDTO documentDTO = new DocumentDTO(document);
        EmbedDTO response = embedClient.getEmbed(documentDTO);
        System.out.println(response);
        return response.embedding;
    }

}
