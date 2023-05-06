package br.com.alura.mvc.mudi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(precision = 11, scale = 2)
    private BigDecimal valor;
    private LocalDate dataEntrega;
    @Lob
    private String urlProduto;
    @Column(length = 255)
    private String urlImagem;

    @Column(length = 255)
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;
}
