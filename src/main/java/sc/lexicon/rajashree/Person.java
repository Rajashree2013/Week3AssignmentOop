package sc.lexicon.rajashree;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;


    public Person(int id, String firstName, String lastName, String email) {

        if((firstName != null && lastName != null && email != null) && (id>0)){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >0){
            this.id = id;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null){
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null){
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null){
            this.email = email;
        }
    }


    public String getSummary() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }




}