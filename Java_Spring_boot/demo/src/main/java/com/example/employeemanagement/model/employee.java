// src/main/java/com/example/employeemanagement/model/Employee.java

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    // getters and setters
    // Implement them based on your IDE or manually
}
