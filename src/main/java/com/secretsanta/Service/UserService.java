package com.secretsanta.Service;

import com.secretsanta.Entity.Impl.User;
import com.secretsanta.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public Flux<User> findAll(PageRequest pageRequest) {
        return repository.findAllBy(pageRequest);
    }

    public Mono<User> create(User user) {
        return repository.save(user);
    }
}
