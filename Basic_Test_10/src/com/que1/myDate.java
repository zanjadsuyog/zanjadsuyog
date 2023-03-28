package com.que1;

import java.util.Objects;

public class myDate {

	// MyDate class (int dd,mm,yy)

	private int dd;
	private int mm;
	private int yy;

	public myDate() {

	}

	public myDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(dd, mm, yy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj;
		return dd == other.dd && mm == other.mm && yy == other.yy;
	}

	@Override
	public String toString() {
		return "myDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}
