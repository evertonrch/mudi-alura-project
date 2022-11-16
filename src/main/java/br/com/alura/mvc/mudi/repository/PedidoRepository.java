package br.com.alura.mvc.mudi.repository;

import br.com.alura.mvc.mudi.model.Pedido;

import java.util.List;

public interface PedidoRepository {

    List<Pedido> pedidos();
}
