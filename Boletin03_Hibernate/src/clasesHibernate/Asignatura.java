package clasesHibernate;

// Generated 18-nov-2015 12:47:59 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Asignatura generated by hbm2java
 */
public class Asignatura implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codAsignatura;
	private String nombre;
	private short horasSemanales;
	private Short horasTotales;
	private Set<Reparto> repartos = new HashSet<Reparto>(0);
	private Set<Horario> horarios = new HashSet<Horario>(0);

	public Asignatura() {
	}

	public Asignatura(String codAsignatura, String nombre, short horasSemanales) {
		this.codAsignatura = codAsignatura;
		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
	}

	public Asignatura(String codAsignatura, String nombre,
			short horasSemanales, Short horasTotales, Set<Reparto> repartos, Set<Horario> horarios) {
		this.codAsignatura = codAsignatura;
		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
		this.horasTotales = horasTotales;
		this.repartos = repartos;
		this.horarios = horarios;
	}

	public String getCodAsignatura() {
		return this.codAsignatura;
	}

	public void setCodAsignatura(String codAsignatura) {
		this.codAsignatura = codAsignatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getHorasSemanales() {
		return this.horasSemanales;
	}

	public void setHorasSemanales(short horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public Short getHorasTotales() {
		return this.horasTotales;
	}

	public void setHorasTotales(Short horasTotales) {
		this.horasTotales = horasTotales;
	}

	public Set<Reparto> getRepartos() {
		return this.repartos;
	}

	public void setRepartos(Set<Reparto> repartos) {
		this.repartos = repartos;
	}

	public Set<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		this.horarios = horarios;
	}

}
