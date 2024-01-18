package myjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public abstract class TestCase {
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    protected String testCaseName;

    public TestCase(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    // Template Method Pattern
    public void run() {
        before();
        runTestCase();
        after();
    }

    protected void before() {}

    private void runTestCase() {
        try {
            logger.info("{} execute ", testCaseName);
            Method method = this.getClass().getMethod(testCaseName);
            method.invoke(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void after() {}
}
