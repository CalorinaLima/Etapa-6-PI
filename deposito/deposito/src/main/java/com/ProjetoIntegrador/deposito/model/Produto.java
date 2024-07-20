
package com.ProjetoIntegrador.deposito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    
    private Integer id;
    private String nome;
    private String validade;
    private String descricao;
    private String dataEntrada;
}
