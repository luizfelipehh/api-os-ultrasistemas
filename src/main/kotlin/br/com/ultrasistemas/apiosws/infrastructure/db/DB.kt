package br.com.ultrasistemas.apiosws.infrastructure.db

class DB {
    var url: String? = null

    val porta = "3306"

    var targetDB: String? = null

    var username: String? = null

    var password: String? = null

    constructor(url: String?, targetDB: String?, username: String?, password: String?) {
        this.url = url
        this.targetDB = targetDB
        this.username = username
        this.password = password
    }
}