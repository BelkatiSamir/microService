package org.sid.dao;

import org.sid.entities.Salle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle, Long>{
 
	public Page<Salle> findByNomContains(@Param("mc") String mc, Pageable pageable);
	
	
	@RestResource(path="/parNom")
	public Page<Salle> findByNomStartsWith(@Param("mc") String mc, Pageable pageable);
}
