package br.unimes.dao

import br.unimes.model.Produto

class ProdutoDao {
    companion object{
        private var produto: Produto? = null;
    }

    fun addProduto(prod:Produto){
        Companion.produto = prod
    }

    fun obterProduto():Produto{
        return Companion.produto?:Produto();
    }
}