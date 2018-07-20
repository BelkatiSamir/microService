package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable{
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 @Id
 @GeneratedValue
 private Long id;
 @Column(name="nom")
 private String nom;
 @Column(name="prenom")
 private String prenom;
 
 @ManyToOne
 private Formation formation;
 
 
 
}
