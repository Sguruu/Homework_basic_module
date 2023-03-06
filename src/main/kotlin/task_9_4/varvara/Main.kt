package task_9_4.varvara;
fun main(args: Array<String>) {
    val secretMessage = "F2p)v»y233{0->c}ttelciFc"
    val messageEnd: String
    var secretMessageFirst: String
    var secretMessageSecond: String

    //разделили сообщение
    secretMessageFirst = secretMessage.dropLast(secretMessage.length/2)
    secretMessageSecond = secretMessage.drop(secretMessage.length/2)

    println(decoderSecretMessageFirst(secretMessageFirst) + decoderSecretMessageSecond( secretMessageSecond))

}
fun decoderSecretMessageFirst(secretMessageFirst: String) : String {
    var decoderMessageFirst = secretMessageFirst
    decoderMessageFirst = decoderMessageFirst.map { char: Char -> char + 1 }.joinToString("")
    decoderMessageFirst = decoderMessageFirst.replace('5', 's')
    decoderMessageFirst = decoderMessageFirst.replace('4', 'u')
    decoderMessageFirst = decoderMessageFirst.map { char: Char -> char - 3 }.joinToString("")
    decoderMessageFirst = decoderMessageFirst.replace('0', 'o')
    return decoderMessageFirst
    }
fun decoderSecretMessageSecond(secretMessageSecond: String) : String {
    var decoderMessageSecond =  secretMessageSecond
    decoderMessageSecond = decoderMessageSecond.reversed()
    decoderMessageSecond = decoderMessageSecond.map { char: Char -> char - 4 }.joinToString("")
    decoderMessageSecond = decoderMessageSecond.replace(' ', '_')
    return decoderMessageSecond
}





