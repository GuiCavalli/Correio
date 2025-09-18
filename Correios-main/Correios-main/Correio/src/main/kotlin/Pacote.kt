package org.example

import java.util.UUID

class Pacote(
    val id: UUID?,
    val descricao: String,
    var estado: EstadoPacote = Recebido()
) {
    fun avançarEstado() {
        estado = estado.proximoEstado()
    }
}