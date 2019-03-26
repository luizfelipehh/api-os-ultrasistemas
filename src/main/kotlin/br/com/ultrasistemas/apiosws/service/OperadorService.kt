package br.com.ultrasistemas.apiosws.service

import br.com.ultrasistemas.apiosws.domain.Operador
import br.com.ultrasistemas.apiosws.domain.StatusOperador
import br.com.ultrasistemas.apiosws.repository.OperadorRepository
import org.springframework.stereotype.Service

@Service
class OperadorService(val operadorRepository: OperadorRepository) {

    fun getOperador() = operadorRepository.getOperadores()

    fun checkDadosOperador(parceiro: Int, senha: String?): StatusOperador{
        var operador : Operador? = operadorRepository.getOperador(parceiro)

        var statusOperador: StatusOperador = StatusOperador(parceiro, senha, operador , null, null )
        statusOperador.check()

        return statusOperador
    }
}