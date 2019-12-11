package com.springboot.maven.jsp.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Description Book
 *
 * @author aji gojali
 */
@Entity @Data
public class Book {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @NotNull
    private String id;

    @NotNull @NotEmpty @Size(max = 20)
    private String code;

    @NotNull @NotEmpty
    private String name;
}
