package com.game.client;

import com.game.RoleCharacter;
import com.game.Spell;

import java.util.Arrays;

class RoleCharacterClientArgs {

    public static void main(String[] args) {
        // checking for arguments
        if (args.length < 2) {
            String usage = "Usage: com.game.client.RoleCharacterClientArgs <Spell> <name>";
            String example = "Example: java com.game.client.RoleCharacterClientArgs FIREBALL johnSmith";
            String note = "Spell names" + Arrays.toString(Spell.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        System.out.println("You provided " + args.length + " arguments");
        //Arguments to variables
        Spell spell = Spell.valueOf(args[0].toUpperCase());
        String name = args[1];

        //create a character object from these inputs
        RoleCharacter c1 = new RoleCharacter(spell, name);

        //Print it
        System.out.println(c1);
    }
}