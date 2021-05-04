package Concrete;

import Abstract.IGamerService;
import Abstract.IGamerServiceCheck;
import Entities.Gamer;

public class GamerManager implements IGamerService {

    private IGamerServiceCheck gamerServiceCheck;

    public GamerManager(IGamerServiceCheck gamerServiceCheck) {
        this.gamerServiceCheck = gamerServiceCheck;
    }

    @Override
    public void add(Gamer gamer) {
        if (gamerServiceCheck.checkIfRealPerson(gamer)) {
            System.out.println("Gamer eklendi : " + gamer.firstName);
        } else {
            System.out.println("Not a valid person: " + gamer.firstName);
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Gamer silindi : " + gamer.firstName);
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Gamer güncellendi : " + gamer.firstName);
    }
}