package hu.progmatic.person_expenses.service;

import hu.progmatic.person_expenses.model.Person;
import hu.progmatic.person_expenses.repository.ExpenseRepository;
import hu.progmatic.person_expenses.repository.PersonRepository;
import hu.progmatic.person_expenses.repository.Person_expenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Person_ExpenseService {
    private Person_expenseRepository person_expenseRepository;
    private PersonRepository personRepository;
    private ExpenseRepository expenseRepository;

    public  Person_expense newPerson_expense(Person_expense person_expense) {
        return person_expenseRepository.save(person_expense);
    }
    public List<Person_expense> getAllPerson_expenses() {
        return person_expenseRepository.findAll();
    }

}
