package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise22p1 {

	List<List<String>> virusGrid = new ArrayList<>();

	char direction = 'U';

	Integer positionX;

	Integer positionY;

	Integer becameInfected = 0;

	public void execute() {

		buildVirusGrid();

		for(int i = 0; i < 10000; i++){
			turn();
			infectOrClean();
			move();
		}
		System.out.println(becameInfected);
	}

	private void turn(){
		boolean infected = (virusGrid.get(positionY).get(positionX).equals("#"));

		switch (direction){
			case 'U':
				if(infected)
					direction = 'R';
				else
					direction = 'L';
				break;

			case 'D':
				if(infected)
					direction = 'L';
				else
					direction = 'R';
				break;

			case 'L':
				if(infected)
					direction = 'U';
				else
					direction = 'D';
				break;

			case 'R':
				if(infected)
					direction = 'D';
				else
					direction = 'U';
				break;
		}
	}

	private void infectOrClean(){
		if(virusGrid.get(positionY).get(positionX).equals("#"))
			virusGrid.get(positionY).set(positionX, ".");
		else {
			virusGrid.get(positionY).set(positionX, "#");
			becameInfected++;
		}
	}

	private void move(){

		switch (direction){
			case 'U':
				positionY--;
				break;
			case 'D':
				positionY++;
				break;
			case 'L':
				positionX--;
				break;
			case 'R':
				positionX++;
				break;
		}

	}

	private void buildVirusGrid() {
		String input = "..####.###.##..##....##..\n" +
				".##..#.###.##.##.###.###.\n" +
				"......#..#.#.....#.....#.\n" +
				"##.###.#.###.##.#.#..###.\n" +
				"#..##...#.....##.#..###.#\n" +
				".#..#...####...#.....###.\n" +
				"##...######.#.###..#.##..\n" +
				"###..#..##.###....##.....\n" +
				".#.#####.###.#..#.#.#..#.\n" +
				"#.#.##.#.##..#.##..#....#\n" +
				"..#.#.#.#.#.##...#.####..\n" +
				"##.##..##...#..##..#.####\n" +
				"#.#..####.##.....####.##.\n" +
				"..####..#.#.#.#.##..###.#\n" +
				"..#.#.#.###...#.##..###..\n" +
				"#.####.##..###.#####.##..\n" +
				".###.##...#.#.#.##....#.#\n" +
				"#...######...#####.###.#.\n" +
				"#.####.#.#..#...##.###...\n" +
				"####.#.....###..###..#.#.\n" +
				"..#.##.####.#######.###..\n" +
				"#.##.##.#.#.....#...#...#\n" +
				"###.#.###..#.#...#...##..\n" +
				"##..###.#..#####.#..##..#\n" +
				"#......####.#.##.#.###.##";

		List<List<String>> auxVirusGrid = new ArrayList<>();
		List<String> inputList = Arrays.asList(input.split("\n"));
		for (String line : inputList) {
			auxVirusGrid.add(Arrays.asList(line.split("")));
		}

		Integer initialLength = auxVirusGrid.size();

		Integer increaseProportion = 250;
		Integer middle = ((increaseProportion * initialLength)-1)/2;

		Integer start = middle - ((initialLength-1)/2);
		Integer end = middle + ((initialLength-1)/2);

		for(int x = 0; x < initialLength * increaseProportion; x++) {
			virusGrid.add(new ArrayList<>());
			for (int y = 0; y < initialLength * increaseProportion; y++) {

				if (x >= start && x <= end && y >= start && y <= end) {
					virusGrid.get(x).add(y, auxVirusGrid.get(x-start).get(y-start));
				} else
					virusGrid.get(x).add(y, ".");
			}
		}

		positionX = (virusGrid.size()-1)/2;
		positionY = (virusGrid.get(0).size()-1)/2;

	}

}

