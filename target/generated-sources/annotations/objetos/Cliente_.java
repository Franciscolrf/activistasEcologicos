package objetos;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import objetos.Direccion;
import objetos.Problema;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-11T03:19:30", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apMaterno;
    public static volatile ListAttribute<Cliente, Direccion> direcciones;
    public static volatile ListAttribute<Cliente, Problema> problemas;
    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, String> apPaterno;
    public static volatile SingularAttribute<Cliente, String> nombres;

}