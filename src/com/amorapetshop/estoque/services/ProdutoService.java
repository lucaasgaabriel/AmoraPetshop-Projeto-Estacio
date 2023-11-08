package com.amorapetshop.estoque.services;
import com.amorapetshop.estoque.dao.ProdutoDAO;
import com.amorapetshop.estoque.models.Produto;

public class ProdutoService {

    public ProdutoService() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
    }

    public void adicionarProduto(Produto produto) {
        // Lógica para adicionar um produto ao estoque
    }

    public void atualizarProduto(Produto produto) {
        // Lógica para atualizar um produto no estoque
    }
}
