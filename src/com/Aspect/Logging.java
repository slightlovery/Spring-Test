package com.Aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* com.Aspect.*.*(..))")
    private void selectAll(){

    }
    @Before("selectAll()")
    private void beforeAdvice(){
        
    }

}
