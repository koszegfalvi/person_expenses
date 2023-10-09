package hu.progmatic.person_expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person_expenseRepository extends JpaRepository<Person_expense,Long> {
}
