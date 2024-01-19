package myjunit;

import myjunit.result.TestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite 패턴, Composite 역할
 */
public class TestSuite implements Test {
    private static final Logger logger = LoggerFactory.getLogger(TestSuite.class);
    private List<TestCase> testCases = new ArrayList<>();

    @Override
    public void run(TestResult result) {
        for (TestCase testCase : this.testCases) {
            logger.info("{} : input to testCases ", testCase.getTestCaseName());
            testCase.run(result);
        }
    }

    public void addTestCase(TestCase testCase) {
        this.testCases.add(testCase);
    }
}
