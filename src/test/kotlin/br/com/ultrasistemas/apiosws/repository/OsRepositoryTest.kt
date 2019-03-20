package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.service.OrdemServicoService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@SpringBootTest
class OsRepositoryTest {

    @Autowired
    var ordemRepository: OrdemServicoRepository? = null

    @Test
    fun testInsertOrdemServico() {
        var ordem = OrdemServico(
                1, 59,  null, null,  1, 30.00, 20.00,
                5.00, 3.50, 00.00, 0.00,
                0.00, "N", "N", 0.00, 0.0,
                0.0,0.0,0.0,0.0,0.0,
                0.0, "N"
        )

        var ordemServicoSaved = ordemRepository?.save(ordem)


        println("Ordem saved...")
        println(ordemServicoSaved?.toString())

    }
}