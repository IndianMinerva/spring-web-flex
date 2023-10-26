package com.im.flux.service;

import com.im.flux.model.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class CustomerService {

    public Flux<Customer> getAllCustomers() {
        return Flux.range(1, 10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("Count : " + i))
                .doOnComplete(() -> System.out.println("-------------------DONE-----------------"))
                .map(i -> new Customer(i, "name" + i)).onBackpressureBuffer(4);
    }
}
