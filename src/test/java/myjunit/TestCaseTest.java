package myjunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String testCaseName) {
        super(testCaseName);
    }

    private static long base;

    @Override
    public void before() {
        base = 10;
    }

    public void runTest() {
        long sum = 10 + base;
        Assert.assertTrue(sum == 20);
    }

    public void runTestMinus() {
        long minus = 100 - base;
        Assert.assertTrue(minus == 90);
    }

    public static void main(String[] args) {
        new TestCaseTest("runTest").run();
        new TestCaseTest("runTestMinus").run();
    }
}
