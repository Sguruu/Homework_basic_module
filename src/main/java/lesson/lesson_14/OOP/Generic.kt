package lesson.lesson_14.OOP

fun main() {
    val email1 = EmailMessage("Hello Kotlin")
    val outlook = Messenger<EmailMessage>()
    outlook.send(email1)

    val skype = Messenger<SmsMessage>()
    val sms1 = SmsMessage("Привет, ты спишь?")
    skype.send(sms1)
}
class Messenger<T>() where T: Message, T: Logger{
    fun send(mes: T){
        mes.log()
    }
}
interface Message{ val text: String }
interface Logger{ fun log() }

class EmailMessage(override val text: String): Message, Logger{
    override fun log() = println("Email: $text")
}
class SmsMessage(override val text: String): Message, Logger{
    override fun log() = println("SMS: $text")
}
