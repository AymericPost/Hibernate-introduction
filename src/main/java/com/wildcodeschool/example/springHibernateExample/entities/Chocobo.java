package com.wildcodeschool.example.springHibernateExample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chocobo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int speed;
	private int age;
	private int weight;
	
	public Chocobo(String name, int speed, int age, int weight) {
		this.name = name;
		this.speed = speed;
		this.age = age;
		this.weight = weight;
	}
	
	public Chocobo() {}
	
	@Override
    public String toString() {
        return "Chocobo [ id= " + id + ", Name= " + name + 
                ", speed= " + speed + "km/h, age= " + age + ", weight= " + weight +  "kg ]";
    }
	
	//Getters
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	//Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
