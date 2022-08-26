package com.example.demo3.dao;

import com.example.demo3.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao1 {
    @Select("select * from springbootdb.student where student_id = #{id}")
    @Results(id = "resultMap",value = {
            @Result(id = true,column = "student_id",property = "studentId"),
            @Result(column = "student_name",property = "studentName"),
            @Result(column = "student_age",property = "studentAge"),
            @Result(column = "student_sex",property = "studentSex")
    })
    public Student selectById(Integer id);
}


