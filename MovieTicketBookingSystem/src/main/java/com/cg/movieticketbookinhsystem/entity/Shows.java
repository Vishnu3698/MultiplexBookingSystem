package com.cg.movieticketbookinhsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="shows123")
public class Shows {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ShowsId")
	private Long  showsId;
	private String toDate;
	private String fromDate;
	private long slotNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "MovieId")
	private Movies movies;
	
	public Shows() {
		// TODO Auto-generated constructor stub
	}

	public Shows(String toDate, String fromDate, long slotNo) {
		super();
		
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.slotNo = slotNo;
		
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
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



	@Override
	public String toString() {
		return "Shows [showsId=" + showsId + ", toDate=" + toDate + ", fromDate=" + fromDate + ", slotNo=" + slotNo
				+ "]";
	}
	
	


}
