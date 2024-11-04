package com.sistema.examenes.sistemaexamenesbacken.Controller;

import com.sistema.examenes.sistemaexamenesbacken.Entities.Rol;
import com.sistema.examenes.sistemaexamenesbacken.Entities.User;
import com.sistema.examenes.sistemaexamenesbacken.Entities.UserRol;
import com.sistema.examenes.sistemaexamenesbacken.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) throws Exception {
        Set<UserRol> userRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRol_Id(2L);
        rol.setName("ROLE_USER");

        UserRol userRol = new UserRol();
        userRol.setUser(user);
        userRol.setRol(rol);

        return userService.saveUser(user, userRoles).get();
    }

    @GetMapping("/{username}")
    public User obtenerUser(@PathVariable ("username" ) String username) {
        {
            return userService.obtenerUser(username).get();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable ("id" ) Long id) {
        userService.deleteUser(id);
    }
}
