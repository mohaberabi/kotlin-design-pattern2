package patterns.behavioral.command

class SmartHomeApp {
    fun handleCommand(
        command: SmartHomeCommand,
    ) = command.execute()
}


private fun main() {


    val light = SmartLight("light")
    val tv = SmartTv("Samsung")
    val door = SmartDoor("Door")
    val home = SmartHomeApp()
    with(home) {
        handleCommand(SmartHomeCommand.OpenTvCommand(tv))
        handleCommand(SmartHomeCommand.CloseTvCommand(tv))
        handleCommand(SmartHomeCommand.TurnOnLightCommand(light))
        handleCommand(SmartHomeCommand.TurnOnLightCommand(light))
        handleCommand(SmartHomeCommand.OpenDoorCommand(door))
        handleCommand(SmartHomeCommand.CloseDoorCommand(door))
    }

    val siri = VoiceAssistant()



    with(siri) {
        VoiceAssistKeys.entries.forEach {
            when (it) {
                VoiceAssistKeys.CloseDoor -> setCommand(it, SmartHomeCommand.CloseDoorCommand(door))
                VoiceAssistKeys.OpenDoor -> setCommand(it, SmartHomeCommand.CloseDoorCommand(door))
                VoiceAssistKeys.OpenTv -> setCommand(it, SmartHomeCommand.OpenTvCommand(tv))
                VoiceAssistKeys.CloseTv -> setCommand(it, SmartHomeCommand.CloseTvCommand(tv))
                VoiceAssistKeys.OpenLight -> setCommand(it, SmartHomeCommand.TurnOnLightCommand(light))
                VoiceAssistKeys.CloseLight -> setCommand(it, SmartHomeCommand.TurnOffLightCommand(light))
                else -> Unit
            }

            siri.translateHumanText(it.humanText)
        }
    }


}