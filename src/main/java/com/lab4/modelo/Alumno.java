package com.lab4.modelo;
/*** @author Lui Angel*/
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;
@Entity
@Table(name = "Alumnos")
public class Alumno implements Serializable {    
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAlumno;
        
	@Column
	private String nro_doc;

	@Column
	private String nombres;

	@Column
	private String apellidos;

	@OneToMany(cascade= CascadeType.ALL)
        @JoinColumn(name="indicativo")
        @IndexColumn(name="idAlumno")
	private Curso id_curso;
        
        //getter and setter

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Curso getId_curso() {
        return id_curso;
    }

    public void setId_curso(Curso id_curso) {
        this.id_curso = id_curso;
    }
        
}
