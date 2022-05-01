package sc.lexicon.rajashree;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO{

    private List<Person> personList = new ArrayList<>();

    @Override
    public Person persist(Person person) {

        if (person == null) throw new IllegalArgumentException("student is null");
        if (findByEmail(person.getEmail()) != null)
            throw new IllegalArgumentException("A student with email " + person.getEmail() + " already exists");
        if (personList == null) throw new IllegalArgumentException("student list is null");
        personList.add(person);
        return person;
    }

    @Override
    public Person findById(String Id) {
        if (Id == null) throw new IllegalArgumentException("id is null");
        for (Person element : personList) {
            if(element.getId() == Integer.valueOf(Id)){
                return element;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String emailId) {

        if (emailId == null) throw new IllegalArgumentException("Email Id is null");
        for (Person person : personList) {
            if (person.getEmail().equalsIgnoreCase(emailId)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public boolean remove(String id) {
        Person toRemove = findById(id);
        if (toRemove != null) {
            personList.remove(id);
            return true;
        }
        return false;
    }
}
