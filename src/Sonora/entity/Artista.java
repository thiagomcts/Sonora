package Sonora.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Artista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int aid;
	private String anombre;
	private String agenero;
	
	@ManyToMany(targetEntity=Canciones.class)
	private Set cancionSet;
	
	
	public Artista(int aid, String anombre, String agenero, Set cancionSet) {
		super();
		this.aid = aid;
		this.anombre = anombre;
		this.agenero = agenero;
		this.cancionSet = cancionSet;
	}

	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnombre() {
		return anombre;
	}

	public void setAnombre(String anombre) {
		this.anombre = anombre;
	}

	public String getAgenero() {
		return agenero;
	}

	public void setAgenero(String agenero) {
		this.agenero = agenero;
	}

	public Set getCancionSet() {
		return cancionSet;
	}

	public void setCancionSet(Set cancionSet) {
		this.cancionSet = cancionSet;
	}

	@Override
	public String toString() {
		return "Artista [aid=" + aid + ", anombre=" + anombre + ", agenero=" + agenero + ", cancionSet=" + cancionSet
				+ "]";
	}
	
}
