package main.java.com.svn.entities;

public class Counter {
	
	int count = 0;
	
	public int increment() {
		return ++count;
	}
	
	public int decrement() {
		return --count;
	}
	
	public int getValeur() {
		return count;
	}
}
