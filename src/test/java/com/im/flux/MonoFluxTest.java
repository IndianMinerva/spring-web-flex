package com.im.flux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {
    @Test
    public void monoTest() {
        Mono<String> monoString = Mono.just("Hello");
        monoString.subscribe(System.out::println);
    }

}
