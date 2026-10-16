package com.iesdoctorbalmis.spring.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Genera get,set, toString, hashCode
@NoArgsConstructor //Genera constructor vacio
@AllArgsConstructor //Genera constructor con todos los parametros
//Es lombok, te permite ahorrarte todo ese codigo
public class Cliente {
    private Long id;
    private String codigoCliente;
    private String nombre;
    private String email;
    private String telefono;
    private TipoCliente tipoCliente;
    private LocalDate fechaAlta;
}
