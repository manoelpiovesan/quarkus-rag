package io.github.manoelpiovesan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Manoel Rodrigues
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbedDTO {
    public float[] embedding;
}
