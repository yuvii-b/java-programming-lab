package week3;

import java.util.Random;

public class GameAthlete {
    private String name;
    private int energy;
    private int skillPower;
    private int maxEnergy;
    private boolean isActive;
    private static int totalAthletes = 0;
    private static final Random random = new Random();

    // default constructor
    public GameAthlete(){
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 500;
        this.isActive = true;
        GameAthlete.totalAthletes++;
    }

    // parameterized constructor
    public GameAthlete(String name, int energy, int skillPower, int maxEnergy) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = maxEnergy;
        this.isActive = true;
        GameAthlete.totalAthletes++;
    }

    public void compete(GameAthlete opponent){
        // handling isActive cases
        if(!this.isActive){
            System.out.println(this.name + " is inactive and cannot compete");
            return;
        }
        if(!opponent.isActive){
            System.out.println(opponent.name + " is inactive and cannot attack");
            return;
        }
        opponent.energy -= this.skillPower;
        if(opponent.energy <= 0){
            opponent.energy = 0;
            opponent.isActive = false;
            System.out.println(this.name + " strikes with " + this.skillPower + " power on " + opponent.name);
            System.out.println("Opponent is dead");
        } else{
            System.out.println(this.name + " strikes with " + this.skillPower + " power on " + opponent.name);
            System.out.println(opponent.name + "'s remaining energy: " + opponent.energy);
        }
    }

    public void rest(int amount){
        if(!isActive){
            System.out.println(name + " is inactive and cannot rest");
            return;
        }
        energy += amount;
        if(energy > maxEnergy){
            energy = maxEnergy;
        }
        System.out.println(name + " rests and recovers. Energy is now: " + energy);
    }

    public void train(){
        if (!isActive) {
            System.out.println(name + " is inactive and cannot train.");
            return;
        }
        int points = random.nextInt(11);
        skillPower += points;
        System.out.println(name + " trained and gained " + points + " skill power.");
        System.out.println("Updated skill power: " + skillPower);
    }

    public void displayStats(){
        System.out.println("Athlete Information: ");
        System.out.println("Name: " + this.name);
        System.out.println("Energy: " + this.energy);
        System.out.println("Max Energy: " + this.maxEnergy);
        System.out.println("Skill power: " + this.skillPower);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }

    public static void displayStatus(){
        System.out.println("\nTotal Athletes Created: " + totalAthletes);
    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 3 | Question - Athlete Game\n");

        System.out.println("This is a simulation of two athlete bots competing. " +
                "Each round, they either fight (compete), train, or rest. " +
                "The game continues until one of them is defeated.\n");

        GameAthlete bot1 = new GameAthlete("Clark", 150, 20, 200);
        GameAthlete bot2 = new GameAthlete("Bruce", 150, 18, 200);

        bot1.displayStats();
        bot2.displayStats();

        System.out.println("\nFight Begins!\n");

        int round = 1;

        while (bot1.isActive && bot2.isActive) {
            System.out.println("------ Round " + round + " ------");

            if (round % 2 == 1) {
                // Compete round
                bot1.compete(bot2);
                if (!bot2.isActive) break;

                bot2.compete(bot1);
            } else {
                // Training round
                bot1.train();
                bot2.train();
            }

            // Rest every 3 rounds
            if (round % 3 == 0) {
                bot1.rest(20);
                bot2.rest(20);
            }

            round++;
            System.out.println();
        }

        System.out.println("Game Over!\n");

        if (!bot1.isActive && !bot2.isActive) {
            System.out.println("Result: Draw! Both bots are down.");
        } else if (bot1.isActive) {
            System.out.println("Winner: " + bot1.name);
        } else {
            System.out.println("Winner: " + bot2.name);
        }

        System.out.println();
        bot1.displayStats();
        bot2.displayStats();

        GameAthlete.displayStatus();
    }
}