package com.acceptance.rest;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class NoOpTest  {


    @Test(priority = -1)
    public void assureGetNoOp() throws Exception {
        assertThat("I need to be second", Counter.getAndRaiseCounter(), is(1));

    }
}
