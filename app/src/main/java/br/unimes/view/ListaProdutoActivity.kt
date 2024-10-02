package br.unimes.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.unimes.dao.ProdutoDao
import br.unimes.dao.R
import br.unimes.model.Produto

class ListaProdutoActivity : AppCompatActivity() {
    val dao = ProdutoDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_produto)

        val nomeProduto = findViewById<TextView>(R.id.txv_nome_produto)
        val precoProduto = findViewById<TextView>(R.id.txv_preco_produto)

        val prod = dao.obterProduto()

        nomeProduto.text = prod.nome
        precoProduto.text = prod.preco.toString()



    }
}