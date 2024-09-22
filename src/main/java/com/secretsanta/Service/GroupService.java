package com.secretsanta.Service;

import com.secretsanta.Repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository repository;
}
