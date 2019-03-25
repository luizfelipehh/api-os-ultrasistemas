package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.Parceiro
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ParceiroRepository : JpaRepository<Parceiro, Int> {

    @Query(value = "SELECT P.PARCEIRO, UPPER(P.NOME) AS NOME FROM PARCEIROS P WHERE P.IDN_CLIENTE = 'S' ORDER BY 2", nativeQuery = true)
    fun getParceiros(): List<Parceiro>
}