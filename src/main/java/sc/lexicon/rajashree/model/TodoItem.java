package sc.lexicon.rajashree.model;

import java.time.LocalDate;
import java.util.Objects;


public class TodoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;


    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {

        setId(id);
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadLine (deadLine);
        setDone(done);
        setCreator(creator);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        if(id == 0){
            throw new IllegalArgumentException("id was zero");
        }
         this.id = id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("title was null");
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
        if (deadLine == null) {
            throw new IllegalArgumentException("deadLine was null");
        }
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
        if (done == false) {
            throw new IllegalArgumentException("done was false");
        }
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

}
