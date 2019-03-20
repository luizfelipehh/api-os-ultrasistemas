package br.com.ultrasistemas.apiosws.service

import br.com.ultrasistemas.apiosws.repository.ParceiroRepository
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalDateTime

@Service
class ParceiroService (
  val parceiroRepository: ParceiroRepository)
{
    fun getParceiros() = parceiroRepository.getParceiros()
}