package br.com.ultrasistemas.apiosws.service

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.domain.OrdemServicoAlocado
import br.com.ultrasistemas.apiosws.repository.OrdemServicoRepository
import org.springframework.stereotype.Service

@Service
class OrdemServicoService(
   val ordemServicoRepository: OrdemServicoRepository,
   val ordemServicoAlocado: OrdemServicoAlocado
) {
    fun save(os: OrdemServico) = ordemServicoRepository.save(os)
}