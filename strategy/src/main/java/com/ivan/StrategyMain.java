package com.ivan;

/**
 * @author maohao
 */
public class StrategyMain {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt("314");
        int seed2 = Integer.parseInt("16");
        Player ivan = new Player("Ivan", new WinningStrategy(seed1));
        Player yumi = new Player("Yumi", new ProbStrategy(seed2));
        for (int i = 0; i < 100000; i++) {
            Hand hand1 = ivan.nextHand();
            Hand hand2 = yumi.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("winner: "+ ivan);
                ivan.win();
                yumi.lose();
            } else if (hand2.isStrongerThan(hand1)) {
                System.out.println("winner: "+yumi);
                yumi.win();
                ivan.lose();
            }else {
                System.out.println("even...");
                ivan.even();
                yumi.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(ivan.toString());
        System.out.println(yumi.toString());
    }
}
