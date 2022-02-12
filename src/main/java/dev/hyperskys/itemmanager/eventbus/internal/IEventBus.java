package dev.hyperskys.itemmanager.eventbus.internal;

import dev.hyperskys.itemmanager.eventbus.annotation.EventHandler;
import dev.hyperskys.itemmanager.eventbus.event.Event;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public interface IEventBus {
    /**
     * Register a listener class
     * This will only register static methods
     * @param event
     */
    void register(Class<?> event);

    /**
     * Register a listener class instance
     * This will register both static and instance methods
     * @param listener
     */
    void register(Object listener);

    /**
     * Unregister a listener instance
     * @param listener
     */
    void unregister(Object listener);

    /**
     * Unregister a listener class
     * @param event
     */
    void unregister(Class<?> event);

    /**
     * Register a EventHandler annotation, method and instance
     * @param handler The EventHandler annotation
     * @param method The method to register
     * @param instance The instance to register
     */
    void register(EventHandler handler, Method method, Object instance);

    default void register(EventHandler handler, Method method) {
        register(handler, method, null);
    }

    /**
     * Get a map of all registered listeners
     * @return
     */
    Map<Class<? extends Event>, List<EventInfo>> getListeners();

    /**
     * call an event
     * @param event
     */
    void call(Event event);

    /**
     * call an event
     * @param event
     */
    default void callEvent(Event event) {
        call(event);
    }

    /**
     * call an event
     * @param event
     */
    default void post(Event event) {
        call(event);
    }
}