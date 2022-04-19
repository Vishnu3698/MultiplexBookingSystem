package com.cg.multiplexbookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="hall123")
public class Hall {
	@Id
	@Column(name="HallId")
	private Long hallId;
	private String hallDesc;
	private long totalCapacity;
	public Hall() {
		// TODO Auto-generated constructor stub
	}
	public Hall(Long hallId, String hallDesc, long totalCapacity) {
		super();
		this.hallId = hallId;
		this.hallDesc = hallDesc;
		this.totalCapacity = totalCapacity;
	}
	public Long getHallId() {
		return hallId;
	}
	public void setHallId(Long hallId) {
		this.hallId = hallId;
	}
	public String getHallDesc() {
		return hallDesc;
	}
	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}
	public long getTotalCapacity() {
		return totalCapacity;
	}
	public void setTotalCapacity(long totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	@Override
	public String toString() {
		return "Hall [hallId=" + hallId + ", hallDesc=" + hallDesc + ", totalCapacity=" + totalCapacity + "]";
	}

}
