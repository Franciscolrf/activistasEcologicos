package objetos;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import objetos.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-11T02:56:05", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Cliente> cliente;
    public static volatile SingularAttribute<Direccion, String> codigoPostal;
    public static volatile SingularAttribute<Direccion, String> calle;
    public static volatile SingularAttribute<Direccion, String> numeroExterior;
    public static volatile SingularAttribute<Direccion, Long> id;
    public static volatile SingularAttribute<Direccion, String> colonia;

}