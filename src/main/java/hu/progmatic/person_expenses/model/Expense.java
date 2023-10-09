package hu.progmatic.person_expenses.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    @Id

    private Long id;
    private Integer where_ID;
    private String where;
    private Integer how_much;
    @OneToMany(mappedBy = "expense")
    @JsonBackReference


    private List<Person> persons;


}
