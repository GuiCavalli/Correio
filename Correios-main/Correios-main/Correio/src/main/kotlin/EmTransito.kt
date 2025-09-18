package org.example

class EmTransito : EstadoPacote {

    override fun proximoEstado() = Entregue()

    override fun descricao() = "Pacote em trânsito"

}

