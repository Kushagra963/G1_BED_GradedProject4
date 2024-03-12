// src/main/java/com/example/employeemanagement/service/RoleServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findByName(name).orElse(null);
    }
}
