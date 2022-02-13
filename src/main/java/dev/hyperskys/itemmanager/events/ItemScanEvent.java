package dev.hyperskys.itemmanager.events;

import dev.hyperskys.itemmanager.ItemManager;
import dev.hyperskys.itemmanager.eventbus.annotation.EventHandler;
import dev.hyperskys.itemmanager.eventbus.event.EventPriority;
import dev.hyperskys.itemmanager.items.CandyBar;
import dev.hyperskys.itemmanager.items.view.ChocolateType;
import dev.hyperskys.itemmanager.listeners.ItemScanListener;

public class ItemScanEvent {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onScan(ItemScanListener event) {
        if (event.itemNumber == 144720) {
            CandyBar candyBar = new CandyBar(ChocolateType.MILK);
            System.out.println("[" + candyBar.getItemNumber() +  "] " + candyBar.getName() + ": $"+candyBar.getPrice());
            ItemManager.totalCost += candyBar.getPrice();
        } else if (event.itemNumber == 144721) {
            CandyBar candyBar = new CandyBar(ChocolateType.ALMOND);
            System.out.println("[" + candyBar.getItemNumber() +  "] " + candyBar.getName() + ": $"+candyBar.getPrice());
            ItemManager.totalCost += candyBar.getPrice();
        } else if (event.itemNumber == 144722) {
            CandyBar candyBar = new CandyBar(ChocolateType.CRUNCH);
            System.out.println("[" + candyBar.getItemNumber() +  "] " + candyBar.getName() + ": $"+candyBar.getPrice());
            ItemManager.totalCost += candyBar.getPrice();
        }
    }
}
