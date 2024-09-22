package com.secretsanta.Repository;

import com.secretsanta.Entity.Impl.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Flux<User> findAllBy(Pageable pageable);
}
