package com.yulang.entity;

import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class User implements Serializable {
    @NotBlank
    private String pkid;
    @Length(min = 0,max = 500)
    private String name;
    @NotEmpty
    private Integer age;
}
