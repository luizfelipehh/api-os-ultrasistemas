package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.domain.OrdemServicoAlocado
import org.springframework.data.jpa.repository.JpaRepository

interface OrdemServicoRepository : JpaRepository<OrdemServico, Int> {


}