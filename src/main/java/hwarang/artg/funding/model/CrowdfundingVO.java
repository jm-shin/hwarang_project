package hwarang.artg.funding.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("CrowdfundingVO")
public class CrowdfundingVO {
	private int num;
	private int price;
	private String subject;
	private String content;
	private Date created_date;
	private Date target_date;
	private int target_amount;
	private int current_collection;
	private int hit;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getTarget_date() {
		return target_date;
	}

	public void setTarget_date(Date target_date) {
		this.target_date = target_date;
	}

	public int getTarget_amount() {
		return target_amount;
	}

	public void setTarget_amount(int target_amount) {
		this.target_amount = target_amount;
	}

	public int getCurrent_collection() {
		return current_collection;
	}

	public void setCurrent_collection(int current_collection) {
		this.current_collection = current_collection;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "CrowdfundingVO [num=" + num + ", price=" + price + ", subject=" + subject + ", content=" + content
				+ ", created_date=" + created_date + ", target_date=" + target_date + ", target_amount=" + target_amount
				+ ", current_collection=" + current_collection + ", hit=" + hit + "]";
	}

}
