package lifecycle.factorylifecycle;

import com.test.lifecycle.beanlifcycle.BeanLifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhouguanya
 * @Date 2018/8/19
 * @Description Bean级生命周期 + 容器级生命周期 + 工厂级生命周期测试
 */
public class FactoryLifecycleTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring-chapter2-beanlifecycle.xml"
        ,"classpath:spring-chapter2-containerlifecycle.xml", "classpath:spring-chapter2-factorybeanlifecycle.xml");
        BeanLifecycle beanLifecycle = context.getBean("beanLifecycle",BeanLifecycle.class);
        beanLifecycle.sayHello();
        context.close();
    }
}
