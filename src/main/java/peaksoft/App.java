package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println("Эки ссылканын адреси бирби?" + (bean == bean1));

        Cat cat = (Cat) applicationContext.getBean("myCat");
        Cat cat1 = (Cat) applicationContext.getBean("myCat");
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println("Эки ссылканын адреси бирби?" + (cat == cat1));
    }
}
