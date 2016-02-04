package org.dcharm.learn.gradle.lambda;

/**
 * Created by wangqiang on 2016/2/2.
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("=== RunnableTest ===");

        final int x;

        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("hello one");
            }
        };

        Runnable r2 = () -> System.out.println("hello two");
        r1.run();
        r2.run();

        int y = 9;
        if(y < 4) {
            x = Integer.parseInt("2");
            System.out.println(x);
        }
    }
}
