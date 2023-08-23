fun main(){

    var name: String = "Augusto Santana"
    var status: Boolean = true
    var age: Double = 21.0
    var email: String = "guty.vertolis@gmail.com"

     var userStatus: String = if (status) "ativo" else "inativo"

    println("O usuário $name com $age anos e o email $email está atualmente $userStatus na plataforma")
}