// Create a game.util package and place this class in it
// Vehicle class

package game.utils;

public class Vehicle {
    int modelId, color1, color2;
    String regisNum;

    public Vehicle (int modelId, int color1, int color2) {
        this.modelId = modelId;
        this.color1 = color1;
        this.color2 = color2;
    }
    public void setterRegis (String regisNum) {
        this.regisNum = regisNum;
    }

    public String getterRegis () {
        return regisNum;
    } 
}

// Place this class inside 'game' pacakage
// Player class

package game;

import game.utils.Vehicle;

public class Player {
    private String name, IPaddress;
    private int health;
    private Vehicle vehicle;

    public Player(String name, String IPaddress, int health, Vehicle vehicle) {
        this.name = name;
        this.IPaddress = IPaddress;
        this.health = health;
        this.vehicle = vehicle;
        }

    public Player(String name, String IPaddress, int health) {
            this.name = name;
            this.IPaddress = IPaddress;
            this.health = health;
            this.vehicle = null;
       }
    

    @Override
    public String toString() {
        
        String s = "The Player Name: " + name + " IP-address: " + IPaddress + " Health: " + health;
        if (this.vehicle != null) {
            s = s + " RegisNum: " + vehicle.getterRegis();
        }
        
        return s;
    }
}

// Place this class inside 'game' package
// Player class

package game;
import game.utils.Vehicle;

public class Main {
    public static void main(String [] args) {
        Vehicle vehicle1 = new Vehicle(2000, 001, 002);
        vehicle1.setterRegis("LE-001");
        Vehicle vehicle2 = new Vehicle(2002, 003, 004);
        vehicle2.setterRegis("LE-002");
        Vehicle vehicle3 = new Vehicle(2004, 005, 006);
        vehicle3.setterRegis("LE-003");

        Player player1 = new  Player("Anees", "alpha1", 87, vehicle1);
        Player player2 = new  Player("Umer", "alpha2", 67);


        System.out.println(player1);
        System.out.println(player2);

    }
}

