package sc.lexicon.rajashree;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);
    TodoItem findById(String Id);
    List findAll();
    List findAllByDoneStatus(boolean done);
    List findByTitleContains(String title);
    List findByPersonId(String personId);
    List findByDeadlineBefore(LocalDate date);
    List findByDeadlineAfter(LocalDate date);
    boolean remove(String id);
}
