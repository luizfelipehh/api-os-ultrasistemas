package br.com.ultrasistemas.apiosws.domain


import java.util.*
import javax.persistence.*

@Entity
@Table(name = "PARCEIROS")
data class Parceiro(
        @Id
        @Column(name = "PARCEIRO")
        var id: Int = 0,

        @Column(name = "NOME")
        var nome: String = ""
)
{}