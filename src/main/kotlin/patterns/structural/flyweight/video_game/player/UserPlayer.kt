package patterns.structural.flyweight.video_game.player

import patterns.structural.flyweight.video_game.weapon.Weapon

class UserPlayer(
) : Player {
    override var health: Int = 100
    override var power: Int = 10
    override var weapon: Weapon? = null
}


