package bridge_s3;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="CLIENTE")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable=false)
	private int id;
	@Column(nullable=false,length=20)
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
