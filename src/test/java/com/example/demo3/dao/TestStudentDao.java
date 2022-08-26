package com.example.demo3.dao;

import com.example.demo3.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestStudentDao {
    @Autowired
    StudentDao1 studentDao;
    @Test
    public void getById(){
        System.out.println(studentDao.selectById(1));
    }
}
