package com.bl.IPLAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class IPLAnalyserTest {
    @Test
    public void name() {
        IPLAnalyser iplAnalyser = new IPLAnalyser();
        Assert.assertTrue(iplAnalyser.printWelcome());

    }
}
