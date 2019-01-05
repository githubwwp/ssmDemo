package springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import project.servicenter.db.AbcService;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AbcService abcService = (AbcService) ac.getBean("abcService");
        System.out.println(abcService);
    }

}
