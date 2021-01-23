package com.study_java.t2_this;

public class stu_this {
    public static void main(String[] args) {

    }
}

class People {
    public People() {
    }

    public People(int age) {
        this(); // this()调用 本类构造器
        this.age = age;
    }

    public People(int age, String name) {
        this(18); // 调用重名带参数构造器
        this.name = name;
    }

    int age;
    String name;

}