package com.bdqn.concurrent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 死锁测试
 */
@SpringBootTest
public class DeadLock {
    private static final Object HAIR_A = new Object();
    private static final Object HAIR_B = new Object();

    @Test
    public void testDeadLock(){
        new Thread(()->{
            synchronized (HAIR_A) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (HAIR_B) {
                    System.out.println("A成功的抓住B的头发");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (HAIR_B) {
                synchronized (HAIR_A) {
                    System.out.println("B成功抓到A的头发");
                }
            }
        }).start();
    }

}
