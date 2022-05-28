package com.valent.notebook.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
public class Person {

    // @Value("Rick")
    String name;

    // @Value("21")
    Integer height;

    Date birth;

    Integer order;

}
