package lecture7.lecture9;

import org.testng.annotations.Test;

public class Lecture9one {
    @Test(enabled = false)
    public void test1(){
        System.out.println("hi, test1");
    }

    @Test(timeOut = 1000)
    public void test2(){
        System.out.println("hi, test2");
    }

    private void pause(long timeout){
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

