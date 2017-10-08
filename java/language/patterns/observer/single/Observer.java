package org.gazampa.patterns.observer.fatbridge;

public interface Observer{

	public void register(Notification obj);

	public void unregister(Notification obj);

	public void message(MessageGenerator generator);

}