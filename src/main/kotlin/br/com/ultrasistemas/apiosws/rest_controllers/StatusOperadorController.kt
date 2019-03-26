package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.StatusOperador
import br.com.ultrasistemas.apiosws.service.OperadorService
import br.com.ultrasistemas.apiosws.shared.StatusResponse
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class StatusOperadorController(val operadorService: OperadorService){

    @RequestMapping("/api-ultra-ws/checkStatus", method = arrayOf(RequestMethod.GET))
    fun checkStatus(@RequestHeader("operador") operador: Int,
                    @RequestHeader("senha") senha: String): StatusResponse {

        var statusOperador: StatusOperador? = operadorService.checkDadosOperador(operador, if (senha?.isEmpty()) null else senha)
        if (statusOperador?.valid!!) {
            return StatusResponse(true, "OK")
        } else {
            return StatusResponse(true, "Serviço não autorizado! ${statusOperador?.descricao!!}", null)
        }

    }
}