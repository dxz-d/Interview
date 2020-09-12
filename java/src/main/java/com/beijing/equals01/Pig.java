package com.beijing.equals01;

/**
 * @description
 * @author diaoxiuze
 * @date 2020/9/12 23:57
 */
public class Pig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 重写equals()方法，用于比较对象的属性内容是否一致
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object) {
        // 判断对象与自身是否一致
        if (this == object) {
            return true;
        }

        // 判断object与String是否为同类或存在继承关系
        if (object instanceof String) {
            return true;
        }

        // 判断同一类 或者子父类关系，则将Object类型强转为Pig
        Pig pig = (Pig) object;
        // 比较pig属性name的内容是否一致
        if (this.name == pig.name && this.name.equals(pig.name)) {
            return true;
        }else {
            return false;
        }

    }
}
