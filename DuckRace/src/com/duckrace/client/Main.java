package com.duckrace.client;

import com.duckrace.app.DuckRaceApp;

/*
 * Get the application going, no actual work is done in the main class.
 */
class Main {
    public static void main(String[] args) {
        //instantiate the controller and say GO
        DuckRaceApp app = new DuckRaceApp();
        app.execute();
    }
}