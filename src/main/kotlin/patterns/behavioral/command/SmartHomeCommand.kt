package patterns.behavioral.command

sealed interface SmartHomeCommand {
    fun execute()


    data class TurnOnLightCommand(
        private val light: SmartLight,
    ) : SmartHomeCommand {
        override fun execute() {
            light.turnOn()
        }
    }

    data class TurnOffLightCommand(
        private val light: SmartLight,
    ) : SmartHomeCommand {
        override fun execute() {
            light.turnOff()
        }
    }

    data class OpenTvCommand(
        private val tv: SmartTv,
    ) : SmartHomeCommand {
        override fun execute() {
            tv.turnOn()
        }
    }

    data class CloseTvCommand(
        private val tv: SmartTv,
    ) : SmartHomeCommand {
        override fun execute() {
            tv.turnOff()
        }
    }

    data class OpenDoorCommand(
        private val door: SmartDoor,
    ) : SmartHomeCommand {
        override fun execute() {
            door.unlock()
        }
    }

    data class CloseDoorCommand(
        private val door: SmartDoor,
    ) : SmartHomeCommand {
        override fun execute() {
            door.lock()
        }
    }
}