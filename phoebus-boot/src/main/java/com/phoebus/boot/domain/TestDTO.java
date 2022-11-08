package com.phoebus.boot.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TestDTO {
    private Integer num;
    private String type;

    @NotBlank
    private String userName;
    @NotNull
    @Email
    private String email;

    @NotBlank
    @Length(min = 6, max = 20)
    private String password;
}
