package com.duckrace;

class BoardTest {
    public static void main(String[] args) {
        //create a board object, which inits its fields causing the file to get read.
        Board board = new Board();

        //update the board a few times
        board.update(3,Reward.PRIZE);
        board.update(3,Reward.DEBIT_CARD);
        board.update(10,Reward.DEBIT_CARD);
        board.update(13,Reward.DEBIT_CARD);
        board.update(1,Reward.PRIZE);
        board.update(5,Reward.PRIZE);
        board.update(3, Reward.DEBIT_CARD);
        board.update(13,Reward.DEBIT_CARD);

        board.show();
    }
}