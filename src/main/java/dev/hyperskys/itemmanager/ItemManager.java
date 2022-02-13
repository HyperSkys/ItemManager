package dev.hyperskys.itemmanager;

import dev.hyperskys.itemmanager.eventbus.EventBus;
import dev.hyperskys.itemmanager.events.ItemScanEvent;
import dev.hyperskys.itemmanager.listeners.ItemScanListener;
import dev.hyperskys.itemmanager.utils.CheckoutManager;

public class ItemManager {

    public static double totalCost;

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new ItemScanEvent());

        System.out.println("Items Scanned: ");
        ItemScanListener milkChocolate = new ItemScanListener(144720); // Milk Chocolate
        ItemScanListener almondChocolate = new ItemScanListener(144721);
        ItemScanListener crunchChocolate = new ItemScanListener(144722);

        eventBus.post(milkChocolate);
        eventBus.post(almondChocolate);
        eventBus.post(crunchChocolate);

        System.out.println("Total Cost: $"+totalCost);
        CheckoutManager.finialCheckout(totalCost);
    }
}
