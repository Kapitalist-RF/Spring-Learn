package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Dima", book);
        uniLibrary.addMagazine();
//        uniLibrary.getMagazine();

        context.close();


    }

}
