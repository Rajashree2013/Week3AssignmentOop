package sc.lexicon.rajashree;

import java.time.LocalDate;

public class App {



    public static void main(String[] args) {
        // todo: run the app

        AppUser appUser1 = new AppUser("Rajashree","1234",Approle.ROLE_APP_USER);
        AppUser appUser2 = new AppUser("Dillip","1234",Approle.ROLE_APP_ADMIN);

        // instantiate two persons
        Person rajashree = new Person(1, "rajashre", "Bhuyan","raj.gmail",appUser1);
        Person dillip = new Person(3, "Dillip", "Nayak","nayak.gmail",appUser2);


        // instantiate two todoitem
        TodoItem todoItem1= new TodoItem(1,"SE","IT Software",LocalDate.parse("2022-02-27"),false,rajashree);
        TodoItem todoItem2= new TodoItem(1,"SE","IT Software",LocalDate.parse("2022-02-27"),false,dillip);


        // instantiate one todoitemtask
        TodoItemTask todoItemTask1 = new TodoItemTask(1,todoItem1,rajashree);
        TodoItemTask todoItemTask2 = new TodoItemTask(2,todoItem2,dillip);

        if(todoItemTask1.isAssigned()){
            todoItemTask1.setTodoItem(todoItem1);
        }else{
            System.out.println("Tas is invalid!");
        }









       // TodoItemTask task5= new TodoItemTask(7," n1 "," "   );

    }
}
