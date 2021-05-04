package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya eklendi: "+campaign.Name);
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silindi: "+campaign.Name);
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncellendi: "+campaign.Name);
    }
}
