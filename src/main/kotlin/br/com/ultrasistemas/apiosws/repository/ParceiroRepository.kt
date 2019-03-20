package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.Parceiro
import org.springframework.data.jpa.repository.Query

interface ParceiroRepository {

    @Query(value = "SELECT P.PARCEIRO, UPPER(P.NOME) AS NOME FROM PARCEIROS P ORDER BY 2", nativeQuery = true)
    fun getParceiros(): List<Parceiro>
}