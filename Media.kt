fun main(){
    
    var num1: Double = 10.0
    var num2: Double = 8.0
    var num3: Double = 8.0

    var mediaResult: Double = (num1 + num2 + num3) / 3
    var mediaFormatada = String.format("%.2f", mediaResult)

    println("A média é: $mediaFormatada")
}