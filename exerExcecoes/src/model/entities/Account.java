package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawlLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawlLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawlLimit = withDrawlLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawlLimit() {
		return withDrawlLimit;
	}

	public void setWithDrawlLimit(Double withDrawlLimit) {
		this.withDrawlLimit = withDrawlLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

	public void withDraw(Double amount) throws DomainException {

		if (amount > withDrawlLimit) {
			throw new DomainException(" The amount exceeds withdraw limit");
		}else {
			balance -= amount;
		}

		if (balance < amount){
			balance -= amount;
			throw new DomainException(" Not enough balance");
		}
	}

}
