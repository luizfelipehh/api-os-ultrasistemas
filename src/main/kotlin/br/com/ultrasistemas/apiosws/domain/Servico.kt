package br.com.ultrasistemas.apiosws.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "OS_SERVICOS")
data class Servico(
        @Id
        @Column(name = "SERVICO")
        var servico : Int = 0,

        @Column(name = "DESCRICAO")
        var descricao: String = "",

        @Column(name = "VALOR_AV")
        var valor_av: Double = 0.0,

        @Column(name = "VALOR_AP")
        var valor_ap: Double = 0.0
)