package com.duckrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/*
 * This is a lookup table of ids to student names.
 * When a duck wins for the first time, we need to find out who that is.
 * This lookup table could be hardcoded with the data, or we could read the data 
 * in from a file, so that no code changes would need to be made for each cohort.
 *
 * Map<Integer,String> studentIdMap;
 * 
 * Integer    String
 * =======    ======
 *    1       John
 *    2       Jane
 *    3       Danny
 *    4       Armando
 *    5       Sheila
 *    6       Tess
 * 
 *
 * We also need a data structure to hold the results of all winners.
 * This data structure should facilitate easy lookup, retrieval, and storage.
 *
 * Map<Integer,DuckRacer> racerMap;
 *
 * Integer    DuckRacer
 * =======    =========
 *            id    name     wins   rewards
 *            --    ----     ----   -------
 *    5        5    Sheila     2    PRIZES, PRIZES
 *    6        6    Tess       1    PRIZES
 *   13       13    Zed        3    PRIZES, DEBIT_CARD, DEBIT_CARD
 *   17       17    Dom        1    DEBIT_CARD
 */

class Board {
    private final Map<Integer,String> studentIdMap = loadStudentIdMap();
    private final Map<Integer,DuckRacer> racerMap  = new TreeMap<>();//tree map maintains natural order of the keys.

    //updates the board by making th duck racer win.
    public void update(int id, Reward reward){
        DuckRacer racer = null;
        if (racerMap.containsKey(id)){
            racer = racerMap.get(id);
        }
        else{
            racer = new DuckRacer(id, studentIdMap.get(id));
            racerMap.put(id, racer);
        }
        racer.win(reward);
    }

    //TODO: render this data pretty, for display to the end user.
    void show() {
        Collection<DuckRacer> racers = racerMap.values();
        System.out.println("DUCK RACE RESULTS");
        System.out.println("=================");
        System.out.println();
        System.out.println("id       name       wins   rewards");
        System.out.println("__       ____       ____   _______");
        //see java part 1 session 5 formatted output
        for (DuckRacer racer : racers)
        {
            System.out.println(racer.getId()+"       "+racer.getName()+"       "+ racer.getWins()+"   "+racer.getRewards());
        }

    }

    private Map<Integer, String> loadStudentIdMap(){
        Map<Integer, String> idMap = new HashMap<>();

        //how are we going to read in our csv file to get the information into the new Hashmap.
        try {
            List<String> lines = Files.readAllLines(Path.of("conf/student-ids.csv"));
            //for each line in the file, split it into tokens
            for (String line: lines){
                String[] tokens = line.split(","); // ["5","eric"]
                idMap.put(Integer.valueOf(tokens[0]), tokens[1]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return idMap;
    }


}