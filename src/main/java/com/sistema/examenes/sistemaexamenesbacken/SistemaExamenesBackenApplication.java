package com.sistema.examenes.sistemaexamenesbacken;

import com.sistema.examenes.sistemaexamenesbacken.Entities.Rol;
import com.sistema.examenes.sistemaexamenesbacken.Entities.User;
import com.sistema.examenes.sistemaexamenesbacken.Entities.UserRol;
import com.sistema.examenes.sistemaexamenesbacken.Repositories.UserRepository;
import com.sistema.examenes.sistemaexamenesbacken.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackenApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SistemaExamenesBackenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       /* User user = new User();
        user.setUsername("camilo");
        user.setName("camilo");
        user.setLastname("diaz");
        user.setEmail("admin@admin");
        user.setPassword("12345");
        user.setProfile("foto.png");

        Rol rol = new Rol();
        rol.setRol_Id(1L);
        rol.setName("ADMIN");

        Set<UserRol> userRoles = new HashSet<>();
        UserRol userRol = new UserRol();
        userRol.setUser(user);
        userRol.setRol(rol);

        userRoles.add(userRol);

        User newUser = userService.saveUser(user, userRoles).get();

        System.out.println(newUser.getUsername());
*/




    }
}
