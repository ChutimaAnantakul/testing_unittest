package com.unittest.testing;
public class Fahrengeit {
	 private double celcius;
	 public double getCelcius() {
		return celcius;
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
	 
	 public double calculate() {
		 double Fahrengeit = this.celcius*9/5+32;
		 return Fahrengeit;
	 }
	 
	 public String toString() {
//		 $number celcius = $number Fahrengeit
		 double Fahrengeit = this.calculate();
		 double celcius = this.getCelcius();
		 return Math.round(celcius)+" celcius = "+Math.round(Fahrengeit)+" Fahrengeit";
	 }
}