package org.sid;

import java.util.stream.Stream;

import org.sid.dao.EtudiantRepository;
import org.sid.dao.FormationRepository;
import org.sid.dao.SalleRepository;
import org.sid.entities.Etudiant;
import org.sid.entities.Formation;
import org.sid.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceApplication implements CommandLineRunner{
    
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Stream.of("Java","JEE","oracle").forEach(nf ->{
			formationRepository.save(new Formation(null,nf,1,null));
		});
		
		etudiantRepository.save(new Etudiant(1L,"BELKATI","Samir",new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(2L,"BELKATI","Aylane",new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(3L,"BELKATI","Dida",new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(2L,"BELKATI","Amer",new Formation(1L,null,0,null)));
		etudiantRepository.save(new Etudiant(3L,"BELKATI","Boualem",new Formation(1L,null,0,null)));
		

		
		Stream.of("Salle1","Salle2","Salle3","Salle4").forEach(sale ->{
			salleRepository.save(new Salle(null,sale));
		});
		
		formationRepository.findAll().forEach(f -> {
			System.out.println(f.getNom());
		});
		
		salleRepository.findAll().forEach(f -> {
			System.out.println(f.getNom());
		});
		
		
	}
}
