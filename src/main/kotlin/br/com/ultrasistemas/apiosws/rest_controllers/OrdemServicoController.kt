package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.domain.OrdemServicoAlocado
import br.com.ultrasistemas.apiosws.service.OrdemServicoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class OrdemServicoController (
        val ordemServicoService: OrdemServicoService) {

    @PostMapping("/api-os-ws/ordemservico/saveAll")
    fun saveOrdemServico(@RequestBody os: List<OrdemServico>, @RequestBody servicos: List<OrdemServicoAlocado>){



    }


}