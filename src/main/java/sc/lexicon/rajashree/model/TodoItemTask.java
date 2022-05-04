package sc.lexicon.rajashree.model;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        setId(id);
        setAssignee(assignee);
        setTodoItem(todoItem);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == 0) {
            throw new IllegalArgumentException("id was zero");
        }
        if (id > 0) {
            this.id = id;
        }
    }
    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        if (assigned == true) {
            throw new IllegalArgumentException("assigned was null");
        }
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem== null) {
            throw new IllegalArgumentException("Todoitem was null");
        }
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        setAssigned(assignee != null);
        // if the person is not null it means that you assigned a task to a perosn then you should change the assigneed to true
    }


    public String getSummary() {
        return "TodoItemTask{" +
                "assigned=" + "" +
                '}';
    }
}
