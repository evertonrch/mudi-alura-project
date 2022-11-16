package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private String nome;
    private BigDecimal valor;
    private LocalDate dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public Pedido() {}

    public Pedido(String nome, BigDecimal valor, LocalDate dataEntrega, String urlProduto, String urlImagem, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.dataEntrega = dataEntrega;
        this.urlProduto = urlProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
