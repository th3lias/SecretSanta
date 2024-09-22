package com.secretsanta.Entity.Base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class BaseIdentified {
    @Id String id;
}
