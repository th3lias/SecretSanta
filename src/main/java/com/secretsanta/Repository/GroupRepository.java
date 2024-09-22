package com.secretsanta.Repository;

import com.secretsanta.Entity.Impl.Group;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GroupRepository extends ReactiveMongoRepository<Group, String> {
}
