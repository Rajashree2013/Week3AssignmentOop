package sc.lexicon.rajashree.dao;

import sc.lexicon.rajashree.model.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);
    TodoItem findById(String Id);
    List<TodoItem> findAll();
    List<TodoItem> findAllByDoneStatus(boolean done);
    List<TodoItem> findByTitleContains(String title);
    List<TodoItem> findByPersonId(String personId);
    List<TodoItem> findByDeadlineBefore(LocalDate date);
    List<TodoItem> findByDeadlineAfter(LocalDate date);
    boolean remove(String id);
}
