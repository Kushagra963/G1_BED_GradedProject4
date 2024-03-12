// src/main/java/com/example/employeemanagement/controller/RoleController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @GetMapping("/{name}")
    public Role getRoleByName(@PathVariable String name) {
        return roleService.findRoleByName(name);
    }
}
