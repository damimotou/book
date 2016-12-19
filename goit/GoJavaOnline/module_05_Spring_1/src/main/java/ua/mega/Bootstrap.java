package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

    private TaskProvider<Integer> taskProvider;
    private Executor<Integer> executor;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml"); // создаем appContext
        Bootstrap bootstrap = applicationContext.getBean("bootstrap", Bootstrap.class); // берем у контекста, созданный Контейнером инстанс

        bootstrap.execute();
    }

    public void execute() {
        taskProvider.getAllTasks().forEach(executor::addTask);
        executor.execute();

        System.out.println("Valid results:");
        executor.getInvalidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        executor.getValidResults().forEach(System.out::println);
    }

    public void setTaskProvider(TaskProvider<Integer> taskProvider) {
        this.taskProvider = taskProvider;
    }

    public void setExecutor(Executor<Integer> executor) {
        this.executor = executor;
    }
}