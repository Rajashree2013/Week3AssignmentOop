package sc.lexicon.rajashree.dao.impl;

import sc.lexicon.rajashree.dao.AppUserDAO;
import sc.lexicon.rajashree.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDAOCollection implements AppUserDAO {

    private List<AppUser> appUserList = new ArrayList<>();

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser is null");
        if (findByUsername(appUser.getUsername()) != null)
            throw new IllegalArgumentException("A Appuser with name " + appUser.getUsername() + " already exists");
        if (appUserList == null) throw new IllegalArgumentException("student list is null");
            appUserList.add(appUser);
            return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username is null");
        for (AppUser element : appUserList) {
            if (element.getUsername().equals(username)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List findAll() {
        return appUserList;
    }

    @Override
    public boolean remove(String username) {
        AppUser toRemove = findByUsername(username);
        if (toRemove != null) {
            appUserList.remove(username);
            return true;
        }
        return false;
    }

}
