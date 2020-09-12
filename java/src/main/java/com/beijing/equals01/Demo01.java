package com.beijing.equals01;

// https://www.cnblogs.com/9coding/p/11933768.html
/**
 * @description  1.==和equals()的区别
 * 当a,b是基本数据类型，==运算符比较基本类型的值
 * @author diaoxiuze
 * @date 2020/9/12 23:21
 */
public class Demo01 {

    private static int a = 100;
    private static int b = 100;

    public static void main(String[] args) {
        if (a == b) {
            System.out.println("因为a,b是基本类型，所以此时比较的是a，b的值");
        }
    }
}
