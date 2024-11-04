package com.sistema.examenes.sistemaexamenesbacken.Services.Implements;

import com.sistema.examenes.sistemaexamenesbacken.Entities.User;
import com.sistema.examenes.sistemaexamenesbacken.Entities.UserRol;
import com.sistema.examenes.sistemaexamenesbacken.Repositories.RoleRepository;
import com.sistema.examenes.sistemaexamenesbacken.Repositories.UserRepository;
import com.sistema.examenes.sistemaexamenesbacken.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Optional<User> saveUser(User user, Set<UserRol> userRoles) throws Exception {
        User newUser = userRepository.findByUsername(user.getUsername());
        if (newUser!=null){
            System.out.println("El usurious ya exist en la base de datos");
            throw new Exception("El usurious ya exist en la base de datos");
        }
        else {
            for (UserRol userRol : userRoles) {
                roleRepository.save(userRol.getRol());
            }
            user.getUserRoles().addAll(userRoles);
            newUser = userRepository.save(user);
        }

        return Optional.of(newUser);
    }

    @Override
    public Optional<User> obtenerUser(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
