package com.test.chain;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class PrivacyFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Privacy Word", "pw");
    }
}
