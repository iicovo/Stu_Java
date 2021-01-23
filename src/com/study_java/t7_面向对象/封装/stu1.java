package com.study_java.t7_面向对象.封装;

public class stu1 {

}


class Person {
    //private关键字：私有访问修饰符是最严格的访问级别，所以被声明为 private 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 private。
    //Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。

    private int age; //隐藏 外部不能直接调用 只能在本类中使用

    public void ShowAge() {
        System.out.println("年龄：" + age);
    }

    public void Judge(int n) {
        if (n >= 0 && n <= 150) {
            age = n;
        } else {
            System.out.println("年龄：" + n + "不在0~150之间。");
        }
    }
}
