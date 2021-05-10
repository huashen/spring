package org.springframework.self.aop;

/**
 * TestBean
 *
 * @author longhuashen
 * @since 2021-05-10
 */
public class TestBean {

    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test() {
        System.out.println("test");
    }
}
