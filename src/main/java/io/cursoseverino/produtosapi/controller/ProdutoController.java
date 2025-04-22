package io.cursoseverino.produtosapi.controller;


import io.cursoseverino.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){

        System.out.println("ProduTO RECEBIDO: " +produto);
        return produto;
    }
}
