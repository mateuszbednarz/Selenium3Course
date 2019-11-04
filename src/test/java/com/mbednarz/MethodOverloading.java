package com.mbednarz;

import org.testng.annotations.Test;

public class MethodOverloading
{
    @Test
    public void methodOverloadingTest()
    {
        Select s = new Select();

        s.select(3);
        s.select("Volvo");
    }
}
