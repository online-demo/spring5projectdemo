package lifecycle.beanlifcycle;

import com.test.lifecycle.beanlifcycle.BeanLifecycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author zhouguanya
 * @Date 2018/8/18
 * @Description Bean生命周期测试
 */
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-chapter2-beanlifecycle.xml")
public class BeanLifecycleTest {
    @Autowired
    private BeanLifecycle beanLifecycle;

    @Test
    public void test() {
        beanLifecycle.sayHello();
    }

}
