package com.hello;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testGetHelloWorld() {
        HelloWorldService helloWorldService = new HelloWorldService();
        String helloWorld = helloWorldService.getHelloWorld();
        assert helloWorld != null;
        assert !helloWorld.isEmpty();
    }
}