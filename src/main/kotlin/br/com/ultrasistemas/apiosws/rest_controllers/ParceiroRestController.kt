package br.com.ultrasistemas.apiosws.rest_controllers

import br.com.ultrasistemas.apiosws.domain.Parceiro
import br.com.ultrasistemas.apiosws.service.ParceiroService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


class ParceiroRestController (
        val parceiroService: ParceiroService){

    @RequestMapping("/api-os-ws/parceiros", method = arrayOf(RequestMethod.GET))
    fun parceiros(){
        var result: List<Parceiro> = parceiroService?.getParceiros()
    }
}