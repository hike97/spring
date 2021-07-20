package com.mashibing;

/**
 * @author hike97
 * @create 2021-07-16 17:27
 * @desc
 **/
public class Person {

	private String id;

	private String name;

	public String getId () {
		return id;
	}

	public void setId (String id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	@Override
	public String toString () {
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
