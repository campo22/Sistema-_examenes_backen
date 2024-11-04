package com.sistema.examenes.sistemaexamenesbacken.Repositories;

import com.sistema.examenes.sistemaexamenesbacken.Entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Rol, Long> {
}
