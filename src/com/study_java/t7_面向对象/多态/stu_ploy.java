package com.study_java.t7_面向对象.多态;

public class stu_ploy {
    public static void main(String[] args) {

        //编译看左，运行看右
        //传的具体是哪一个类就调用哪一个类的方法。大大提高了程序的可扩展性。

        Animal a1 = new Dog(); //向上转型
        a1.shout();// Dog类方法重写父类方法，覆盖了父类的方法，用父类对象调用子类方法

        Animal a2 = new Cat();
        a2.shout(); // Cat子类方法重写父类方法，覆盖了父类的方法，用父类对象调用子类方法


        Animal a3 = new Cat();
        Cat t1 = (Cat) a3; // 强制转型 Run()方法是子类方法
        t1.Run();

    }
}

// 父类 Animal
class Animal {
    // shout方法
    public void shout() {
        System.out.println("叫了一声！！！");
    }
}

class Dog extends Animal {
    // 重写父类方法
    public void shout() {
        System.out.println("汪汪汪！！！");
    }
}

class Cat extends Animal {
    // 重写父类方法
    public void shout() {
        System.out.println("喵喵喵！！！");
    }

    // 向下转型测试
    public void Run() {
        System.out.println("猫咪跑起来了！");
    }
}
