package patterns.structural.flyweight.video_game.player

import patterns.structural.flyweight.video_game.weapon.Weapon


enum class BotType {
    Weak,
    Strong
}

abstract class BotPlayer(private val type: BotType) : Player

class WeakBot() : BotPlayer(BotType.Weak) {
    override var health: Int = 100
    override var power: Int = 50
    override var weapon: Weapon? = null
}

class StrongBot : BotPlayer(BotType.Strong) {
    override var health: Int = 100
    override var power: Int = 80
    override var weapon: Weapon? = null
}