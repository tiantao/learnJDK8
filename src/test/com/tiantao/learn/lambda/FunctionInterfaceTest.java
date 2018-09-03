package com.tiantao.learn.lambda;

import org.junit.Test;

public class FunctionInterfaceTest {


    private void func(FunctionInterface functionInterface){
        functionInterface.test();
    }


    @Test
    public void testLambda(){

        func(new FunctionInterface() {
            @Override
            public void test() {
                System.out.println("hello test!");
            }
        });

        func(() -> System.out.println("hello lambda!"));
    }

}
