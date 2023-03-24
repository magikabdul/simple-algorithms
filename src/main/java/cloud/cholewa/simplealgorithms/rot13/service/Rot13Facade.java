package cloud.cholewa.simplealgorithms.rot13.service;

import cloud.cholewa.simplealgorithms.rot13.model.DecodeReply;
import cloud.cholewa.simplealgorithms.rot13.model.EncodeReply;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

public interface Rot13Facade {
    Mono<ResponseEntity<EncodeReply>> encode(String input);

    Mono<ResponseEntity<DecodeReply>> decode(String input);
}
