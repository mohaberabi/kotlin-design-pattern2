package patterns.structural.flyweight.video_game.game

import patterns.structural.flyweight.video_game.player.BotPlayer
import patterns.structural.flyweight.video_game.player.BotType
import patterns.structural.flyweight.video_game.player.UserPlayer


fun main() {


    val player = UserPlayer()

    val weaponsDataStore = WeaponsDataStore()
    val weapon1 = weaponsDataStore.getWeapon("akm")
    val weapon2 = weaponsDataStore.getWeapon("akm")
    val weapon3 = weaponsDataStore.getWeapon("akm")
    val weapon4 = weaponsDataStore.getWeapon("ump")
    val weapon5 = weaponsDataStore.getWeapon("ump")
    val weapon6 = weaponsDataStore.getWeapon("ump")


    println(weaponsDataStore.weapons.size)
    val zombieDataStore = BotPlayerDataStore()
    val zombies = buildList<BotPlayer> {

        repeat(10) {
            add(zombieDataStore.getBot(BotType.Weak))
        }
        repeat(10) {
            add(zombieDataStore.getBot(BotType.Strong))
        }

    }

    println(zombieDataStore.zombies.size)

}