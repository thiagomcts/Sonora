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
	
	private String anombre;
	private String agenero;
	
	@ManyToMany(targetEntity=Canciones.class)
	private Set artistaSet;
	
	public Artista(String anombre, String agenero, Set artistaSet) {
		super();
		this.anombre = anombre;
		this.agenero = agenero;
		this.artistaSet = artistaSet;
	}
	
	public Artista() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set getArtistaSet() {
		return artistaSet;
	}

	public void setArtistaSet(Set artistaSet) {
		this.artistaSet = artistaSet;
	}
	
	
}
