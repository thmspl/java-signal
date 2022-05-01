package ch.tekh.javasignal.web.com;

import ch.tekh.javasignal.web.com.dto.ComV1MessageRequest;
import ch.tekh.javasignal.web.com.dto.ComV1MessageResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * {@link ComV1}
 *
 * @author thomas pauli | tekh.ch
 */
@RestController
@RequestMapping("/api/v1/com")
public interface ComV1 {

    @RequestMapping(path = "message", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ComV1MessageResponse> message(@RequestBody @Valid ComV1MessageRequest request);
}
