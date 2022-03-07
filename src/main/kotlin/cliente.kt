/*import jdk.internal.joptsimple.internal.Strings
import java.util.concurrent.ExecutionException

 data class cliente (private val nome: String, private val endereço: String, private val telefone: String) {

    private var listaDeCompras = mutableListOf<Strings>()

    init {
        if (nome.isEmpty() || endereço.isEmpty() || telefone.isEmpty()) {
            throw Exception("Dados incorretos, por favor, digite novamente")
        } else {
            println("Nome cadastrado com sucesso")
        }
    }
}*/
//correção

class Cliente (val nome: String){
    var endereco = ""
    var telefone = ""
    var listaDeCompras = mutableListOf<String>()
    constructor(nome: String, endereço: String) : this (nome){
        this.endereço = endereco =endereco

        constructor(
            nome: String, endereco: String, telefone: String)
        : this(nome, endereco){
                this.telefone = telefone
        }
        fun addCompra(valor: String){if(valor.isEmpty())}

        )
    }
}




