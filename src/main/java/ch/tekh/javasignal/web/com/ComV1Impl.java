package ch.tekh.javasignal.web.com;

import ch.tekh.javasignal.web.com.dto.ComV1MessageRequest;
import ch.tekh.javasignal.web.com.dto.ComV1MessageResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

/**
 * {@link ComV1Impl}
 *
 * @author thomas pauli | tekh.ch
 */
@Controller
public class ComV1Impl implements ComV1 {

    @Override
    public ResponseEntity<ComV1MessageResponse> message(ComV1MessageRequest request) {
        return null;
    }
}
