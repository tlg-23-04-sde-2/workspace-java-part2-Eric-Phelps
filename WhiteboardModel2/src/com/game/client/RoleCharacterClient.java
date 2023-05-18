package com.game.client;

import com.game.RoleCharacter;
import com.game.Spell;

class RoleCharacterClient {

    public static void main(String[] args) {
        //Assigns the values to a new instance of Role Character
        RoleCharacter char1 = new RoleCharacter();
        RoleCharacter char2 = new RoleCharacter(Spell.TELEPORT, "John Cena");
        char1.setName("Leroy Jenkins");
        char1.setSpell(Spell.FIREBALL);

        char1.castSpell();
        char1.levelUp();
        char1.usePotion();
        System.out.println();
        char2.castSpell();
        char2.levelUp();
        char2.usePotion();

        System.out.println(char1);
    }
}