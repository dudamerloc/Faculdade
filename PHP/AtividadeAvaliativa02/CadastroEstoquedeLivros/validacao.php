<?php

// Funções de validação e cálculo para o controle de estoque de livros.
function validar_livro($livro) {
    if (empty($livro['titulo']) || empty($livro['autor'])){
        return false;
    }

    if (!is_numeric($livro['preco']) || $livro['preco'] < 0.01){
        return false;
    }

// Função para calcular o valor total do estoque com base no preço e quantidade
    if (!filter_var($livro['quantidade'], FILTER_VALIDATE_INT) || $livro['quantidade'] <= 0){
        return false;
    }
    return true;
}
function calcularValorTotalEstoque($livro){
    return $livro['preco'] * $livro['quantidade'];
}
?>