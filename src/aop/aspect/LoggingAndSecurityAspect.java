package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: Log #10");
    }



//    @Before("execution(public void get*(..))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethod(){
//
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethod()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }
//
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary(){    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary(){    }
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary(){}
//
//
//
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }








}
