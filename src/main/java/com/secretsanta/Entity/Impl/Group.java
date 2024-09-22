package com.secretsanta.Entity.Impl;

import com.secretsanta.Entity.Base.BaseNamed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Group extends BaseNamed {
    private List<User> users;
}
