package ch.tekh.javasignal.web.com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ComV1MessageRequest}
 *
 * @author thomas pauli | tekh.ch
 */
public class ComV1MessageRequest {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private ComType type;

    @JsonProperty("message")
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComType getType() {
        return type;
    }

    public void setType(ComType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
