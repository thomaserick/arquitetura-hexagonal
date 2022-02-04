package com.tef.arqhexagonal.dominio.portas.interfaces;


import com.tef.arqhexagonal.dominio.dtos.EstoqueDTO;
import com.tef.arqhexagonal.dominio.dtos.ProdutoDTO;

import java.util.List;
import javassist.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface ProdutoServicePort {

    List<ProdutoDTO> buscarProdutos();

    void criarProduto(ProdutoDTO produtoDTO);

    void atualizarEstoque(String sku, EstoqueDTO estoqueDTO) throws ChangeSetPersister.NotFoundException, NotFoundException;
}
