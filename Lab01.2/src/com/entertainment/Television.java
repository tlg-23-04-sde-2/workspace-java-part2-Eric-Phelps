package com.entertainment;

import java.util.Objects;

/*
 * Nat order is defined by string brand.
 */

public class Television implements Comparable<Television>
{
    //properties
    private String brand;
    private int volume;
    private Tuner tuner = new Tuner(); // instantiated internally

    //constructors
    public Television()
    {
        //left blank intentionally
    }


    public Television(String brand, int volume)
    {
        this.brand = brand;
        this.volume = volume;
    }

    //methods
    public int getCurrentChannel()
    {
       return tuner.getChannel(); // delegate to the tuner
    }
    public void changeChannel(int channel)
    {
        tuner.setChannel(channel); // delegate the tuner
    }


    //accessors
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    /*
     * Nat order is defined by brand then by volume.
     * to be consistant with equals, we must use the same properties
     * for nat order that we use for equals() and hashcode.
     */
    @Override
    public int compareTo(Television other)
    {
        int result = this.getBrand().compareTo(other.getBrand());

        if (result == 0) // if tied on brand, break the tie by volume.
        {
            result = Integer.compare(this.getVolume(), other.getVolume());
        }

        return result;
    }

    @Override
    public int hashCode()
    {
        //this will be a poorly written hash function, because it easily yields "hash collisions".
        //a HC is when diff objects hash to the same value.
        //return getBrand().length() + getVolume();
        return Objects.hash(getBrand(),getVolume());

    }

    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        //only proceed if true.
        if ( obj instanceof Television)
        {
            Television other = (Television) obj;
            result = this.getBrand().equals(other.getBrand()) &&
                    this.getVolume() == (other.getVolume());
        }

        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() +
                ", channel=" + getCurrentChannel() +
                '}';
    }
}