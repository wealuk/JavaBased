package com.atguigu.contact;

import java.io.*;

/**
 * @author shkstart
 * @create 2021-05-16 23:19
 */
public class ReflectionTest02 {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        BufferedReader bos = null;
        try {
            //数据流传输成绩
            dos = new DataOutputStream(new FileOutputStream("data.txt"));
            //从控制台获取成绩
            bos = new BufferedReader(new InputStreamReader(System.in));

            //
            for(int i = 0;i < 5;i++){
                System.out.println("请输入第" + (i+1) + "个同学的成绩：");
                Integer integer = Integer.valueOf(bos.readLine());
                if(integer < 0 || integer > 100){
                    throw new Exception("输入的数据不在指定范围内(0 ~ 100)！");
                }
                dos.writeInt(integer);
            }
            System.out.println(new File("data.txt").getAbsolutePath());
            System.out.println("所有成绩以存入data.txt");
        }catch(NumberFormatException e){
            System.out.println("你输入的不是整数！");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            if(dos != null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
