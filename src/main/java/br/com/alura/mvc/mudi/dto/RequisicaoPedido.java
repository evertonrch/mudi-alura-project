package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String imagemProduto;
    private String descricao;

    public RequisicaoPedido(String nomeProduto, String urlProduto, String imagemProduto, String descricao) {
        this.nomeProduto = nomeProduto;
        this.urlProduto = urlProduto;
        this.imagemProduto = imagemProduto;
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public String getImagemProduto() {
        return imagemProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "RequisicaoPedido{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", urlProduto='" + urlProduto + '\'' +
                ", imagemProduto='" + imagemProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }



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
