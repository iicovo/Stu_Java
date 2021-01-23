package com.study_java.t6_static;

public class stu_static {
    public static void main(String[] args) {
        // 不用实例化就能用，则为类变量，否则为实例变量
        Chinese.country = "中国"; //类名.属性 赋公用值


        Chinese c = new Chinese();
        c.name = "xxx";
        c.age = 18;

        Chinese c1 = new Chinese();
        c1.name = "xxx";
        c1.age = 18;

        Chinese c2 = new Chinese();
        c2.name = "xxx";
        c2.age = 18;

        Chinese.test_s(); //类方法
        System.out.println(c.country);
        System.out.println(c1.country);
        System.out.println(c2.country);
    }
}

class Chinese {
    static String country; // 使用static关键字 不用实例化就能用
    String name;
    int age;

    static void test_s() {
        System.out.println("我们都是中国人！！！ //这是一个测试类方法！");
    }
}