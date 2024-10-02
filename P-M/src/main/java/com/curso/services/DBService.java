package com.curso.services;

import com.curso.domains.Medico;
import com.curso.domains.Paciente;
import com.curso.repositories.MedicoRepository;
import com.curso.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {
    @Autowired
    private PacienteRepository pacienteRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

        Paciente paciente01 = new Paciente(0, "Carlos", LocalDate.now(), new BigDecimal("750.00"));
        Paciente paciente02 = new Paciente(0, "Alberto", LocalDate.now(), new BigDecimal("750.00"));
        Paciente paciente03 = new Paciente(0, "Paulo", LocalDate.now(), new BigDecimal("750.00"));

        Medico medico01 = new Medico(0, "Roberto", LocalDate.now(), new BigDecimal("20000.00"));
        Medico medico02 = new Medico(0, "Eduardo", LocalDate.now(), new BigDecimal("18000.00"));
        Medico medico03 = new Medico(0, "Pedro", LocalDate.now(), new BigDecimal("30000.00"));

        pacienteRepo.save(paciente01);
        pacienteRepo.save(paciente02);
        pacienteRepo.save(paciente03);

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);

    }

}
