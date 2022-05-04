package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {

    // @Select("SELECT id, name, country FROM city WHERE id = #{id}")
    City findById(long id);
}
