package com.duckrace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class DuckRacer
{
    //properties
    private int id;
    private String name;
    private final Collection<Reward> rewards = new ArrayList<>();

    //constructors
    public DuckRacer(int id, String name)
    {
        //direct field assignment
        this.id = id;
        setName(name);

    }

    //action methods
    public void win(Reward reward)
    {
        rewards.add(reward);
    }

    //accessor methods
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // this is a derived property.
    public int getWins()
    {
        return rewards.size();
    }

    public List getRewards()
    {
        return Collections.unmodifiableList(rewards);
    }

    @Override
    public String toString() {
        return String.format("%s: id=%s, name=%s, wins=%s, reward=%s",
                getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());
    }
}