package com.yyn.jichuyufa;

/**
 * Created by 小北的小贝壳 on 2019/2/16.
 * 继承
 在Java中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。

 利用继承的方法，可以重用已存在类的方法和属性，而不用重写这些代码。被继承的类称为超类（super class），派生类称为子类（subclass）。
 */

class Vehicle {
    public String name;
    public void toStr() {
        System.out.println("小花是小狗");
    }
}

class Car extends Vehicle {

}

public class ExtendsTest {
    public static void main(String[] str) {
        Car a = new Car();
        a.toStr();


        Vehicle bbb=new Vehicle();
        bbb.name="eee";
        bbb.toStr();
        System.out.println(bbb.name);

        Math.abs(33);
    }
}
