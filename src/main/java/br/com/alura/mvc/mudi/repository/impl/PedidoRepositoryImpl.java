package br.com.alura.mvc.mudi.repository.impl;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Pedido> pedidos() {
        return entityManager
                .createQuery("SELECT p FROM Pedido p", Pedido.class)
                .getResultList();
    }
}
