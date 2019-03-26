package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.Servico
import br.com.ultrasistemas.apiosws.domain.StatusOperador
import br.com.ultrasistemas.apiosws.service.OperadorService
import br.com.ultrasistemas.apiosws.service.ServicoService
import br.com.ultrasistemas.apiosws.shared.StatusResponse
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ServicoRestController(
        val servicoService: ServicoService,
        val operadorService: OperadorService) {

    @RequestMapping("/api-os-ws/servico", method = arrayOf(RequestMethod.GET))
    fun servicos(@RequestHeader("operador") operador: Int,
                 @RequestHeader("senha") senha: String): StatusResponse {


//        var statusConsultor: StatusConsultor? = consultorService.checkDadosConsultor(consultor, if (senha?.isEmpty()) null else senha
        var statusOperador: StatusOperador? = operadorService.checkDadosOperador(operador, if (senha?.isEmpty()) null else senha)
        if (statusOperador?.valid!!) {
            var result: List<Servico> = servicoService?.getServicos()
            return StatusResponse(true, "OK")
        } else {
            return StatusResponse(false, statusOperador!!.descricao!!)
        }

    }
}