package solid.single_resposibility.violation

interface EmailService {


    fun sendEmail(
        recipient: String,
        subject: String, body: String
    )


    /**
     *  what if the the tempplate has many types , email , html marketing ...etc
     *  so why do you need to add the method here in a small class just responsible for
     *  sending or recieveing emails
     */
    fun loadEmailTemplate(type: String)

    fun updateEmailTemplate(
        templateName: String,
        newData: String
    )
}