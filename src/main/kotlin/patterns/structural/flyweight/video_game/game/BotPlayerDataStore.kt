package patterns.structural.flyweight.video_game.game

import patterns.structural.flyweight.video_game.player.BotPlayer
import patterns.structural.flyweight.video_game.player.BotType
import patterns.structural.flyweight.video_game.player.StrongBot
import patterns.structural.flyweight.video_game.player.WeakBot
import patterns.structural.flyweight.video_game.weapon.Weapon

class BotPlayerDataStore {

    val zombies = mutableMapOf<BotType, BotPlayer>()
    fun getBot(type: BotType): BotPlayer {
        return zombies.getOrPut(type) {
            when (type) {
                BotType.Weak -> WeakBot()
                BotType.Strong -> StrongBot()
            }
        }
    }

}