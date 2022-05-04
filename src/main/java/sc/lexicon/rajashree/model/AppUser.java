package sc.lexicon.rajashree.model;

import java.util.Objects;

public class AppUser {

    private String username;
    private String password;
    private AppRole role;//classType variable


    //Constructor
    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    //============================================================================================
    //Common getters and setters.

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username is null");
        this.username = username;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("password is null");
        this.password = password;

    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("role is null");
        this.role = role;
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

//=========================================================
//toString() method overridden from Object. Don’t include password.

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

}
