package com.xworkz.sports.award;

public class Ceremony {
	private String name;
	private String[] foods;
	
	public void distributeAward(String personName, String award)
	{
		System.out.println("******************************");
		System.out.println("Invoked distributeAward");
		System.out.println("arg1::"+personName);
		System.out.println("arg2::"+award);
	}
	public void displayFoods() {
		System.out.println("*******************************");
		System.out.println("Invoked displayFoods");
		System.out.println(this.foods);
		if(this.foods!=null) {
		for(int index=0;index<this.foods.length;index++)
		{
			System.out.println(this.foods[index]);
		}
		
		
	}
	}
	public void displayCeremonyNameAndFoods()
	{
		System.out.println("*********************************");
		System.out.println("Invoked displayCeremonyNameAndFoods");
		System.out.println(this.name);
		System.out.println(this.foods);
	}
	public void accessParentMembers()
	{
		//super() method is used to access the parent
		System.out.println("***********************************");
		int hCode=super.hashCode();
		System.out.println(hCode);
		String string=super.toString();
		System.out.println(string);
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getFoods() {
		return foods;
	}
	public void setFoods(String[] foods) {
		this.foods = foods;
	}

}
