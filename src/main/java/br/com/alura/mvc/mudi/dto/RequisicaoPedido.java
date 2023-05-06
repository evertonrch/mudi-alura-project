package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class RequisicaoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String imagemProduto;
    private String descricao;

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNome(nomeProduto);
        pedido.setDescricao(descricao);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(imagemProduto);
        pedido.setStatus(StatusPedido.AGUARDANDO);
        return pedido;
    }
}
