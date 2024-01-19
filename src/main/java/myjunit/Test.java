package myjunit;

import myjunit.result.TestResult;

/**
 * Composite 패턴, Component 역할
 */
public interface Test {
    void run(TestResult testResult);
}
