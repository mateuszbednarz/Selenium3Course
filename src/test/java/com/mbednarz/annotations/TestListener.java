package com.mbednarz.annotations;

import com.mbednarz.phptravel.helpers.SeleniumHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author mbednarz
 * @created 23/04/2020 - 15:46
 * @project Selenium3Course
 */

/* -- LESSON 131: TestNG - Test Listener -- */

public class TestListener implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("On test start!");
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("On test success!");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("On test failure!");
        SeleniumHelper.takeScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("On test skipped!");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        System.out.println("On test failed but within success percentage!");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result)
    {
        System.out.println("On test failed with timeout!");
    }

    @Override
    public void onStart(ITestContext context)
    {
        System.out.println("On start!");
    }

    @Override
    public void onFinish(ITestContext context)
    {
        System.out.println("On finish!");
    }
}
