package ua.mega.aop.annotation_config;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component // bean
public class IntegerTaskProvider implements TaskProvider<Integer> {

    private List<Task<Integer>> tasks = new ArrayList<>();

//    @PostConstruct // метод является инициализационным
    public void init() { // init-method="init"
        tasks.add(new AddTask(1, -2));
        tasks.add(new AddTask(1, 2));
        tasks.add(new AddTask(1, -2));
        tasks.add(new AddTask(Integer.MAX_VALUE, 1));
    }

    @Override
    public List<Task<Integer>> getAllTasks() {
        return tasks;
    }
}