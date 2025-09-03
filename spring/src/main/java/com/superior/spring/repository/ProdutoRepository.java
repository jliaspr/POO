package com.superior.spring.repository;

import com.superior.spring.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Integer> {
    Optional<ProdutoModel> findByCdProduto(int cdProduto);
    Optional<ProdutoModel> findByNmProduto(String nmProduto);
    Optional<ProdutoModel> findAllCdProduto(int cdProduto);
}
