package ca.concordia.soen6841.dbservice.repository;

import com.hrms.soen6841.employee.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<Tax, Integer> {
}
