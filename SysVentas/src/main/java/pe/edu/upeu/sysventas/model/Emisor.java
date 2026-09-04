package pe.edu.upeu.sysventas.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Emisor {
    Long idEmisor;
    String ruc;
    String nombreComercial;
    String ubigeo;
    String domicilio;
    String urbanizaciòn;
    String departamento;
    String provincia;
    String distrito;
}
