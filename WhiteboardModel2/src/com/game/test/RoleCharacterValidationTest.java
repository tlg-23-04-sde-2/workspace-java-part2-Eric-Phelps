package com.game.test;

import com.game.RoleCharacter;

import static com.game.RoleCharacter.MAX_LEVEL;

class RoleCharacterValidationTest {

    public static void main(String[] args) {
        RoleCharacter c1 = new RoleCharacter();
        RoleCharacter c2 = new RoleCharacter();
        RoleCharacter c3 = new RoleCharacter();

        //Testing naming min length requirement
        c1.setName("J");
        System.out.println(c1.getName());
        c2.setName("JM");
        System.out.println(c2.getName());
        c3.setName("Jay");
        System.out.println(c3.getName());

        //testing max leveling limit
        while (c1.getLevel() < MAX_LEVEL) {
            c1.levelUp();
        }
        c1.levelUp();                   //should fail
    }
}