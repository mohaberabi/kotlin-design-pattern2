package solid.single_resposibility.solution

interface EmailSender {
    fun sendEmail(
        recipient: String,
        subject: String, body: String
    )

}