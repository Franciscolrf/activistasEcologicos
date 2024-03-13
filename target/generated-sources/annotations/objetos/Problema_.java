package objetos;

import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import objetos.Activista;
import objetos.Cliente;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-12T20:12:32", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Problema.class)
public class Problema_ { 

    public static volatile SingularAttribute<Problema, String> descripcion;
    public static volatile SingularAttribute<Problema, String> estado;
    public static volatile SingularAttribute<Problema, Cliente> idCliente;
    public static volatile SingularAttribute<Problema, Calendar> fechaInicio;
    public static volatile SingularAttribute<Problema, Calendar> fechaFinal;
    public static volatile SingularAttribute<Problema, Long> id;
    public static volatile ListAttribute<Problema, Activista> activistasRelacionados;

}