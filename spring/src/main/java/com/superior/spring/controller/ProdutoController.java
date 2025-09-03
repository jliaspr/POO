package com.superior.spring.controller;

import com.superior.spring.dto.ProdutoDto;
import com.superior.spring.model.ProdutoModel;
import com.superior.spring.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public ResponseEntity<ProdutoModel> CriarProduto
            (@Valid @RequestBody ProdutoDto produtoDto) {
        var produtoModel = new ProdutoModel();
       BeanUtils.copyProperties(produtoDto, produtoModel);
       return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produtoModel));
    }

@GetMapping
public ResponseEntity<List<ProdutoModel>> ListarProdutos() {
    return ResponseEntity.status(
                    HttpStatus.OK)
            .body(produtoRepository.findAll());
    }
}