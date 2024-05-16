package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SingletonBean sbean1 = context.getBean(SingletonBean.class);
        System.out.println(sbean1.hashCode());
        SingletonBean sbean2 = context.getBean(SingletonBean.class);
        System.out.println(sbean2.hashCode());
        SingletonBean sbean3 = context.getBean(SingletonBean.class);
        System.out.println(sbean3.hashCode());

        PrototypeBean pbean1 = context.getBean(PrototypeBean.class);
        System.out.println(pbean1.hashCode());
        PrototypeBean pbean2 = context.getBean(PrototypeBean.class);
        System.out.println(pbean2.hashCode());
        PrototypeBean pbean3 = context.getBean(PrototypeBean.class);
        System.out.println(pbean3.hashCode());
    }
}
