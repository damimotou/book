package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World !");
        helloWorld.getMessage();

        //-----------------------------------------------------------

//        You can load various configuration classes as follows:
/*
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class, OtherConfig.class);
        ctx.register(AdditionalConfig.class);
        ctx.refresh();

        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
        */

    }
}
