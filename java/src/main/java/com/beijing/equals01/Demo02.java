package com.beijing.equals01;

/**
 * @description  当==是引用类型，那么==运算符比较的是引用类型的对象地址值
 * @author diaoxiuze
 * @date 2020/9/12 23:37
 */
public class Demo02 {

    private static String a = "china";
    private static String b = "china";

    public static void main(String[] args) {
        if (a == b) {
            System.out.println("因为a,b是引用类型，所以此时比较的是对象a，b的地址值");
        }
    }
}
