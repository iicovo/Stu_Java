package com.study_java.t1_桌球;


import java.awt.*;
import javax.swing.*;

public class Ball extends JFrame {


    //导入图片
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");

    double x = 220;
    double y = 115;

    double degree = 3.14 / 3; //弧度


    //绘制窗口
    public void paint(Graphics g) {
        System.out.println("窗口被画了一次!");
        setTitle("桌球小游戏！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x += 10 * Math.cos(degree);
        y += 10 * Math.sin(degree);

        //碰到上下边界
        if (y > 300 - 50 - 35 || y < 0 + 40) {
            degree = -degree;
        }
        //碰到左右边界
        if (x > 514 - 50 - 35 || x < 0 + 40) {
            degree = 3.14 - degree;
        }
    }


    //创建窗口
    void launchFrame() {
        setSize(514, 300); //大小

        setLocation(500, 250);  //出现的位置
        setVisible(true);  //可见

        //实现动画,每秒绘制窗口25次
        while (true) {
            repaint();

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("我的小游戏开始了");
        Ball game = new Ball(); //定义一个类
        game.launchFrame(); //调用方法
    }
}
