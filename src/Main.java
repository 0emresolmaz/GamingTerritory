import Adapters.MernisServiceAdapter;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Gamer gamer1 = new Gamer();
        gamer1.firstName = "Emre";
        gamer1.lastName = "Solmaz";
        gamer1.DateOfBirth = LocalDate.of(1989, 5, 27);
        gamer1.nationalityId = "20110008956";

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.add(gamer1);


        Game game1 = new Game(1, "PES 2018", 99.9, "PC");
        Game game2 = new Game(2, "NBA 2k17", 110.0, "PC");
        Game game3 = new Game(3, "MineCraft", 320.25, "X-Box");
        Game game4 = new Game(4, "Cyberpunk 2077", 700.5, "X-Box");

        Game[] games = new Game[]{game1, game2, game3, game4};
        SaleManager saleManager = new SaleManager();

        Campaign campaign1 = new Campaign(1, "Black Friday", "1 hafta süre geçerli", 30);

        saleManager.sell(games, gamer1, campaign1);
    }
}
