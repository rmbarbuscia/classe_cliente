class cliente2 {
}
package clientforms

class cliente {
    private val listaDecompras = mutableListOf<>()
    fun addList(lista:String){
        if (lista.isEmpty()){
            println("Adição invalida")
        }else{listaDecompras.add(lista)}
    }
}fun removeLista(lista: String){if (lista.isEmpty()){
    println("remoção invalida")
}else{
    listaDecompras.remove(lista)}

}
