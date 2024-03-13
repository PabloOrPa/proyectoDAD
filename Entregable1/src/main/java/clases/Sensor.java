package clases;

import java.sql.Timestamp;
import java.util.Objects;

public class Sensor {
	
	// En esta clase vamos a modelar un LDR
	
	private String id;		// Para distinguir uno de otro
	private float luminosidad;	// Dato registrado
	private long timestamp;
	
	private int id_gen = 0;

	public Sensor() {
		super();
		this.id = "LDR_" + id_gen;
		id_gen++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getLuminosidad() {
		return luminosidad;
	}

	public void setLuminosidad(int luminosidad) {
		this.luminosidad = luminosidad;
	}
	
	public long getTimestamp() {
		
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		long t = ts.getTime();
		this.timestamp = t;
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
		Sensor other = (Sensor) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "El Sensor " + id + " está detectando una luminosidad de: " + luminosidad;
	}

	

	
	
	
}
