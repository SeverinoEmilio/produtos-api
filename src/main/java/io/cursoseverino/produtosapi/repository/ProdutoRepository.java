package io.cursoseverino.produtosapi.repository;

import io.cursoseverino.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
