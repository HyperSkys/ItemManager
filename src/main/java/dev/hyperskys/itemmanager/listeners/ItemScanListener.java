package dev.hyperskys.itemmanager.listeners;

import dev.hyperskys.itemmanager.eventbus.event.Event;

public class ItemScanListener implements Event {

    public int itemNumber;

    public ItemScanListener(int itemNumber) {
        this.itemNumber = itemNumber;
    }
}
