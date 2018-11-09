package com.test.resttemplate;

/**
 * @Author zhouguanya
 * @Date 2018/11/8
 * @Description 使用RestTemplate测试接口
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
//获取Spring上下文环境
@ContextConfiguration(locations = {
        "classpath*:chapter7.xml"})
public class RestTemplateTest {
    @Autowired
    RestTemplate restTemplate;
    /**
     * 测试currentDate接口
     */
    @Test
    public void testCurrentDate() {
        ResponseEntity<String> responseEntity = restTemplate
                .getForEntity("http://localhost:8080/date/currentDate", String.class);
        if (responseEntity.getStatusCodeValue() == 200) {
            System.out.println(responseEntity.getBody());
        }
    }
}
