package com.duckrace;

import java.util.Collection;
import java.util.List;

class DuckRacerTest
{
    public static void main(String[] args)
    {
        DuckRacer racer10 = new DuckRacer(10, "kevin");
        System.out.println(racer10);

        //make it win a few times
        racer10.win(Reward.DEBIT_CARD);
        racer10.win(Reward.PRIZE);
        racer10.win(Reward.PRIZE);
        System.out.println(racer10);

        //cheat
        List <Reward> rewardsList = racer10.getRewards();
//        rewardsList.add(Reward.DEBIT_CARD);
//        rewardsList.add(Reward.DEBIT_CARD);
//        rewardsList.add(Reward.DEBIT_CARD);

        System.out.println(rewardsList);
    }
}