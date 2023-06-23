package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    
    @Pointcut("execution(* get*())")
    public void allGetMethod(){

    }

}
