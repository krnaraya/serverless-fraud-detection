
package org.redhat;

public class Transaction {

	private String name;
	private String reference;
	private String mode;
	private String location;
	private Integer amount;

	public Transaction() {

	}

	public Transaction(String name, String reference, String mode, String location, Integer amount) {
		super();
		this.name = name;
		this.reference = reference;
		this.mode = mode;
        this.location = location;
        this.amount = amount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [Name=" + name + ", reference=" + reference + ", mode=" + mode + ", location="
				+ location + ", amount=" + amount + "]";
	}

}