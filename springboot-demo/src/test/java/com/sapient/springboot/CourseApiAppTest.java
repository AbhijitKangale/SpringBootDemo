package com.sapient.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sapient.springboot.config.CourseApiApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CourseApiApp.class)
class CourseApiAppTest {

}
