package Concrete;

import Abstract.IGamerServiceCheck;
import Entities.Gamer;

public class GamerCheckManager implements IGamerServiceCheck {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        return false; //kendi checkerı mız
    }
}
