package br.com.system.clinica.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.clinica.dto.PacientesDTO;
import br.com.system.clinica.repositories.PacientesRepository;
import br.com.system.clinica.exceptions.ResourceNotFoundException;
import br.com.system.clinica.mapper.DozerMapper;
import br.com.system.clinica.model.Pacientes;
import br.com.system.clinica.repositories.PacientesRepository;

@Service
public class PacientesService {

	private Logger logger = Logger.getLogger(PacientesService.class.getName());

	@Autowired
	PacientesRepository pacientesRepository;

	public PacientesDTO create(PacientesDTO pacientes) {
		logger.info("Creating one person!");
		var entity = DozerMapper.parseObject(pacientes, Pacientes.class);
		var vo = DozerMapper.parseObject(pacientesRepository.save(entity), PacientesDTO.class);
		return vo;
	}

	public List<PacientesDTO> findAll() {
		logger.info("Finding all people!");

		return DozerMapper.parseListObjects(pacientesRepository.findAll(), PacientesDTO.class);
	}

	public PacientesDTO findById(Long id) {
		logger.info("Finding one person!");

		var entity = pacientesRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		return DozerMapper.parseObject(entity, PacientesDTO.class);
	}

	public PacientesDTO update(PacientesDTO pacientes) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		logger.info("Deleting one person!");

		var entity = pacientesRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		pacientesRepository.delete(entity);

	}

}
