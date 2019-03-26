package br.com.ultrasistemas.apiosws.domain

data class StatusOperador(val id: Int, val senha: String?, val operador: Operador?,
                          var valid: Boolean?, var descricao: String? = ""){
    fun check() {
        valid = true

        if (operador != null && !operador.checkAcesso(id, senha)) {
            valid = false
            descricao = "Os dados do operador e senha não conferem!"
        }

        if (operador == null) {
            valid = false
            descricao = "O consultor ${operador} não foi encontrado no sistema!"
        }
    }
}
