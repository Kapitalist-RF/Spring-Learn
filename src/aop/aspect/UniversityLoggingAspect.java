package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student fst = students.get(0);
//        String nameS = fst.getNameAndSurname();
//        nameS = "Mr. " + nameS;
//        fst.setNameAndSurname(nameS);
//        fst.setAvgGrade(fst.getAvgGrade() + 5);
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){

        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения" +
                exception);
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное окончание работы метода или выброс исключения");
    }





}
