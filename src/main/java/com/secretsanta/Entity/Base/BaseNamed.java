package com.secretsanta.Entity.Base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseNamed extends BaseIdentified {
    private String name;
}
