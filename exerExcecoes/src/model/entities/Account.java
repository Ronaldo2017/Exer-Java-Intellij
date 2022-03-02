package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawlLimi;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawlLimi) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawlLimi = withDrawlLimi;
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

	public Double getWithDrawlLimi() {
		return withDrawlLimi;
	}

	public void setWithDrawlLimi(Double withDrawlLimi) {
		this.withDrawlLimi = withDrawlLimi;
	}

	public void deposit(Double amount){
		balance += amount;
	}

	public void withDraw(Double amount){
		balance -= amount;
	}
}
