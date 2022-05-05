package sc.lexicon.rajashree.dao;

import sc.lexicon.rajashree.model.TodoItem;
import sc.lexicon.rajashree.model.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItem findById(String Id);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findByAssignedStatus(String status);
    List<TodoItemTask> findByPersonId(String personId);
    void remove(String id);
}
