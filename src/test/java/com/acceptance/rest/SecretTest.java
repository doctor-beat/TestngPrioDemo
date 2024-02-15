package com.acceptance.rest;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SecretTest {
    @Test
    public void assureVerifySucceeds() throws Exception {
        assertThat("I want to go first", Counter.getAndRaiseCounter(), is(2));
    }

}
