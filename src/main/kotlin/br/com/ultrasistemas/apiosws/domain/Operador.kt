package br.com.ultrasistemas.apiosws.domain

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "OPERADORES")
data class Operador (
        @Id
        @Column(name = "OPERADOR")
        var id: Int = 0,

        @Column(name = "NOME")
        var nome: String = "",

        @Column(name = "APELIDO")
        var apelido: String = "",

        @Column(name = "SENHA")
        var senha: String = "",

        @Column(name = "IDNSUPERVISOR")
        var idnSupervisor: String = "",

        @Column(name = "PERMITE_LOGAR_OUTRAS_FILIAIS")
        var permiteLogarOutrasFiliais: String = "",

        @Column(name = "IDN_ENTRAR_CONCILIADO")
        var idnEntrarConciliado: String = "",

        @Column(name = "IDN_VISUALIZAR_CUSTO")
        var idnVisualizarCusto: String = "",

        @Column(name = "IDN_VISUALIZAR_SLDDEV_CLI")
        var idnExibeSaldoFiliais: String = "",

        @Column(name = "IDN_MONITOR")
        var idnMonitor: String = "",

        @Column(name = "BLOQUEAR_ACESSO_TITULOS_FUNC")
        var bloquearAcessoTitulosFunc: String = "",

        @Column(name = "PERMITE_ALTERAR_CONCILIADO")
        var permiteAlterarConciliado: String = "",

        @Column(name = "CODFILIAL_TRABALHO")
        var codFilial: Int = 0,

        @Column(name = "DATA_BAIXA")
        var dataBaixa: LocalDate? = null
){
    fun checkAcesso(id: Int, senha: String?): Boolean {
        return this.id == id && this.senha == (if (senha != null && senha?.isEmpty()!!)null else senha)
    }

}