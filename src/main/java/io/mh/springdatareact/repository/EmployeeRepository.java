package io.mh.springdatareact.repository;

import io.mh.springdatareact.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
