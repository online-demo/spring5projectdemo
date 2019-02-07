package com.test.chain;

/**
 * @Author: zhouguanya
 * @Date: 2019/02/07
 * @Description:
 */
public class DirtyFilter extends AbstractFilter {
    @Override
    protected String doFilter(String content) {
        return content.replace("Dirty Word","dw");
    }
}
