package com.test.chain;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class SensitiveFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Sensitive Word", "sw");
    }
}
