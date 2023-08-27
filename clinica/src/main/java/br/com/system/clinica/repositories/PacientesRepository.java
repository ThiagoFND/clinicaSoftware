package br.com.system.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.system.clinica.model.Pacientes;

public interface PacientesRepository extends JpaRepository<Pacientes, Long> {

}
