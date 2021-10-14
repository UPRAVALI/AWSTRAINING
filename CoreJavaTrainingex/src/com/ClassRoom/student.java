package com.ClassRoom;

public class student {

	private int a;
	private float b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public student(int a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "student [a=" + a + ", b=" + b + "]";
	}
	
}
