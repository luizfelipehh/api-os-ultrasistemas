package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.Servico
import br.com.ultrasistemas.apiosws.service.ServicoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

class ServicoRestController(
        val servicoService: ServicoService) {

    @RequestMapping("/api-os-ws/servicos", method = arrayOf(RequestMethod.GET))
    fun servicos(){
        var result: List<Servico> = servicoService?.getServicos()
    }
}