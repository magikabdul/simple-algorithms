package cloud.cholewa.simplealgorithms.rot13.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Rot13Config {

    @Bean
    Rot13Facade rot13Service() {
        return new Rot13Service();
    }
}
