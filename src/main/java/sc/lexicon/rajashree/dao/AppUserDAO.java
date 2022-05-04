package sc.lexicon.rajashree.dao;


import sc.lexicon.rajashree.model.AppUser;

import java.util.List;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    List findAll();
    boolean remove(String username);
}
