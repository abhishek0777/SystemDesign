package javapractice;

import java.util.Arrays;

class Marker{
    String color;
    Marker(String color){
        this.color = color;
    }
}
public class practice {
//    static StringBuffer buffer = new StringBuffer();
    static  StringBuilder buffer = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                buffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                buffer.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        System.out.println(buffer);
        System.out.println("Length of buffer: " + buffer.length());
    }
}
