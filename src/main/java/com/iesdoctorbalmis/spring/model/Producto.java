package com.iesdoctorbalmis.spring.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Producto {
    private Long id;
    private String referencia;
    private String descripcion;
    private BigDecimal precioVenta; //BigDecimal da precision exacta, mejor que double o float
    private BigDecimal precioCosto;
    private String imagen;
    private Integer stock;
}
