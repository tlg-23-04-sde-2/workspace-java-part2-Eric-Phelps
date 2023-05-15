package com.crisp;
/*
 * Nat order is given by 'size'
 * THis is called the "sort key".
 */

class Radish implements Comparable<Radish>
{
    //properties
    private String color;
    private double size;
    private double tailLength;
    private int guysOnTop;

    //constructors

    public Radish(String color, double size, double tailLength, int guysOnTop)
    {
        //only using one constructor with all fields.
        setColor(color);
        setSize(size);
        setTailLength(tailLength);
        setGuysOnTop(guysOnTop);
    }


    //methods

    //accessors

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    public double getTailLength()
    {
        return tailLength;
    }

    public void setTailLength(double tailLength)
    {
        this.tailLength = tailLength;
    }

    public int getGuysOnTop()
    {
        return guysOnTop;
    }

    public void setGuysOnTop(int guysOnTop)
    {
        this.guysOnTop = guysOnTop;
    }

    @Override
    public int compareTo(Radish other)
    {
        return Double.compare(this.getSize(), other.getSize());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +":"+
                " color= " + getColor() +
                ", size= " + getSize() +
                ", tailLength=" + getTailLength() +
                ", guysOnTop=" + getGuysOnTop() +
                '.';
    }
}