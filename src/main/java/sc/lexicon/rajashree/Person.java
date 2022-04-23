package sc.lexicon.rajashree;

import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credential;//Add an AppUser object to the fields called credentials



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
//Create getter and setter for AppUser
    public AppUser getCredential() {
        return credential;
    }

    public void setCredential(AppUser credential) {
        this.credential = credential;
    }


    public String getSummary() {   //Replace getSummary() with toString() method that don’t print out credentials.

        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;     //Override equals and hashcode from Object. Exclude credentials from both.
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) && lastName.equals(person.lastName) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}