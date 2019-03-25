package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.domain.OrdemServicoAlocado
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import javax.transaction.Transactional

interface OrdemServicoRepository : JpaRepository<OrdemServico, Int> {

}