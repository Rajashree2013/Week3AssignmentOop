package sc.lexicon.rajashree.dao.impl;

import sc.lexicon.rajashree.dao.TodoItemDAO;
import sc.lexicon.rajashree.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO {

    private List<TodoItem> todoItemList = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("appUser is null");
        if (findById(String.valueOf(todoItem.getId())) != null)
            throw new IllegalArgumentException("TodoItem  already exists");
        if (todoItemList == null) throw new IllegalArgumentException("student list is null");
        todoItemList.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(String Id) {

        if (Id == null) throw new IllegalArgumentException("id is null");
        for (TodoItem element : todoItemList) {
            if(element.getId() == Integer.valueOf(Id)){
                return element;
            }
        }

        return null;
    }

    @Override
    public List findAll() {
        return todoItemList;
    }

    @Override
    public List findAllByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public List findByTitleContains(String title) {
        return null;
    }

    @Override
    public List findByPersonId(String personId) {
        return null;
    }

    @Override
    public List findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public List findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }
}
