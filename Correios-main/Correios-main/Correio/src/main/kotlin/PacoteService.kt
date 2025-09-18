package org.example

class PacoteService {

    private val pacotes = mutableListOf<Pacote>()

    fun cadastrarPacote(pacote: Pacote) {
        pacotes.add(pacote)
    }

    fun listarPacotes(index: Int = 0) {
        val p = pacotes[index]
        println("Descrição: ${p.descricao}, Estado: ${p.estado.descricao()}")
        listarPacotes(index + 1)
    }

}