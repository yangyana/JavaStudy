package com.yyn.yunsuanfu;

/**
 * Created by 小北的小贝壳 on 2019/1/28.
 */
class Vehicle {
}

class Car extends Vehicle {

}

class Student {
}

public class InstanceOf {
    public static void main(String[] args) {
        Vehicle a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);

        Car car = new Car();
        System.out.println(car instanceof Car);//true
        System.out.println(car instanceof Vehicle);//true
//        System.out.println(car instanceof Student);//

    }
}
