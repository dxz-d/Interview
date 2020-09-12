package com.beijing.equals01;

/**
 * @description  默认情况下，equals()方法比较的是对象与自身是否一致。
 * 当对象与自身一致时，equals()方法与==是一样的。
 * @author diaoxiuze
 * @date 2020/9/12 23:50
 */
public class Demo03 {

    private static String a = "hello,word!";
    private static String b = "hello,word!";

    public static void main(String[] args) {
        if (a == b) {
            System.out.println("因为a,b是引用类型，所以此时比较的是对象a,b的地址值");
        }
    }
}
