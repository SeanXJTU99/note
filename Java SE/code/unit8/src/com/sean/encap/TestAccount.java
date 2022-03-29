package com.sean.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(6);
        account.setPwd("123456");
        account.showInfo();
    }
}
