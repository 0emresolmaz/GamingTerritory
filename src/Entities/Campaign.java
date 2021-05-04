package Entities;

public class Campaign {
    public int Id;
    public String Name;
    public String CampaignDetails;
    public double DiscountRate;

    public Campaign() {
    }

    public Campaign(int id, String name, String campaignDetails, double discountRate) {
        Id = id;
        Name = name;
        CampaignDetails = campaignDetails;
        DiscountRate = discountRate;
    }
}
