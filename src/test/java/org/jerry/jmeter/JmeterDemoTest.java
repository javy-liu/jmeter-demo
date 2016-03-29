package org.jerry.jmeter;

import org.junit.Test;

/**
 * @author liuzhenyuan
 * @version Last modified 16/3/29
 */
public class JmeterDemoTest {

    private int i = 0;

    @Test
    public void test01() throws Exception {
        for (int j = 0; j < 100; j++) {
            System.out.println(i++);
        }
    }
}
