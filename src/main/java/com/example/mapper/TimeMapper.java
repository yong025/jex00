package com.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

public interface TimeMapper {


    @Select("select now()")
    String getTime();


}
