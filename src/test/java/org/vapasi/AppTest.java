package org.vapasi;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeTest
    public void beforeTest(){
        System.out.println("This is Before test");
    }
    @BeforeMethod
    public void loginMethod(){
        System.out.println("This is before method");
    }
    @Test
    public void testMethod(){
        System.out.println("Running test here !!");
        int a=10;
        int b=20;
        Assert.assertEquals(testSum(10,20),(a+b));

    }

    public int testSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    @Test
    public void assertTrue(){
       int sum1= testSum(20,30);
        Assert.assertTrue(sum1==50);
    }

    @Test
    public void assertFail(){
        int sum2 = testSum(20,5);
        Assert.assertFalse(sum2==25,"condition not met");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is After test");
    }
}
