package com.gzf.demo.proxy;

public class Client {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        Pursuit zhuojiayi = new Pursuit(jiaojiao);
        zhuojiayi.GiveChocolate();
        zhuojiayi.GiveDolls();
        zhuojiayi.GiveFlowers();
    }
}
