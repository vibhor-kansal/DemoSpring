package com.demospring.processing;

import com.demospring.processing.Initializer.AppInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class DemoSpringApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
        AppInitializer appInitializer = applicationContext.getBean(AppInitializer.class);
        appInitializer.showParsedRecords();
    }
}