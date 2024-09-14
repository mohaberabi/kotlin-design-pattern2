package patterns.behavioral.command


enum class VoiceAssistKeys(
    val humanText: String
) {

    Unknown("Hey siri , close door "),
    CloseDoor("Hey siri , close door "),
    OpenDoor("Hey siri , open door"),
    OpenTv("Hey siri , open tv"),
    CloseTv("hey siri , close tv "),
    OpenLight("hey siri , open light "),
    CloseLight("Hey siri , close light ")
}

class VoiceAssistant(

) {
    private val commands by lazy {
        mutableMapOf<VoiceAssistKeys, SmartHomeCommand>()
    }


    fun setCommand(
        key: VoiceAssistKeys,
        command: SmartHomeCommand
    ) {
        commands[key] = command
    }


    fun takeOrder(
        key: VoiceAssistKeys,
    ) = commands[key]?.execute()

    fun translateHumanText(text: String) {
        val key = when {
            handleHumanText(text = text, device = "door", isOpen = true) -> VoiceAssistKeys.OpenDoor
            handleHumanText(text = text, device = "door", isOpen = false) -> VoiceAssistKeys.CloseDoor
            handleHumanText(text = text, device = "light", isOpen = true) -> VoiceAssistKeys.OpenLight
            handleHumanText(text = text, device = "light", isOpen = false) -> VoiceAssistKeys.CloseLight
            handleHumanText(text = text, device = "tv", isOpen = true) -> VoiceAssistKeys.OpenTv
            handleHumanText(text = text, device = "tv", isOpen = false) -> VoiceAssistKeys.CloseTv
            else -> VoiceAssistKeys.Unknown
        }
        takeOrder(key)
    }

    private fun handleHumanText(
        device: String,
        text: String,
        isOpen: Boolean
    ): Boolean {
        val command = if (isOpen) "open" else "close"
        return text.contains(command) && text.contains(device)
    }
}