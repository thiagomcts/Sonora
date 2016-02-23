package Sonora.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Canciones {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int cid;
	private String cnombre;
	private int creproducciones;
	private int cdescargas;
	
	@ManyToMany(targetEntity=Artista.class)
	private Set cancionSet;
	

	public Canciones(int cid, String cnombre, int creproducciones, int cdescargas, Set cancionSet) {
		super();
		this.cid = cid;
		this.cnombre = cnombre;
		this.creproducciones = creproducciones;
		this.cdescargas = cdescargas;
		this.cancionSet = cancionSet;
	}

	public Canciones() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCnombre() {
		return cnombre;
	}

	public void setCnombre(String cnombre) {
		this.cnombre = cnombre;
	}

	public int getCreproducciones() {
		return creproducciones;
	}

	public void setCreproducciones(int creproducciones) {
		this.creproducciones = creproducciones;
	}

	public int getCdescargas() {
		return cdescargas;
	}

	public void setCdescargas(int cdescargas) {
		this.cdescargas = cdescargas;
	}

	public Set getCancionSet() {
		return cancionSet;
	}

	public void setCancionSet(Set cancionSet) {
		this.cancionSet = cancionSet;
	}

	
}
