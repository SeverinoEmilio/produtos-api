package io.cursoseverino.produtosapi.controller;


import io.cursoseverino.produtosapi.model.Produto;
import io.cursoseverino.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("ProduTO RECEBIDO: " +produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);

        return produto;
    }
}
