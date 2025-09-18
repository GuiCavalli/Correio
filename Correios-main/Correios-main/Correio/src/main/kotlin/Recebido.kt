package org.example

class Recebido : EstadoPacote {

    override fun proximoEstado() = EmTransito()

    override fun descricao() = "Recebido no centro de distribuição"

}