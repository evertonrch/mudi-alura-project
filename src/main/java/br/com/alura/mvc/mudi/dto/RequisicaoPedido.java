package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

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
        return new Pedido(nomeProduto, urlProduto, imagemProduto, descricao);
    }
}
