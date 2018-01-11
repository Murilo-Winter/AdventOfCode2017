package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise24p1 {

	int highestStrenght = 0;

	public void execute() {

		List<Component> components = readInput();

		buildBridge(0, components, 0);

		System.out.println(highestStrenght);
	}

	private void buildBridge(int pin, List<Component> components, int strength) {

		for(int i = 0; i < components.size(); i++) {
			Component component = components.get(i);

			if(component.a == pin || component.b == pin) {
				List<Component> remainingComponents = new ArrayList();
				remainingComponents.addAll(components);
				remainingComponents.remove(i);

				int newPin;
				if(component.a == pin)
					newPin = component.b;
				else
					newPin = component.a;

				int newStrength = strength + component.a + component.b;
				if(newStrength > highestStrenght)
					highestStrenght = newStrength;

				buildBridge(newPin, remainingComponents, newStrength);
			}

		}


	}

	private List<Component> readInput(){

		String input = "50/41\n" +
				"19/43\n" +
				"17/50\n" +
				"32/32\n" +
				"22/44\n" +
				"9/39\n" +
				"49/49\n" +
				"50/39\n" +
				"49/10\n" +
				"37/28\n" +
				"33/44\n" +
				"14/14\n" +
				"14/40\n" +
				"8/40\n" +
				"10/25\n" +
				"38/26\n" +
				"23/6\n" +
				"4/16\n" +
				"49/25\n" +
				"6/39\n" +
				"0/50\n" +
				"19/36\n" +
				"37/37\n" +
				"42/26\n" +
				"17/0\n" +
				"24/4\n" +
				"0/36\n" +
				"6/9\n" +
				"41/3\n" +
				"13/3\n" +
				"49/21\n" +
				"19/34\n" +
				"16/46\n" +
				"22/33\n" +
				"11/6\n" +
				"22/26\n" +
				"16/40\n" +
				"27/21\n" +
				"31/46\n" +
				"13/2\n" +
				"24/7\n" +
				"37/45\n" +
				"49/2\n" +
				"32/11\n" +
				"3/10\n" +
				"32/49\n" +
				"36/21\n" +
				"47/47\n" +
				"43/43\n" +
				"27/19\n" +
				"14/22\n" +
				"13/43\n" +
				"29/0\n" +
				"33/36\n" +
				"2/6";

		List<Component> components = new ArrayList<>();
		List<String> inputList = Arrays.asList(input.split("\n"));
		for(String line : inputList){
			List<String> numbers = Arrays.asList(line.split("/"));
			Component component = new Component(Integer.valueOf(numbers.get(0)), Integer.valueOf(numbers.get(1)));
			components.add(component);
		}
		return components;
	}

	private class Component{

		int a;
		int b;

		public Component(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

}

