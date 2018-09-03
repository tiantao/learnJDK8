package com.tiantao.learn.lambda;

import org.junit.Test;

public class FunctionInterface2Test {



    @Test
    public void testLambda(){
        func(new FunctionInterface2() {
            @Override
            public void test(int n) {
                System.out.println("hello " + n);
            }
        });

        func((x) -> System.out.println("lambda " + x));
    }


    private void func(FunctionInterface2 functionInterface2){
        functionInterface2.test(1);
    }
}
