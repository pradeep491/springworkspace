package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationDemo {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            //Student s = context.getBean(Student.class);
            Student s = (Student) context.getBean("studentBean");
            s.print();
            String beans[] = context.getBeanDefinitionNames();
            for (String bean : beans) {
                System.out.println(bean);
            }
        }
    }
}
