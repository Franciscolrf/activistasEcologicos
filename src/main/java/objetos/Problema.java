/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table(name = "problema")
public class Problema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar fechaInicio;
    private Calendar fechaFinal;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;
    @ManyToMany()
    @JoinTable(
            name="activistasdelproblema",
            joinColumns= @JoinColumn(name="idProblema"),
            inverseJoinColumns=@JoinColumn(name="idActivista")
            )
    private List<Activista> activistasRelacionados;
    @Column(name = "descripcion")
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Problema(Long id, Calendar fechaInicio, Calendar fechaFinal, String estado, Cliente idCliente, List<Activista> activistasRelacionados, String descripcion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.idCliente = idCliente;
        this.activistasRelacionados = activistasRelacionados;
        this.descripcion = descripcion;
    }

    public Problema(Calendar fechaInicio, Calendar fechaFinal, String estado, Cliente idCliente, List<Activista> activistasRelacionados, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.idCliente = idCliente;
        this.activistasRelacionados = activistasRelacionados;
        this.descripcion = descripcion;
    }

    public Problema(Long id, Calendar fechaInicio, String estado, Cliente idCliente, List<Activista> activistasRelacionados, String descripcion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.idCliente = idCliente;
        this.activistasRelacionados = activistasRelacionados;
        this.descripcion = descripcion;
    }

    public Problema(Calendar fechaInicio, String estado, Cliente idCliente, List<Activista> activistasRelacionados, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.idCliente = idCliente;
        this.activistasRelacionados = activistasRelacionados;
        this.descripcion = descripcion;
    }

    public Problema(Calendar fechaInicio, Calendar fechaFinal, String estado, Cliente idCliente, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
    }

    public Problema(Calendar fechaInicio, String estado, Cliente idCliente, String descripcion) {
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
    }

    
    
    
    public List<Activista> getActivistasRelacionados() {
        return activistasRelacionados;
    }

    public void setActivistasRelacionados(List<Activista> activistasRelacionados) {
        this.activistasRelacionados = activistasRelacionados;
    }
    

    
    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Problema(Long id) {
        this.id = id;
    }

    public Problema() {
    }

    public Problema(Long id, Calendar fechaInicio, Calendar fechaFinal, String estado, Cliente idCliente) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.idCliente = idCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problema)) {
            return false;
        }
        Problema other = (Problema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Problema{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", estado=" + estado + ", idCliente=" + idCliente + '}';
    }

}
