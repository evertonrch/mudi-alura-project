package br.com.alura.mvc.mudi.repository.impl;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PedidoRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;
    public List<Pedido> pedidos() {
        return entityManager
                .createQuery("SELECT p FROM Pedido p", Pedido.class)
                .getResultList();
    }
}
