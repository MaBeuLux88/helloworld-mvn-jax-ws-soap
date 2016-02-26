package com.maxime.mvnjaxws;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class SampleServiceTest extends TestCase {

    SampleService objUnderTest;

    @Before
    public void setUp() {
        objUnderTest = new SampleService();
    }

    @Test
    public void testSayHello() {
        assertEquals("Hello, junit !", objUnderTest.sayHello("junit"));
    }
}
