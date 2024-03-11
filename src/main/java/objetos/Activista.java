/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table(name = "activista")
public class Activista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    @Column(name = "ap_paterno")
    private String apPaterno;
    @Column(name = "ap_materno")
    private String apMaterno;
    @Column(name = "telefono", unique = true)
    private String telefono;
    private Calendar fechaInicioLabores;

    public Activista() {
    }

    public Activista(Long id, String nombres, String apPaterno, String apMaterno, String telefono, Calendar fechaInicioLabores) {
        this.id = id;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.fechaInicioLabores = fechaInicioLabores;
    }

    public Activista(String nombres, String apPaterno, String apMaterno, String telefono, Calendar fechaInicioLabores) {

        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.fechaInicioLabores = fechaInicioLabores;
    }

    public Activista(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFechaInicioLabores() {
        return fechaInicioLabores;
    }

    public void setFechaInicioLabores(Calendar fechaInicioLabores) {
        this.fechaInicioLabores = fechaInicioLabores;
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
        if (!(object instanceof Activista)) {
            return false;
        }
        Activista other = (Activista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormat.format(fechaInicioLabores.getTime());

        String idFormatted = String.format("| %-4s", id);
        String nombresFormatted = String.format("| %-15s", nombres);
        String apPaternoFormatted = String.format("| %-15s", apPaterno);
        String apMaternoFormatted = String.format("| %-15s", apMaterno);
        String telefonoFormatted = String.format("| %-12s", telefono);
        String fechaInicioFormatted = String.format("| %-12s", formattedDate);

        return String.format("+------+-----------------+-----------------+-----------------+--------------+--------------+\n"
                + "| ID   | Nombres         | Apellido Paterno| Apellido Materno| Telefono     | Fecha Inicio |\n"
                + "+------+-----------------+-----------------+-----------------+--------------+--------------+\n"
                + idFormatted + nombresFormatted + apPaternoFormatted + apMaternoFormatted + telefonoFormatted + fechaInicioFormatted + "|\n"
                + "+------+-----------------+-----------------+-----------------+--------------+--------------+");
    }

}
