package com.tef.arqhexagonal.infraestrutura.configuracao;

import com.tef.arqhexagonal.dominio.adaptadores.services.PedidoServiceImp;
import com.tef.arqhexagonal.dominio.portas.interfaces.ProdutoServicePort;
import com.tef.arqhexagonal.dominio.portas.repositories.ProdutoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    ProdutoServicePort produtoService(ProdutoRepositoryPort produtoRepositoryPort) {
        return new PedidoServiceImp(produtoRepositoryPort);
    }
}
