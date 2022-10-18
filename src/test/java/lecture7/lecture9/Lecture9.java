package lecture7.lecture9;

import org.testng.annotations.*;

public class Lecture9 {

    @BeforeTest(groups = "test9")
    public void beforeTest() {
        System.out.println("hi , beforetest");
    }

    @BeforeMethod(groups = "test9")
    public void  beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @BeforeSuite(groups = "test9")
    public  void beforeSuite(){
        System.out.println("beforeSuit");
    }

    @BeforeGroups(groups = "test9")
    public  void beforeGroups(){
        System.out.println("beforeGroup");
    }

    @Test(groups = "test9")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = "test9")
    public void test2(){
        System.out.println("test2");
    }

    @AfterTest(groups = "test9")
    public void afterTest(){
        System.out.println("afterTest");
    }

    @AfterGroups(groups = "test9")
    public void afterGroups(){
        System.out.println("afterGroups");
    }

    @AfterClass(groups = "test9")
    public void afterClass(){
        System.out.println("afterClass");
    }

    @AfterMethod(groups = "test9")
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @AfterSuite(groups = "test9")
    public void afterSuite(){
        System.out.println("afterSuite");
    }


}
