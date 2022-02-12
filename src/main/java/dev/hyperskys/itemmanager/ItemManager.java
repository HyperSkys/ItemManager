package dev.hyperskys.itemmanager;

import dev.hyperskys.itemmanager.eventbus.EventBus;
import dev.hyperskys.itemmanager.events.ItemScanEvent;
import dev.hyperskys.itemmanager.listeners.ItemScanListener;

public class ItemManager {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new ItemScanEvent());
        ItemScanListener itemScanListener = new ItemScanListener(144720);
        eventBus.post(itemScanListener);
    }
}
