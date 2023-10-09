package hu.progmatic.person_expenses.controller;

import hu.progmatic.person_expenses.service.ExpenseService;
import hu.progmatic.person_expenses.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class Person_expenseController {

   private Person_expenseService person_expenseService
   private PersonService personService;
   private ExpenseService expenseService;

    @GetMapping("/person_expenses")
    public String getAllPerson_expenses(Model model) {
        model.addAttribute("person_expenses", person_expenseService.getAllPerson_expenses());
        return "booking/bookings";
    }

}
