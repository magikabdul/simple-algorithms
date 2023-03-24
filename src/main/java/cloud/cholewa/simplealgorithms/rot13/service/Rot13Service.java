package cloud.cholewa.simplealgorithms.rot13.service;

import cloud.cholewa.simplealgorithms.rot13.model.DecodeReply;
import cloud.cholewa.simplealgorithms.rot13.model.EncodeReply;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@Slf4j
class Rot13Service implements Rot13Facade {

    @Override
    public Mono<ResponseEntity<EncodeReply>> encode(String input) {
        log.info("Rot13Service.encode({})", input);
        return Mono.just(ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build());
    }

    @Override
    public Mono<ResponseEntity<DecodeReply>> decode(String input) {
        log.info("Rot13Service.decode({})", input);
        return Mono.just(ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build());
    }
}
