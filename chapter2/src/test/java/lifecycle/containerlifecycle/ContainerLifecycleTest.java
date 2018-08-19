package lifecycle.containerlifecycle;

import com.test.lifecycle.beanlifcycle.BeanLifecycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author zhouguanya
 * @Date 2018/8/19
 * @Description 容器级生命周期测试
 */
public class ContainerLifecycleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-beanlifecycle.xml",
                "classpath:spring-chapter2-containerlifecycle.xml");
        BeanLifecycle beanLifecycle = context.getBean("beanLifecycle",BeanLifecycle.class);
        beanLifecycle.sayHello();
        context.close();
    }
}
