package com.study_java.t5_abstract;

public class stu_abstract {
    public static void main(String[] args) {
        // People p = new People();//报错
        People p = new Student();
        p.name = "张三";
    }
}


//抽象类
abstract class People {
    String name;

    //抽象方法
    abstract void eat();

    abstract void sleep();

}

class Student extends People {

    public void eat() {
    }

    public void sleep() {
    }
}