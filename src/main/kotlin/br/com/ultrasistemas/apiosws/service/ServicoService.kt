package br.com.ultrasistemas.apiosws.service

import br.com.ultrasistemas.apiosws.repository.ServicosRepository
import org.jvnet.hk2.annotations.Service

@Service
class ServicoService (
   val servicosRepository: ServicosRepository)
{
  fun getServicos() = servicosRepository.getServicos()
}