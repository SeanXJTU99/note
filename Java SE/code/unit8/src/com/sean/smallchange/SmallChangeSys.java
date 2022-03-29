package com.sean.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //菜单的显示和选择，给出对应提示
    public static void main(String[] args) {
        //定义变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //零钱通明细
        //1.数组2.对象3.字符串拼接
        String details = "---------零钱通明细-----------";

        //收益入账
        //定义变量
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式化

        //消费
        //定义变量消费原因
        String note = "";

        //退出确认

        do {
            System.out.println("\n====零钱通菜单=====");
            System.out.println("\t\t1.零钱通明细");
            System.out.println("\t\t2.收益入账");
            System.out.println("\t\t3.消费情况");
            System.out.println("\t\t4.退出系统");
            System.out.print("请选择1-4:");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额");
                    money = scanner.nextDouble();

                    //money 应被校验
                    //找出不合理的情况并给出提示break
                    if (money <= 0) {
                        System.out.println("收益金额需要>0");
                        break;
                    }

                    balance += money;
                    //获取当前日期
                    date = new Date();
                    //收益信息加入details
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date)
                            + "\t" + "余额：" + balance;
                    break;
                case "3":
                    System.out.print("输入消费金额：");
                    money = scanner.nextDouble();

                    //money校验
                    if(money <= 0 || money > balance){
                        System.out.println("消费金额应在0到"+balance);
                        break;
                    }

                    System.out.println("输入消费说明");
                    note = scanner.next();
                    balance -= money;
                    //获取当前日期3
                    date = new Date();
                    //消费信息加入details
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date)
                            + "\t" + "余额：" + balance;
                    break;
                case "4":
                    String choice = "";
                    do {
                        System.out.println("are you sure to quit? y/n");
                        choice = scanner.next();
                    } while (!"y".equals(choice) && !"n".equals(choice));
                    //正确输入y/n退出while后：
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("error, choose again");
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }
}
