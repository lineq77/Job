package models;

import javafx.beans.property.*;

public class Client {
	
	private final StringProperty status;
	private final StringProperty name;
	private final DoubleProperty balance;
	
	public Client() {
		this(null, null, null);
	}
	
	public Client(String status, String name, Double balance) {
		this.status = new SimpleStringProperty(status);
		this.name = new SimpleStringProperty(name);
		this.balance = new SimpleDoubleProperty(balance);
	}
	
	public String getStatus() {
		return status.get();
	}
	
	public void setStatus(String status) {
		this.status.set(status);
	}
	
	public StringProperty statusProperty() {
		return status;
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public Double getBalance() {
		return balance.get();
	}
	
	public void setBalance(Double balance) {
		this.balance.set(balance);
	}
	
	public DoubleProperty balanceProperty() {
		return balance;
	}
}
