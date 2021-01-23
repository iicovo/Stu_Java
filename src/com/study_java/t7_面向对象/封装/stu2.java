package com.study_java.t7_面向对象.封装;

public class stu2 {
    public static void main(String[] args) {
        Person p = new Person();
//      p.age = 18;   int age 是私有的不能直接赋值
        p.Judge(18);
        p.ShowAge();
    }
}
