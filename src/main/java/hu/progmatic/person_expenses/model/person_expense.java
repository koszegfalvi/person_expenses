package hu.progmatic.person_expenses.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class person_expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonManagedReference
    private Person person;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    @JsonManagedReference
    private Expense expense;
}
