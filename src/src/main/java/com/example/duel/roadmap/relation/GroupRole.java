package com.example.duel.roadmap.relation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GroupRole {
    ROLE_MEMBER("member"),
    ROLE_MASTER("master"),
    ROLE_MANAGER("manager"),
    ROLE_NONE("none");

    private String value;
}