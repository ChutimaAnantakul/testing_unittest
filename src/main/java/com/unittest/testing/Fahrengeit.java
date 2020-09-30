package com.unittest.testing;
public class Fahrengeit {
	 private double celcius;
	 private double Fahrengeit;
	 public double getCelcius() {
		return celcius;
	 }
	 public double getFahrenheit() {
			return Fahrengeit;
		}
	 public void input(double celcius) {
		 this.celcius = celcius;
	 }
	 public boolean isBound(double celcius) {
		 boolean isResult;
		 if(celcius >= -1000 && celcius <= 1000) {
			 isResult = true;
		 }else {
			 isResult = false;
		 }
		 return isResult;
	 }
	 
	 public void calculate() {
		 this.Fahrengeit = this.celcius*9/5+32;
	 }
	 
	 public String toString() {
//		 $number celcius = $number Fahrengeit
		 double Fahrengeit = this.getFahrenheit();
		 double celcius = this.getCelcius();
		 return Math.round(celcius)+" celcius = "+String.format("%.2f", Fahrengeit)+" Fahrengeit";
	 }
}