package ch.tekh.javasignal.web.com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ComV1MessageResponse}
 *
 * @author thomas pauli | tekh.ch
 */
public class ComV1MessageResponse {

    @JsonProperty("successful")
    private boolean successful;

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
