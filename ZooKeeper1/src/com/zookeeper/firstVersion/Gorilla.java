package com.zookeeper.firstVersion;

public class Gorilla extends Mammal {
	
	public Gorilla throwSomething() {
		System.out.println("Gorilla threw something and lost 5 energy.");
		this.energyLevel -= 5;
		return this;
	}
	
	public Gorilla eatBananas() {
		System.out.println("Gorilla just had a banana and gained 10 energy.");
		this.energyLevel += 10;
		return this;
	}
	
	public Gorilla climb() {
		System.out.println("Gorilla has jusy climbed a tree and lost 10 energy.");
		this.energyLevel -= 10;
		return this;
	}

}
