package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise22p2 {

	List<List<String>> virusGrid = new ArrayList<>();

	char direction = 'U';

	Integer positionX;

	Integer positionY;

	Integer becameInfected = 0;

	public void execute() {

		buildVirusGrid();

		for(int i = 0; i < 10000000; i++){
			turn();
			infectOrClean();
			move();
		}
		System.out.println(becameInfected);
	}

	private void turn(){
		String nodeStatus = virusGrid.get(positionY).get(positionX);

		if(nodeStatus.equals(".")){
			switch (direction){
				case 'U':{
					direction = 'L';
					break;
				}
				case 'D':{
					direction = 'R';
					break;
				}
				case 'L':{
					direction = 'D';
					break;
				}
				case 'R':{
					direction = 'U';
					break;
				}
			}

		} else if(nodeStatus.equals("#")){
			switch (direction){
				case 'U':{
					direction = 'R';
					break;
				}
				case 'D':{
					direction = 'L';
					break;
				}
				case 'L':{
					direction = 'U';
					break;
				}
				case 'R':{
					direction = 'D';
					break;
				}
			}

		} else if(nodeStatus.equals("F")){
			switch (direction){
				case 'U':{
					direction = 'D';
					break;
				}
				case 'D':{
					direction = 'U';
					break;
				}
				case 'L':{
					direction = 'R';
					break;
				}
				case 'R':{
					direction = 'L';
					break;
				}
			}
		}
	}

	private void infectOrClean(){
		if(virusGrid.get(positionY).get(positionX).equals(".")) {
			virusGrid.get(positionY).set(positionX, "W");
		}
		else if(virusGrid.get(positionY).get(positionX).equals("W")) {
			virusGrid.get(positionY).set(positionX, "#");
			becameInfected++;
		}
		else if(virusGrid.get(positionY).get(positionX).equals("#")) {
			virusGrid.get(positionY).set(positionX, "F");
		} else {
			virusGrid.get(positionY).set(positionX, ".");
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

