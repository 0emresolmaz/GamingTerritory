package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISalesService {
    @Override
    public void sell(Game[] games, Gamer gamer, Campaign campaign) {
        double sum = 0;
        for (Game game : games) {
            double discounted = game.price * (100 - campaign.DiscountRate) / 100;
            System.out.println(
                    "Oyun adı : " + game.name +
                            " İndirimsiz fiyatı : " + game.price +
                            " İndirimli fiyatı : " + discounted +
                            " Kampanya adı : " + campaign.Name +
                            " uygulandı.");
            sum += discounted;
        }
        System.out.println("Oyuncu adı :" + gamer.firstName + " " + gamer.lastName);
        System.out.println(" Toplam ödenecek tutar: " + sum);
    }
}
