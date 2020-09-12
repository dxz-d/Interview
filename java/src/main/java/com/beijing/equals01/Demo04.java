package com.beijing.equals01;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/9/12 23:56
 */
public class Demo04 {

    public static void main(String[] args) {
        Pig pig01 = new Pig();
        pig01.setName("大花");

        Pig pig02 = new Pig();
        pig02.setName("大花");

        if (pig01.equals(pig02)) {
            System.out.println("重写equals()方法，比较两个对象pig01和pig02的内容是否一致");
        }
    }
}
