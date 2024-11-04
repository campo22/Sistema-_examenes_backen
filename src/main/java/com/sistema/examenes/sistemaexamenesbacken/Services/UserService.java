package com.sistema.examenes.sistemaexamenesbacken.Services;

import com.sistema.examenes.sistemaexamenesbacken.Entities.User;
import com.sistema.examenes.sistemaexamenesbacken.Entities.UserRol;

import java.util.Optional;
import java.util.Set;

public interface UserService {

    Optional <User> saveUser(User user, Set<UserRol> userRoles)  throws Exception;

    Optional <User> obtenerUser(String username);

    public void deleteUser(Long id);

}
