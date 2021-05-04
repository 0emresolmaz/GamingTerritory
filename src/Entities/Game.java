package Entities;

import Abstract.IEntity;

public class Game implements IEntity {
    public int id;
    public String name;
    public double price;
    public String platform;  // X-Box, PS4,PC etc.

    public Game() {

    }

    public Game(int id, String name, double price, String platform) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.platform = platform;
    }
}
