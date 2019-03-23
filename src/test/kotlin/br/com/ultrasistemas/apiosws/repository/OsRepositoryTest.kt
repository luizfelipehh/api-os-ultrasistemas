package br.com.ultrasistemas.apiosws.repository

import br.com.ultrasistemas.apiosws.domain.OrdemServico
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
    private val ordemRepository: OrdemServicoRepository? = null


}