package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.Servico
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface ServicosRepository {

    @Transactional(readOnly = true)
    @Query(value = "SELECT O.SERVICO, O.DESCRICAO, O.VALOR_AV, O.VALOR_AP FROM OS_SERVICOS O", nativeQuery = true)
    fun getServicos(): List<Servico>
}