package com.rakesh.task3;

public class BirdCage {

	BirdDAO daos;

	public BirdCage(BirdDAO daos) {
		this.daos = daos;

	}

	public boolean save(BirdDTO bdto) {
		if (bdto != null) {

			boolean found = daos.save(bdto);
			if (found) {
				System.out.println("Save Method invoked");

			} else {
				System.out.println("NO SAve Method");
			}
		}
		return false;
	}

	public void findByname(String name) {
		if (name != null) {

			boolean ref = daos.findByName(name);
			if (name != null) {
				System.out.println(ref.getName());
				System.out.println(ref.getOrigin());
				System.out.println(ref.getAge());
				System.out.println(ref.isCanFly());
				System.out.println(ref.getBreed());
			} else {
				System.out.println("VAlue is passing null");
			}

		}
	}

	public void displayDetailsOfBird() {
		if (daos != null) {
			daos.displayDetailsOfBird();
		}
	}
}
