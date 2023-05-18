package com.game;

public class RoleCharacter {
    //fields
    private Spell spell;
    private int level = 1;
    private String name = "Jane doe";
    public static final int MAX_LEVEL = 10;
    private static final int MIN_NAME_LENGTH = 3;

    //constructors
    public RoleCharacter() {
        //no op
    }

    public RoleCharacter(Spell spell) {
        setSpell(spell);
    }

    public RoleCharacter(Spell spell, String name) {
        this(spell);
        setName(name);
    }

    //second set the methods / functions / operations
    public void castSpell() {
        System.out.println(getName() + " Casts " + getSpell());
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
            System.out.println("Congratulation on leveling up to " + getLevel());
        } else {
            System.out.println("Max level already reached.");
        }
    }

    public void usePotion() {
        System.out.println(getName() + " health is restored");
    }

    //add data encapsulation (accessor methods)
    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell Spell) {
        this.spell = Spell;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            System.out.println("Please enter a name longer than: " + name.length());
        }
    }

    //toString
    public String toString() {
        return "character info: " + getName() + " level: " + getLevel() + " available spell: " + getSpell();
    }
}