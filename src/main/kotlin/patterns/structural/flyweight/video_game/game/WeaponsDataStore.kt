package patterns.structural.flyweight.video_game.game

import patterns.structural.flyweight.video_game.weapon.Weapon

class WeaponsDataStore {


    val weapons = mutableMapOf<String, Weapon>()
    fun getWeapon(id: String): Weapon {
        return weapons.getOrPut(id) { Weapon(id) }
    }

}