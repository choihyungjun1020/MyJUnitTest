package myjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestResult {
    public static final Logger logger = LoggerFactory.getLogger(TestResult.class);
    private int runTestCount;

    public TestResult() {
        this.runTestCount = 0;
    }

    /**
     * synchronized: 하나의 TestResult 인스턴스를 여러 테스트 케이스에서 사용하게 될 경우
     * 쓰레드 동기화 문제가 발생하므로 여기선 synchronized 로 간단하게 해결.
     * (테스트 케이스에서만 사용하므로 실시간 성능 이슈를 고려하지 않아도 되기 때문)
     */
    public synchronized void startTest() {
        this.runTestCount++;
    }

    public void printCount() {
        logger.info("Total Test Count: {}", runTestCount);
    }
}
