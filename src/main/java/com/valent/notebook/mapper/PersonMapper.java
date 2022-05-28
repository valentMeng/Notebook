package com.valent.notebook.mapper;


import com.valent.notebook.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {

    Person get(Integer id);

    List<Person> list();
}
