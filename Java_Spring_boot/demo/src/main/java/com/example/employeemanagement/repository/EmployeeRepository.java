// src/main/java/com/example/employeemanagement/repository/EmployeeRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstName(String firstName);
}
