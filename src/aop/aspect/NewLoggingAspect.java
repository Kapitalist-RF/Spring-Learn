package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


    @Around("execution(String aop.UniLibrary.returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();


        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно возвращают книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод returnBook выполнил работу за: " +
                (end - begin) + " миллисекунд");
        return targetMethodResult;
    }

}
