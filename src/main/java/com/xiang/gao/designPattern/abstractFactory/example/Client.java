package com.xiang.gao.designPattern.abstractFactory.example;

/**
 * @author Administrator
 * @crdate 2017-10-18 15:22
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory abstractFactory = new InterFactory();

        computerEngineer.makeComputer(abstractFactory);
    }

}
