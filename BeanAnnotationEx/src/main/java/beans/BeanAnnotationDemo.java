package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Student s = context.getBean(Student.class);
        Student s = (Student) context.getBean("studentBean1");
        s.print();
        String beans[] = context.getBeanDefinitionNames();
        for(String bean:beans){
            System.out.println(bean);
        }
    }
}
