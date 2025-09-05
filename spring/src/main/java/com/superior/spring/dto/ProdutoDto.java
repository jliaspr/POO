package com.superior.spring.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto (
    @NotBlank(message = "") String nmProduto,
    String dsProduto,
    @NotNull(message = "Naão é possivel cadastrar o produto com campo vazio")
            @DecimalMin(value = "0.01",
                message = "Naão é possivel cadastrar o produto com valor abaixo de 0,01")
    double vlProduto,
    @NotNull(message = "Naão é possivel cadastrar o produto com a flag vazio")
            @NotBlank(message = "Naão é possivel cadastrar o produto com a flag em branco")
    String flAtivo
){
}
