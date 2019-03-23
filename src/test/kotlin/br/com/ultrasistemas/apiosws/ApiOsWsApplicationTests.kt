package br.com.ultrasistemas.apiosws

import br.com.ultrasistemas.apiosws.domain.OrdemServico
import br.com.ultrasistemas.apiosws.repository.OrdemServicoRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@SpringBootTest
class ApiOsWsApplicationTests {

    @Autowired
    private val ordemRepository: OrdemServicoRepository? = null


        @Test
        fun testInsert() {
            var ordem = OrdemServico(
                    1, 1, LocalDateTime.now(), LocalDateTime.now(), 1, 30.00, 20.00,
                    5.00, 3.50, 00.00, 0.00,
                    0.00, "N", "N", 0.00, 0.0,
                    0.0, 0.0, 0.0, 0.0, 0.0,
                    0.0, "N"
            )

            var ordemSaved = ordemRepository?.save(ordem)

            println("Ordem de Serviço inserida")
            print(ordemSaved.toString())
        }


    }
