package sc.lexicon.rajashree.dao.impl;

import sc.lexicon.rajashree.dao.TodoItemTaskDAO;
import sc.lexicon.rajashree.model.TodoItem;
import sc.lexicon.rajashree.model.TodoItemTask;

import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItem findById(String Id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public List findByAssignedStatus(String status) {
        return null;
    }

    @Override
    public List findByPersonId(String personId) {
        return null;
    }

    @Override
    public void remove(String id) {

    }
}
