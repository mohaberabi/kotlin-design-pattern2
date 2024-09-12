package solid.single_resposibility.solution

interface EmailTemplateManager {
    fun loadEmailTemplate(type: String)

    fun updateEmailTemplate(
        templateName: String,
        newData: String
    )
}