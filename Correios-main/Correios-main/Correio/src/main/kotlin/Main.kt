package org.example

import java.util.UUID


fun main() {

    val service = PacoteService()

    println("Gerando ID aleatório para o pacote...")
    val id = UUID.randomUUID()

    println("Informe a descrição do pacote:")
    val descricao = readln()

    val pacote = Pacote(id, descricao)
    service.cadastrarPacote(pacote)
    println("Pacote cadastrado com sucesso!")

    println(pacote.estado.descricao())
    pacote.avançarEstado()

    println(pacote.estado.descricao())
    pacote.avançarEstado()

    println(pacote.estado.descricao())
    pacote.avançarEstado()

    println(pacote.estado.descricao())
}