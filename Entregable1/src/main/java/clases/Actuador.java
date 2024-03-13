package clases;

import java.util.Objects;

public class Actuador {
	
	// En esta clase vamos a modelar un led:
	
	private String id;
	private Boolean encendido;
	
	private int id_gen = 0;
	
	public Actuador() {
		super();
		this.id = "LED_" + id_gen;
		id_gen++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Actuador other = (Actuador) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return encendido?
				"El led " + id + " está encendido":
				"El led " + id + " está apagado";
	}
	
	
	
}
