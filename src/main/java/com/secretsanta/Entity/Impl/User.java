package com.secretsanta.Entity.Impl;

import com.secretsanta.Entity.Base.BaseNamed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User extends BaseNamed {
    private String firstName;
    private String lastName;
    private String email;
    private String note;
}
