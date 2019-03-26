package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.Operador
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface OperadorRepository : JpaRepository<Operador, Int> {

    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES", nativeQuery = true)
    fun getOperadores(): List<Operador>

    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES WHERE CODFILIAL_TRABALHO = :FILIAL", nativeQuery = true)
    fun finByFilial(@Param("filial") filial: Int): List<Operador>

    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES", nativeQuery = true)
    fun getOperador(@Param("parceiro") parceiro: Int): Operador?

    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES WHERE OPERADOR = :OPERADOR", nativeQuery = true)
    fun findByParceiro(@Param("parceiro") parceiro: Int): Int?

}