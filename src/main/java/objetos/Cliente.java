/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Laboratorios
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    @Column(name="ap_paterno")
    private String apPaterno;
    @Column(name="ap_materno")
    private String apMaterno;
    @OneToMany(mappedBy="cliente", cascade= CascadeType.ALL)
    private List<Direccion>direcciones;
    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL)
    private List<Problema> problemas;

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
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
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente() {
    }

    public Cliente(Long id, String nombres, String apPaterno, String apMaterno) {
        this.id = id;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public Cliente(Long id) {
        this.id = id;
    }

    public Cliente(String nombres, String apPaterno, String apMaterno) {
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public Cliente(Long id, String nombres, String apPaterno, String apMaterno, List<Direccion> direcciones, List<Problema> problemas) {
        this.id = id;
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.direcciones = direcciones;
        this.problemas = problemas;
    }

    public Cliente(String nombres, String apPaterno, String apMaterno, List<Direccion> direcciones, List<Problema> problemas) {
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.direcciones = direcciones;
        this.problemas = problemas;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String formattedDate = dateFormat.format(fechaInicio.getTime());

    String idFormatted = String.format("| %-4s", id);
    String nombresFormatted = String.format("| %-15s", nombres);
    String apPaternoFormatted = String.format("| %-15s", apPaterno);
    String apMaternoFormatted = String.format("| %-15s", apMaterno);
    String direccionFormatted = ""; // Agrega formateo para la dirección si es necesario
    if (direcciones != null && !direcciones.isEmpty()) {
        direccionFormatted = String.format("| %-50s", direcciones.get(0).toString());
    }
    
    return String.format("+------+-----------------+-----------------+-----------------+-----------------+\n"
            + "| ID   | Nombres         | Apellido Paterno| Apellido Materno| Dirección       |\n"
            + "+------+-----------------+-----------------+-----------------+-----------------+\n"
            + idFormatted + nombresFormatted + apPaternoFormatted + apMaternoFormatted + direccionFormatted + "|\n"
            + "+------+-----------------+-----------------+-----------------+-----------------+");
}


    

    
    
}
