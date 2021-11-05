package com.atguigu.contact;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2021-05-17 0:27
 */
public class ReflectionTest03 {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("data.txt"));
            int i1 = dis.readInt();
            int i2 = dis.readInt();
            int i3 = dis.readInt();
            int i4 = dis.readInt();
            int i5 = dis.readInt();
            System.out.println("5个同学的平均成绩是：" + (i1 + i2 + i3 + i4 + i5) / 5);
            Collection<Integer> list = new TreeSet<>();
            list.add(i1);
            list.add(i2);
            list.add(i3);
            list.add(i4);
            list.add(i5);
//            方式一：
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
//            //方式二：
//            for(Integer i : list){
//                System.out.println(i);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dis != null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
