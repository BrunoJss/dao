package br.unimes.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.unimes.dao.ProdutoDao
import br.unimes.dao.R
import br.unimes.model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = ProdutoDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeProduto = findViewById<EditText>(R.id.edt_nome_produto)
        val precoProduto = findViewById<EditText>(R.id.edt_preco_produto)
        val btnSalvar  = findViewById<Button>(R.id.btn_salvar)
        val fabLista = findViewById<FloatingActionButton>(R.id.fab_lista)


        btnSalvar.setOnClickListener{
            val valorNome = nomeProduto.text.toString()
            val valorPreco = precoProduto.text.toString().toDouble()

            val prod = Produto(valorNome, valorPreco)
            dao.addProduto(prod)
        }

        fabLista.setOnClickListener{
            val intent = Intent(this, ListaProdutoActivity::class.java)
        }

    }
}