package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodExceptReturnMagazineAdvice: Log #10");
//    }



//    @Before("execution(public void get*(..))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка получить книгу");
//    }

    @Before("aop.aspect.MyPointcut.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object obj : args){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге:" + ((Book) obj).getName() + " "
                            + myBook.getAuthor() + " " + myBook.getYearOfPublication());
                }
                if(obj instanceof String){
                    System.out.println("Книгу в библитеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование попытка получить книгу/журнал");
        System.out.println("-------------------------------------------------------------------------------------------");
    }


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
