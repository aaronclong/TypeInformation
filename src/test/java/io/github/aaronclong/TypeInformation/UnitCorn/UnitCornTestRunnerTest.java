package io.github.aaronclong.TypeInformation.UnitCorn;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by aaronlong on 5/4/17.
 */
public class UnitCornTestRunnerTest {
    @Test
    public void runTestUnitTest() {
        try {
            Class stubUnitTest = Class.forName("io.github.aaronclong.TypeInformation.UnitCorn.StubUnitTest");
            UnitCornTestRunner unitCorn = new UnitCornTestRunner();
           Assert.assertEquals("FAIL", unitCorn.runTest(stubUnitTest, "failBecauseOfBoolean"));
        } catch (Exception e) {
            Assert.fail("Method test fail " + e.getMessage());
        }
    }
}
