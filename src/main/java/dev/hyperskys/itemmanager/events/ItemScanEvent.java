package dev.hyperskys.itemmanager.events;

import dev.hyperskys.itemmanager.ItemManager;
import dev.hyperskys.itemmanager.eventbus.annotation.EventHandler;
import dev.hyperskys.itemmanager.eventbus.event.EventPriority;
import dev.hyperskys.itemmanager.exception.ItemUnknownException;
import dev.hyperskys.itemmanager.items.CandyBar;
import dev.hyperskys.itemmanager.items.view.ChocolateType;
import dev.hyperskys.itemmanager.listeners.ItemScanListener;

public class ItemScanEvent {
    @EventHandler(priority = EventPriority.LOW)
    public void onScan(ItemScanListener event) {
        switch (event.itemNumber) {
            case 144720:
                CandyBar candyBarMilk = new CandyBar(ChocolateType.MILK);
                System.out.println("[" + candyBarMilk.getItemNumber() +  "] " + candyBarMilk.getName() + ": $"+candyBarMilk.getPrice());
                ItemManager.totalCost += candyBarMilk.getPrice();
                break;
            case 144721:
                CandyBar candyBarAlmond = new CandyBar(ChocolateType.ALMOND);
                System.out.println("[" + candyBarAlmond.getItemNumber() +  "] " + candyBarAlmond.getName() + ": $"+candyBarAlmond.getPrice());
                ItemManager.totalCost += candyBarAlmond.getPrice();
                break;
            case 144722:
                CandyBar candyBarCrunch = new CandyBar(ChocolateType.CRUNCH);
                System.out.println("[" + candyBarCrunch.getItemNumber() +  "] " + candyBarCrunch.getName() + ": $"+candyBarCrunch.getPrice());
                ItemManager.totalCost += candyBarCrunch.getPrice();
                break;

            default:
                throw new ItemUnknownException();
        }
    }
}
