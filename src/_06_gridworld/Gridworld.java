package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Bug bug1 = new Bug(Color.blue);
		Flower flower = new Flower();
		Flower flower1 = new Flower();
		Location location = new Location(0,0);
		Location location1 = new Location(5,5);
		Location location2 = new Location(5,4);
		Location location3 = new Location(5,6);
		Location location4 = null;
		world.show();
		world.add(location,bug);
		world.add(location1,bug1);
		bug1.turn();
		world.add(location2, flower);
		world.add(location3, flower);
		for (int i = 0; i<10; i++) {
			for (int j=0; j<10;j++) {
				location4 = new Location(j,i);
			world.add(location4, flower);
			}
		}
	}
}
