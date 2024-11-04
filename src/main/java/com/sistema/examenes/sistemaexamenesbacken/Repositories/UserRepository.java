package com.sistema.examenes.sistemaexamenesbacken.Repositories;

import com.sistema.examenes.sistemaexamenesbacken.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
