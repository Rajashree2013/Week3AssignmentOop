package sc.lexicon.rajashree;

import java.util.List;

public interface PersonDAO {
    Person persist(Person person);
    Person findById(String Id);
    Person findByEmail(String emailId);
    List findAll();
    boolean remove(String id);
}
