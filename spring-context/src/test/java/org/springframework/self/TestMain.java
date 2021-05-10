package org.springframework.self;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.self.aop.TestBean;

/**
 * TestMain
 *
 * @author longhuashen
 * @since 2021-05-10
 */
public class TestMain {

    private static final String CONTEXT = "test/aspectTest.xml";

    @Test
    public void testBean() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{CONTEXT}, getClass());
        TestBean bean = (TestBean) ctx.getBean("test");
        bean.test();
    }
}
