package org.gazampa.patterns.observer.fatbridge;

/** any kind of object can sign up to get messages**/

public interface Notification{

	public void message();

	public void setMessageData(String message);

	public void register(Observer observer);

	public void unregister(Observer observer);

}