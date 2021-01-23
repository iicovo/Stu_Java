package com.study_java.t3_super;

public class stu_super {
    public static void main(String[] args) {
        Student s1 = new Student("王二");
        s1.ShowName();
    }
}


class People {
    String name;
    int age;
    String sex;

    public People(String name) {
        this.name = name;
    }

    public void ShowName() {
        System.out.println("姓名：" + this.name);
    }
}

class Student extends People {
    public Student(String name) {
        super(name);
    } //调用父类构造器
}