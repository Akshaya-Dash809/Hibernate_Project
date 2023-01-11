package com.vehicle.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "Twowheels")
public class TwoWheels extends Vehicle{
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public boolean isAbs() {
		return abs;
	}
	public void setAbs(boolean abs) {
		this.abs = abs;
	}
	public int getTyretype() {
		return tyretype;
	}
	public void setTyretype(int tyretype) {
		this.tyretype = tyretype;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
		
	}
}