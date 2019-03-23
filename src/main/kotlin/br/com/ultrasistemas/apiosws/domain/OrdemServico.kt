package br.com.ultrasistemas.apiosws.domain

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import java.time.LocalDateTime
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
@Table(name = "OS")
data class OrdemServico (

        @Id
        @Column(name = "OS")
        @SequenceGenerator(name = "GEN_OS", sequenceName = "GEN_OS", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_OS")
        var id: Int = 0,

        @Column(name = "PARCEIRO")
        var parceiro: Int = 0,

        @Column(name = "DATA_ABERTURA")
        @JsonSerialize(using = ToStringSerializer::class)
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        var data: LocalDateTime?  = null,

        @Column(name = "HORA_ABERTURA")
        @JsonSerialize(using = ToStringSerializer::class)
        @JsonDeserialize(using = LocalDateTimeDeserializer::class)
        var hora: LocalDateTime?  = null,

        @Column(name = "OPERADOR_ABERT")
        var operador: Int = 0,

        @Column(name = "VALOR_PRODUTOS")
        var valor_produtos: Double = 0.0,

        @Column(name = "VALOR_SERVICOS")
        var valor_servicos: Double = 0.0,

        @Column(name = "DESCONTO_PRODUTOS")
        var desconto_produtos: Double = 0.0,

        @Column(name = "DESCONTO_SERVICOS")
        var desconto_servicos: Double = 0.0,

        @Column(name = "DESCONTO_INFORMADO")
        var desconto_informado: Double = 0.0,

        @Column(name = "PERC_DESC_INFORMADO")
        var perc_desc_informado: Double = 0.0,

        @Column(name = "VALOR_ENTRADA")
        var valor_entrada: Double = 0.0,

        @Column(name = "SERVICOS_CONCLUIDO")
        var servicos_concluido: String = "",

        @Column(name = "PRODUTOS_CONCLUIDO")
        var produtos_concluidos: String = "",

        @Column(name = "VALOR_IR")
        var valor_ir: Double = 0.0,

        @Column(name = "VALOR_IR_DESC")
        var valor_ir_desc: Double = 0.0,

        @Column(name = "ACRESCIMO_PRODUTOS")
        var acrescimo_produtos: Double = 0.0,

        @Column(name = "ACRESCIMO_SERVICOS")
        var acrescimo_servicos: Double = 0.0,

        @Column(name = "VALOR_LIQ_TOTAL")
        var valor_liq_total: Double = 0.0,

        @Column(name = "VALOR_LIQ_PRODUTOS")
        var valor_liq_produtos: Double = 0.0,

        @Column(name = "VALOR_LIQ_SERVICOS")
        var valor_liq_servicos: Double = 0.0,

        @Column(name = "ACRESCIMO_INFORMADO")
        var acrescimo_informado: Double = 0.0,

        @Column(name = "IDN_LISTAPRODUTOS")
        var idn_listaprodutos: String = ""
    )
    {

    @OneToMany(cascade = arrayOf(CascadeType.ALL, CascadeType.PERSIST), mappedBy = "ordemservico", orphanRemoval = true)
    var ordemServicoAlocado: List<OrdemServicoAlocado> = ArrayList<OrdemServicoAlocado>()

    }




