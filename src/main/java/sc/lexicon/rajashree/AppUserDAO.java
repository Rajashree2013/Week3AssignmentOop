package sc.lexicon.rajashree;


import java.util.List;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    List findAll();
    boolean remove(String username);
}
