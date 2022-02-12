package dev.hyperskys.itemmanager.items;

import dev.hyperskys.itemmanager.items.view.ChocolateType;
import dev.hyperskys.itemmanager.main.Item;

public class CandyBar implements Item {

    ChocolateType chocolateType;
    public CandyBar(ChocolateType chocolateType){this.chocolateType = chocolateType;}

    @Override
    public double getPrice() {

        switch (chocolateType) {
            case MILK:
                return 1.99;

            case ALMOND:
                return 2.99;

            case CRUNCH:
                return 3.99;
        }

        return 0.00;
    }

    @Override
    public String getName() {

        switch (chocolateType) {
            case MILK:
                return "Milk Chocolate Bar";

            case ALMOND:
                return "Almond Chocolate Bar";

            case CRUNCH:
                return "Crunch Choclate Bar";
        }

        return null;
    }

    @Override
    public int getItemNumber() {

        switch (chocolateType) {
            case MILK:
                return 144720;

            case ALMOND:
                return 144721;

            case CRUNCH:
                return 144722;
        }

        return 0;
    }
}
