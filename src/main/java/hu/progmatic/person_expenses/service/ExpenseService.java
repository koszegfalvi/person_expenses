package hu.progmatic.person_expenses.service;

import hu.progmatic.person_expenses.model.Expense;
import hu.progmatic.person_expenses.model.Person;
import hu.progmatic.person_expenses.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseService {
    private ExpenseRepository expenseRepository;

    public Expense newExpense(Expense expense ){
        return expenseRepository.save(expense);
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

}
