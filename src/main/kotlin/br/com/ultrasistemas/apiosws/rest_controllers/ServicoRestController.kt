package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.Servico
import br.com.ultrasistemas.apiosws.service.ServicoService
import br.com.ultrasistemas.apiosws.shared.StatusResponse
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

class ServicoRestController(
        val servicoService: ServicoService) {

    @RequestMapping("/api-os-ws/servicos", method = arrayOf(RequestMethod.GET))
    fun servicos(@RequestHeader("operador") operador: Int, @RequestHeader("senha") senha: String): StatusResponse){
        var statusOperador: StatusOperador? = operadorService.verificaDadosOperador(operador, if (senha?.isEmpty()) null else senha)
        if (statusOperador?.valid!!){
            var result: List<Servico> = servicoService?.getServicos()
            return StatusResponse(true, "OK")
        }
            return StatusResponse(false, statusOperador!!.descricao!!)
    }

}