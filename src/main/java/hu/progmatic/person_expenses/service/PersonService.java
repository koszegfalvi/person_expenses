package hu.progmatic.person_expenses.service;

import hu.progmatic.person_expenses.model.Person;
import hu.progmatic.person_expenses.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepository personRepository;


    public Person addNewPerson(Person person) {
        return personRepository.save(person);
    }


    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void modifyName(Long id, String newName) {
        getPersonById(id).setName(newName);
    }
    public void modifyBirthplace(Long id, String newBirthplace) {
        getPersonById(id).setBirthplace(newBirthplace);
    }
    public void modifyBirthdate(Long id, Date newBirthdate) {
        getPersonById(id).setBirthdate(newBirthdate);
    }
    public void modifyEmail(Long id, String newEmail) {
        getPersonById(id).setEmail(newEmail);
    }
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}

