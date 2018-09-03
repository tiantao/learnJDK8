package com.tiantao.learn.lambda;

import org.junit.Test;

public class FunctionInterface3Test {




    @Test
    public void testLambda(){
        func(str -> {
            System.out.println("hello");
            return str.toUpperCase();
        });
    }



    private void func(FunctionInterface3 functionInterface3){
        String str = functionInterface3.test("abc");
        System.out.println(str);
    }




}
