package com.sean.encap;

/*
Account 姓名（2-4）、余额>20 密码6位  不满足时给出默认值
        set 赋值
AccountTest中测试
 */
public class Account {
    //为了封装，全部私有
    private String name;
    private  double balance;
    private  String pwd;

    //显示信息
    public void showInfo(){
        System.out.println("name = " + name + "\nbalance="
                + balance+ "\npwd ="+ pwd);
    }

    //提供两个构造器，一般是无参和三参数


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {//  姓名（2-4）
        if(name.length()>=2 && name.length()<=4) {
            this.name = name;
        }else{
            System.out.println("name 2-4");
            this.name = "default";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {//余额>20
        if(balance>20){
        this.balance = balance;}
        else{
            System.out.println("balance>20, default = 0.0");
            this.balance = 0.0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {//密码6位
        if(pwd.length() == 6) {
            this.pwd = pwd;
        }else{
            System.out.println("password should 6,default = 000000");
            this.pwd = "000000";
        }
    }
}
