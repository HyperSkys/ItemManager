package dev.hyperskys.itemmanager.eventbus.internal;

import dev.hyperskys.itemmanager.eventbus.annotation.EventHandler;
import dev.hyperskys.itemmanager.eventbus.event.Event;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.lang.reflect.Method;

@RequiredArgsConstructor
@Getter
public class EventInfo {
    private final Method method;
    private final Class<? extends Event> eventType;
    private final int priority;
    private final EventHandler listenerAnnotation;
    private final Object instance;

    @Override
    public String toString() {
        return "EventInfo{" +
                "method=" + method +
                ", eventType=" + eventType +
                ", priority=" + priority +
                ", listenerAnnotation=" + listenerAnnotation +
                ", instance=" + instance +
                '}';
    }
}