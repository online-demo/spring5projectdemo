package ioc.constructor;

import com.test.ioc.xml.Deliverable;
import com.test.ioc.xml.Speakable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试XML方式的IoC
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-chapter2.xml")
public class XmlTest {
    //Spring 容器注入依赖的Speakable对象
    @Autowired
    private Speakable speakable;
    //Spring 容器注入依赖的Deliverable对象
    @Autowired
    private Deliverable deliverable;
    @Test
    public void test() {
        speakable.say();
        deliverable.delivery();
    }
}
