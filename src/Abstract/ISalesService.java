package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISalesService {
    void sell(Game[] games, Gamer gamer, Campaign campaign);
}
