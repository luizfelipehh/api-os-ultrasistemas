package br.com.ultrasistemas.apiosws.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "OS_SERVICOS_ALOCADOS")
//definindo como data class posso criar o construtor dentro dele ao invés de declarar os atributos e depois os contrutores
@IdClass(OrdemServicoAlocadoPK::class)
data class OrdemServicoAlocado (

        @Id
        @ManyToOne
        @JoinColumn(name = "OS", referencedColumnName = "OS")
        @Column(name = "OS")
        var os: Int = 0,

        @Id
        @Column(name = "SEQ")
        var seq: Int = 0,

        @Column(name = "TECNICO")
        var tecnico: Int = 0,

        @Column(name = "DATA_ALOCACAO")
        var data_alocacao: Date? = null,

        @Column(name = "QTD")
        var qtd: Double = 0.0,

        @Column(name = "UNITARIO")
        var unitario: Double = 0.0,

        @Column(name = "VALOR")
        var valor: Double = 0.0,

        @Column(name = "DESCONTO")
        var desconto: Double = 0.0,

        @Column(name = "VALOR_COMISSAO")
        var valor_comissao: Double = 0.0,

        @Column(name = "BASE_IR")
        var base_ir: Double = 0.0,

        @Column(name = "ALIQUOTA_IR")
        var aliquota_ir: Double = 0.0,

        @Column(name = "VALOR_IR")
        var valor_ir: Double = 0.0,

        @Column(name = "ACRESCIMO")
        var acrescimo: Double = 0.0,

        @Column(name = "LIQUIDO")
        var liquido: Double = 0.0,

        @Column(name = "SERVICO")
        var servico: Int? = null,

        @Column(name = "OPERADOR")
        var operador: Int? = null

){

}