package com.tef.arqhexagonal.infraestrutura.adaptadores.repositories;


import com.tef.arqhexagonal.infraestrutura.adaptadores.entidades.ProdutoEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringProdutoRepository extends JpaRepository<ProdutoEntity, UUID> {
    Optional<ProdutoEntity> findBySku(String sku);
}
