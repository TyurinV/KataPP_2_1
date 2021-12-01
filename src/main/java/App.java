import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld - " + (bean == beanTwo));

        //сравниваем 2 хелоуворлда по ссылке
        Cat beanOneCat = (Cat) applicationContext.getBean("cat");
        Cat beanTwoCat = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat - " + (beanOneCat == beanTwoCat));
    }
}