package practice;

import java.time.LocalDate;

public class Task {
	//プログラム作成
	private LocalDate date;
	private String plan;
	
	public Task(LocalDate date, String plan) {
		this.date = date;
		this.plan = plan;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getPlan() {
		return plan;
	}
	
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	@Override
	public String toString() {
		return this.date + ":" + this.plan;
	}
}
