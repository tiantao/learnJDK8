package com.tiantao.learn.lambda;


/**
 * expression = (variable) -> action
 * variable: 这是一个变量,一个占位符。像x,y,z,可以是多个变量；
 * action: 这里我称它为action, 这是我们实现的代码逻辑部分,它可以是一行代码也可以是一个代码片段。
 */
public class LearnLambda {



    public static void main(String[] args) {



    }

    /**
     * 能够接收Lambda表达式的参数类型，是一个只包含一个方法的接口。只包含一个方法的接口称之为“函数接口”。
     */
    public void methodInterface(){
        Runnable r = () -> System.out.println("hello");

        Thread t = new Thread(r);

        t.start();

        new Thread(() -> System.out.println("lambda")).start();
    }
}
