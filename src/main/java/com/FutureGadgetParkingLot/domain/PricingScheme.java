package com.FutureGadgetParkingLot.domain;

import java.util.List;

public class PricingScheme {
    private List<Pricing> prices;

    public double getLostTicketPrice() {
        return lostTicketPrice;
    }

    public void setLostTicketPrice(double lostTicketPrice) {
        this.lostTicketPrice = lostTicketPrice;
    }

    private double lostTicketPrice;

    public PricingScheme(List<Pricing> prices) {
        this.prices = prices;
    }

    List<Pricing> getPrices() {
        return this.prices;
    }


}
