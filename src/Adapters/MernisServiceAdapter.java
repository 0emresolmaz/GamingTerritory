package Adapters;

import Abstract.IGamerServiceCheck;
import Entities.Gamer;
import MernisReference.NVPKPSPublicSoap;

public class MernisServiceAdapter implements IGamerServiceCheck {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        boolean result = false;
        NVPKPSPublicSoap client = new NVPKPSPublicSoap();

        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(gamer.nationalityId), gamer.firstName, gamer.lastName, gamer.DateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
