package ioc.annotation;

import com.test.ioc.annotation.HomeWork;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试注解方式的IoC
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-chapter2.xml")
public class AnnotationTest {
    @Autowired
    private HomeWork homeWork;
    //Spring 容器注入依赖的Deliverable对象
    @Test
    public void test() {
        homeWork.doHomeWork();
    }
}
