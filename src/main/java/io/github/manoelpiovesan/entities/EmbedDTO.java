package io.github.manoelpiovesan.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Manoel Rodrigues
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbedDTO {
    public float[] embedding;

    /**
     * Constructor
     *
     * @param embedding the embedding of the document
     */
    public EmbedDTO(float[] embedding) {
        this.embedding = embedding;
    }
}
