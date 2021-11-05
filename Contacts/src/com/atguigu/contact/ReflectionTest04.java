package com.atguigu.contact;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author shkstart
 * @create 2021-05-16 23:19
 */
public class ReflectionTest04 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream("hello.txt"),true);
            System.setOut(ps);
            int n=5;
            for(int i=0;i<n;i++) {
                for(int m=0;m<i;m++) {
                    System.out.print(" ");
                }
                for (int k=0;k<2*(n-i)-1;k++)
                    System.out.print("*");
                System.out.print("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ps != null){
                ps.close();
            }
        }
    }
}
