// src/main/java/com/example/employeemanagement/service/EmployeeServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);

        if (existingEmployee.isPresent()) {
            Employee employee = existingEmployee.get();
            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setLastName(updatedEmployee.getLastName());
            employee.setEmail(updatedEmployee.getEmail());

            return employeeRepository.save(employee);
        }

        return null; // Handle appropriately based on your application's logic
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> searchEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }
}
