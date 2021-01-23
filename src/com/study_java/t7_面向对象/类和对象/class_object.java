package com.study_java.t7_面向对象.类和对象;

public class class_object {
    public static void main(String[] args) {

        Person Student = new Person(); //new对象对应 public Person() {}的构造器
        Student.name = "张三";
        Student.age = 18;
        Student.ShowName();
        Student.ShowAge();

        Person student = new Person(19, "王五");//对应带参数的构造器
        student.ShowName();
        student.ShowAge();

    }
}

class Person {

    public Person() {
    }

    public Person(int n, String names) {
        age = n;
        name = names;
    }

    String name;
    int age;
    String sex;
    int tall;

    public void ShowName() {
        System.out.println("姓名：" + name);
    }

    public void ShowAge() {
        System.out.println("年龄：" + age);
    }
}