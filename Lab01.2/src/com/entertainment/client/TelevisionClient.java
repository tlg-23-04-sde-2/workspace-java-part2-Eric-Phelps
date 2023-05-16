package com.entertainment.client;

import com.entertainment.Television;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient
{
    public static void main(String[] args)
    {
//        Television tv1 = new Television();
//        Television tv2 = new Television("RCA",10);
//        System.out.println(tv1);
//        System.out.println(tv2);
//        tv2.changeChannel(9);
//        System.out.println(tv2);
//        System.out.println();

        Television tvA = new Television("Sony",50);
        Television tvB = new Television("Sony",50);
        Television tvC = new Television("Samsung",47);
        Television tvD = new Television("LG",52);

        System.out.println("tvA==tvB:" + (tvA == tvB));
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));
        System.out.println();

        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as duplicate, and size is still one.
        tvs.add(tvC);
        tvs.add(tvD);
        System.out.println("The size of the set is: " + tvs.size());
        dump(tvs);


    }

    //helper method to dump a Collection vertically
    private static void dump(Set<Television> tvs)
    {
        for (Television tv : tvs)
        {
            System.out.println(tv);
        }
    }
}