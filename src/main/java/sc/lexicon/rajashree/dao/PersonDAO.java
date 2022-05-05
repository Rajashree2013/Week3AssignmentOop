package sc.lexicon.rajashree.dao;

import sc.lexicon.rajashree.model.Person;

import java.util.List;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(String Id);
    Person findByEmail(String emailId);
    List<Person> findAll();
    boolean remove(String id);
}
