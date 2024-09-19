package patterns.structural.flyweight.video_game.player

import patterns.structural.flyweight.video_game.weapon.Weapon


interface Player {


    var health: Int
    var power: Int
    var weapon: Weapon?


    fun attack(enemie: Player) {
        weapon?.let {
            enemie.health -= it.power
        }
    }

    fun gotAttacked(enemie: Player) {
        enemie.weapon?.let {
            health -= it.power
        }
    }

    fun addWeapon(weapon: Weapon) {
        this.weapon = weapon
    }
}
