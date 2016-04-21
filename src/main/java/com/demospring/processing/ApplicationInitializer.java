package com.demospring.processing;

import com.demospring.processing.parsetextfile.ParseTextFile;
import com.demospring.processing.starter.Starter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ApplicationInitializer {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationInitializer.class, args);
        Starter starter = applicationContext.getBean(Starter.class);
        starter.showParsedRecords();
    }
}
