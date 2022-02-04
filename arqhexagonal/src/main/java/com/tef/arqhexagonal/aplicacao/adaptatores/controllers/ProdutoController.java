package com.tef.arqhexagonal.aplicacao.adaptatores.controllers;


import com.tef.arqhexagonal.dominio.dtos.EstoqueDTO;
import com.tef.arqhexagonal.dominio.dtos.ProdutoDTO;
import com.tef.arqhexagonal.dominio.portas.interfaces.ProdutoServicePort;
import java.util.List;
import javassist.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController
{

	private final ProdutoServicePort produtoServicePort;

	public ProdutoController(ProdutoServicePort produtoServicePort)
	{
		this.produtoServicePort = produtoServicePort;
	}

	@PostMapping
	void criarProdutos(@RequestBody ProdutoDTO produtoDTO)
	{
		produtoServicePort.criarProduto(produtoDTO);
	}

	@GetMapping
	List<ProdutoDTO> getProdutos()
	{
		return produtoServicePort.buscarProdutos();
	}

	@PutMapping(value = "/{sku}")
	void atualizarEstoque(@PathVariable String sku, @RequestBody EstoqueDTO estoqueDTO)
		throws ChangeSetPersister.NotFoundException, NotFoundException
	{
		produtoServicePort.atualizarEstoque(sku, estoqueDTO);
	}
}
