package sc.lexicon.rajashree;

import java.util.Objects;

public class AppUser {

    private String username;
    private String password;
    private Approle role;//classType variable


    //Constructor
    public AppUser(String username, String password, Approle role) {
        if ((username != null && password != null)) { //Not allowed to be null or empty

            this.username = username;
            this.password = password;
            this.role = role;
        }
//============================================================================================
//Common getters and setters.


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username != null){                  //Not allowed to be null or empty
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password != null){
            this.password = password;

        }
    }

    public Approle getRole() {


        return role;
    }

    public void setRole(Approle role) {

        if(role != null)
        this.role = role;
    }

//=========================================================
//toString() method overridden from Object. Don’t include password.

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }



    //hashCode() method overridden from
    //Object. Don’t include password


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
}





/*
ppUser:
Fields:
• username (private) is a String that acts
as the id of AppUser. Not allowed to be
null. Not allowed to be null or empty.
• password (private) is a String that
contains a password. Not allowed to be
null or empty.
• role (private) contains an enumerated
type marking the AppUser object as
being a ROLE_APP_USER or
ROLE_APP_ADMIN. Not allowed to be
null.

Constructor:
Up to you

Methods:
• Common getters and setters.
• toString() method overridden from
Object. Don’t include password.
• hashCode() method overridden from
Object. Don’t include password.
• equals() method overridden from
Object. Don’t include password
AppRole:
• Have two possible values
• ROLE_APP_USER
• ROLE_APP_ADMIN

 */