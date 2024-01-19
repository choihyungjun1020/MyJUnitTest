package myjunit;

import myjunit.result.TestResult;

/**
 * Composite 패턴, Component
 */
public interface Test {
    void run(TestResult testResult);
}
