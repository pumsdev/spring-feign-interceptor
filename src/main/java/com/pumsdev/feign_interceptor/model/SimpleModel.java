package com.pumsdev.feign_interceptor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SimpleModel {
    private String name;
    private String username;
    @JsonIgnore
    private String unknowName;
}
