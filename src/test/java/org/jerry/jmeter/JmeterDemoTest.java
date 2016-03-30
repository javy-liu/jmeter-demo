package org.jerry.jmeter;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author liuzhenyuan
 * @version Last modified 16/3/29
 */
public class JmeterDemoTest {
    private static Logger log = Logger.getLogger(JmeterDemoTest.class.getName());

    private int i = 0;

//    public JmeterDemoTest() {
//
//    }
//
//    public JmeterDemoTest(String label) {
//
//    }

    @Test
    public void test01() throws Exception {
        for (int j = 0; j < 10; j++) {
            log.warning("=======================");
            System.out.println(i++);
            System.out.println("===================");
            Thread.sleep(100);
        }
    }


}
