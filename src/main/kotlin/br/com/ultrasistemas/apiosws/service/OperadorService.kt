package br.com.ultrasistemas.apiosws.service

import br.com.ultrasistemas.apiosws.domain.Operador
import br.com.ultrasistemas.apiosws.domain.StatusOperador
import br.com.ultrasistemas.apiosws.repository.OperadorRepository
import org.springframework.stereotype.Service

@Service
class OperadorService(val operadorRepository: OperadorRepository) {

    fun getOperador(operador : Int) = operadorRepository.getOperador(operador)

    fun checkDadosOperador(id: Int, senha: String? ): StatusOperador{
        var operador : Operador? = operadorRepository.getOperador(id)

        var statusOperador: StatusOperador = StatusOperador(id, senha, operador, null, null )
        statusOperador.check()

        return statusOperador
    }

}