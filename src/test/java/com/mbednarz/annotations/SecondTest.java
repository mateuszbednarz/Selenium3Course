package com.mbednarz.annotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author mbednarz
 * @created 23/04/2020 - 15:13
 * @project Selenium3Course
 */

/* -- LESSON 129: TestNG - priorytet, grupy oraz zależności między testami -- */
/* -- LESSON 130: TestNG - Data Provider -- */

@Listeners(TestListener.class)
public class SecondTest
{
    @Test(dataProvider = "getData")
    public void firstTest(String username, String password)
    {
        System.out.println("User login test [1]!");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        Assert.assertEquals(1, 2); // próba wywołania fail'a naszego testu
    }

    /*
    @Test
    public void secondTest()
    {
        System.out.println("User login test [2]!");
        System.out.println("Username - second test");
        System.out.println("Password - second test");
    }
    */

    @DataProvider
    public Object[][] getData()
    {
        return new Object[][] {{"test1", "test1"}, {"test2", "test2"}};
    }

    /*
    @Test(dependsOnGroups = ("SFG"), priority = 1)
    public void thirdTest()
    {
        System.out.println("Third test: " + this.getClass().getName());
    }

    @Test(priority = 3)
    public void fourthTest()
    {
        System.out.println("Fourth test: " + this.getClass().getName());
    }
     */
}
