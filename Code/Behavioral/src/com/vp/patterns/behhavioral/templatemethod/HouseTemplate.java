package com.vp.patterns.behhavioral.templatemethod;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildRoof();
	}

	public void buildFoundation() {
		System.out.println("Default implementation of buildFoundation . Feel free to overrride");
	}

	public abstract void buildPillars();

	public abstract void buildWalls();

	public abstract void buildRoof();

}
