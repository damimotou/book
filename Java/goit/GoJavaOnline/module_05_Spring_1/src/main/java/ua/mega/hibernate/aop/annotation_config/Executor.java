package ua.mega.hibernate.aop.annotation_config;

import java.util.List;

public interface Executor<T> {

    void addTask(Task<? extends T> task);

    void addTask(Task<? extends T> task, Validator<? super T> validator);

    void execute();

    List<T> getValidResults();

    List<T> getInvalidResults();
}
