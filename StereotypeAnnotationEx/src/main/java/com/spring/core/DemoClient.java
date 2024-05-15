package com.spring.core;

import com.spring.core.controller.DemoController;
import com.spring.core.repository.DemoRepository;
import com.spring.core.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController demo = context.getBean(DemoController.class);
        System.out.println(demo.hello());

        DemoService service = context.getBean(DemoService.class);
        System.out.println(service.hello());

        DemoRepository repo = context.getBean(DemoRepository.class);
        System.out.println(repo.hello());
    }
}
