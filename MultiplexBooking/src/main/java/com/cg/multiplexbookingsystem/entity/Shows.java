package com.cg.multiplexbookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="shows123")
public class Shows 
{
	@Id
	@Column(name="ShowsId")
	private Long  showsId;
	private String toDate;
	private String fromDate;
	private long slotNo;
	private long moviesId;
	
	public Shows() {
		// TODO Auto-generated constructor stub
	}

	public Shows(Long showsId, String toDate, String fromDate, long slotNo, long moviesId) {
		super();
		this.showsId = showsId;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.slotNo = slotNo;
		this.moviesId = moviesId;
	}

	public Long getShowsId() {
		return showsId;
	}

	public void setShowsId(Long showsId) {
		this.showsId = showsId;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public long getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(long slotNo) {
		this.slotNo = slotNo;
	}

	public long getMoviesId() {
		return moviesId;
	}

	public void setMoviesId(long moviesId) {
		this.moviesId = moviesId;
	}

	@Override
	public String toString() {
		return "Shows [showsId=" + showsId + ", toDate=" + toDate + ", fromDate=" + fromDate + ", slotNo=" + slotNo
				+ ", moviesId=" + moviesId + "]";
	}
	
	

}
