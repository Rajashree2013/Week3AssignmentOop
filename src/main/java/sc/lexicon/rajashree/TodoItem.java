package sc.lexicon.rajashree;

import java.time.LocalDate;
import java.util.Objects;


public class TodoItem {
    String title;
    String taskDescription;
    LocalDate deadLine;
    boolean done;
    Person creator;
    private int id;


    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        if (title != null) {

        }
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        LocalDate date = LocalDate.now();
        if (deadLine != null) {
            if (date.isBefore(deadLine)) {
                this.deadLine = deadLine;
            }
        }
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }




    public boolean isOverdue(LocalDate deadLine) {
        boolean bol = false;
        LocalDate curentdate = LocalDate.now();
        if (curentdate.isBefore(deadLine)) {
            bol = true;
        }
        return bol;
    }
//toString() all fields except Person object(s)
    @Override
    public String toString() {
        return "TodoItem{" +
                "title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", id=" + id +
                '}';
    }
//)
//• equals() & hashCode() all fields except Person objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;       //
        if (!(o instanceof TodoItem)) return false;
        TodoItem todoItem = (TodoItem) o;
        return done == todoItem.done && id == todoItem.id && title.equals(todoItem.title) && taskDescription.equals(todoItem.taskDescription) && deadLine.equals(todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, taskDescription, deadLine, done, id);
    }
}
