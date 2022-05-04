package sc.lexicon.rajashree.model;

import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credential;//Add an AppUser object to the fields called credentials


    public Person(int id, String firstName, String lastName, String email) {

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public Person(int id, String firstName, String lastName, String email, AppUser credential) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredential(credential);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // todo: fix it
        if(id == 0){
            throw new IllegalArgumentException("id was zero");
        }
        if (id > 0) {
            this.id = id;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("fn was null");
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        if (lastName == null) {
            throw new IllegalArgumentException("last name was null");
        }
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email  was null");
        }
        this.email = email;
    }


    //Create getter and setter for AppUser
    public AppUser getCredential() {
        return credential;
    }

    public void setCredential(AppUser credential) {

        if (credential == null) {
            throw new IllegalArgumentException("credential was null");
        }
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

    // reformate codes
    // ctrl + alt + L
}