package cloud.cholewa.simplealgorithms.rot13.api;

import cloud.cholewa.simplealgorithms.rot13.model.DecodeReply;
import cloud.cholewa.simplealgorithms.rot13.model.EncodeReply;
import cloud.cholewa.simplealgorithms.rot13.service.Rot13Facade;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("rot13")
@RequiredArgsConstructor
class Rot13Controller {

    private final Rot13Facade rot13Facade;

    @GetMapping(value = "encode/{text}")
    Mono<ResponseEntity<EncodeReply>> rot13Encode(@Valid @PathVariable String text) {
        return rot13Facade.encode(text);
    }

    @GetMapping(value = "decode/{text}")
    Mono<ResponseEntity<DecodeReply>> rot13Decode(@Valid @PathVariable String text) {
        return rot13Facade.decode(text);
    }
}
