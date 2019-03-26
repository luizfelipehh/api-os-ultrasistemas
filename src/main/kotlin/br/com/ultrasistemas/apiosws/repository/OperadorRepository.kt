package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.Operador
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface OperadorRepository : JpaRepository<Operador, Int> {

//    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES", nativeQuery = true)
//    fun getOperadores(): Int

    @Query(value = "SELECT OPERADOR, UPPER(NOME) AS NOME FROM OPERADORES WHERE OPERADOR = :OPERADOR", nativeQuery = true)
    fun getOperador(@Param("OPERADOR") operador: Int) : Operador?
}