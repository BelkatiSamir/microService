package org.sid.webRest;

import java.util.List;

import org.sid.dao.EtudiantRepository;
import org.sid.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@RestController
public class EtudiantRestController {
	 
		@Autowired
		private EtudiantRepository etudiantRepository;
		
		@GetMapping("/etudiants")
		public List<Etudiant> list(){
			return etudiantRepository.findAll();
		}
		
		@GetMapping("/etudiants/{id}")
		public Etudiant getOne(@PathVariable(name="id") Long id){
			return etudiantRepository.findOne(id);
		}
		
		@PostMapping("/etudiants")
		public Etudiant save(@RequestBody Etudiant etudiant){
			return etudiantRepository.save(etudiant);
		}
		
		@PutMapping("/etudiants/{id}")
		public Etudiant update(@PathVariable(value="id") Long id,@RequestBody Etudiant etudiant){
			etudiant.setId(id);
			return etudiantRepository.save(etudiant);
		}
		
		@DeleteMapping("/etudiants/{id}")
		public void delete(@PathVariable(value="id") Long id){
			 etudiantRepository.delete(id);
		}
		
}
