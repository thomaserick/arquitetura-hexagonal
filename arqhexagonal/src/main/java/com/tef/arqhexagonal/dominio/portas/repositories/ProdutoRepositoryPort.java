package com.tef.arqhexagonal.dominio.portas.repositories;


import com.tef.arqhexagonal.dominio.Produto;
import java.util.List;

public interface ProdutoRepositoryPort
{
	List<Produto> buscarTodos();

	Produto buscarPeloSku(String sku);

	void salvar(Produto produto);
}
