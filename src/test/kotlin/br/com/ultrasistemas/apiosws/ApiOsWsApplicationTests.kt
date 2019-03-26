package br.com.ultrasistemas.apiosws

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.domain.OrdemServicoAlocado
import br.com.ultrasistemas.apiosws.repository.OrdemServicoRepository
import br.com.ultrasistemas.apiosws.repository.ParceiroRepository
import br.com.ultrasistemas.apiosws.repository.ServicosRepository
import com.google.gson.GsonBuilder
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest
class ApiOsWsApplicationTests {

    @Autowired
    private val ordemRepository: OrdemServicoRepository? = null

    @Autowired
    private val parceiroRepository: ParceiroRepository? = null

    @Autowired
    private val servicoRepository: ServicosRepository? = null


        @Test
        fun testInsert() {
            var ordem = OrdemServico(null, 868, 500,LocalDateTime.now(), LocalDateTime.now(), 1, 30.00, 20.00,
                    5.00, 3.50, 00.00, 0.00,
                    0.00, "N", "N", 0.00, 0.0,
                    0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, "N"
            )


            var osList = Arrays.asList(OrdemServicoAlocado(ordem, 1,  28,LocalDateTime.now(),
                    1.0, 10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, 0.0, 2))
//                    OrdemServicoAlocado(ordem, 2, 1,LocalDateTime.now(),
//                            1.0, 20.0, 20.0, 0.0, 0.0, 0.0, 0.0, 0.0,
//                            0.0, 0.0, 2 ))

            ordem.ordemServicoAlocado = osList
//
            var ordemSaved = ordemRepository?.save(ordem)
//            var gson = GsonBuilder().setPrettyPrinting().create()
//            println(gson.toJson(osList))



            println("Ordem de Serviço inserida")
            print("OS ID: " + ordemSaved?.id)
        }

    @Test
    fun testGetParceiros() {
        println("---------------------------------")
        println("Parceiros")
        parceiroRepository?.getParceiros()?.forEach { parceiro -> println(parceiro.toString()) }
    }


    @Test
    fun testGetServicos() {
        println("---------------------------------")
        println("Parceiros")
        servicoRepository?.getServicos()?.forEach { servico -> println(servico.toString()) }
    }





}
