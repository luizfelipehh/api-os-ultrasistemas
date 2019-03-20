package br.com.ultrasistemas.apiosws.infrastructure.db

import org.apache.tomcat.jdbc.pool.DataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.sql.SQLException

@Configuration
@EnableTransactionManagement
@Component
class DBConnection {

    private var db: DB? = null

    private var dataSource: DataSource? = null

    private var jdbcTemplate: JdbcTemplate? = null

    /*@Bean
    fun createDataSource(): DataSource {


        dataSource = DataSource()
        jdbcTemplate = JdbcTemplate()

        this.setDBConfig()

        setDataSource(this.db!!)

        return dataSource!!
    }


    fun setDataSource(db: DB) {
        dataSource!!.close()
        dataSource!!.setDriverClassName("org.firebirdsql.jdbc.FBDriver")

        dataSource!!.setUrl(db.url)
        dataSource!!.setUsername(db.username)
        dataSource!!.setPassword(db.password)
        try {
            dataSource!!.createPool()
        } catch (e: SQLException) {
            e.printStackTrace()
        }

    }*/
/*
    fun setDBConfig() {
        val lines = Files.readAllLines(Paths.get("BD.Conf"), StandardCharsets.UTF_8)
        val configurationMap = hashMapOf<String, Any>()
        for (line in lines) {
            val value = line.split("=")[0]
            println("value:" + value)
            var default: Boolean = false
            if (value.equals("Default")) {
                default = line.split("=")[1].trim().equals("Sim")
            }

            when (value) {
                "Servidor" -> configurationMap.put("Servidor", line.split("=")[1])
                "Caminho" -> configurationMap.put("Caminho", line.split("=")[1])
                "Default" -> configurationMap.put("Default", line.split("=")[1])
            }
            if (default) {
                break
            }

        }

        var dbURL = "jdbc:firebirdsql:${configurationMap.get("Servidor").toString()}/3050:" +
                "${configurationMap.get("Caminho").toString()}?encoding=ISO8859_1"

        println("Conectando no banco ${dbURL}")

        this.db = DB(dbURL, "Banco Local", "SYSDBA", "masterkey")
    }*/
}