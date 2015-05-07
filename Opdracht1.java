package me.l1.fer;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * AdvancedNakijkModel voor les1.
 * By: Mao;
 */

public class advancedNakijkModel {
	
	public static ArrayList<Integer> numbersOne = new ArrayList<Integer>();
	public static ArrayList<Integer> numbersTwo = new ArrayList<Integer>();
	public static ArrayList<Integer> outputs = new ArrayList<Integer>();
	public static ArrayList<String> actions = new ArrayList<String>();
	
	public static int numberOne;
	public static int numberTwo;
	public static int output;
	
	public static void main(String args[]){
		startCalc();
	}
	
	public static void startCalc(){
		System.out.println("The calculator has started...");
		calcLoop();
	}
	
	@SuppressWarnings("resource")
	public static void calcLoop(){
		Scanner Actionscanner = new Scanner(System.in);
		printCalcMessage("Please enter a action.");
		printCalcMessage("The actions are: +, -, /, *, c, showall and shutdown");
		String action = Actionscanner.nextLine();
		if(action.contains("+")){
			askForNumbers();
			output = numberOne + numberTwo;
			actions.add(action);
			numbersOne.add(numberOne);
			numbersTwo.add(numberTwo);
			outputs.add(output);
			printCalcMessage(numberOne + " + " + numberTwo + " = " + output);
			calcLoop();
		}
		if(action.contains("-")){
			askForNumbers();
			output = numberOne - numberTwo;
			actions.add(action);
			numbersOne.add(numberOne);
			numbersTwo.add(numberTwo);
			outputs.add(output);
			printCalcMessage(numberOne + " - " + numberTwo + " = " + output);
			calcLoop();
		}
		if(action.contains("/")){
			askForNumbers();
			output = numberOne / numberTwo;
			actions.add(action);
			numbersOne.add(numberOne);
			numbersTwo.add(numberTwo);
			outputs.add(output);
			printCalcMessage(numberOne + " / " + numberTwo + " = " + output);
			calcLoop();
		}
		if(action.contains("*")){
			askForNumbers();
			output = numberOne * numberTwo;
			actions.add(action);
			numbersOne.add(numberOne);
			numbersTwo.add(numberTwo);
			outputs.add(output);
			printCalcMessage(numberOne + " * " + numberTwo + " = " + output);
			calcLoop();
		}
		if(action.contains("c")){
			clearCalc();
			calcLoop();
		}
		if(action.contains("shutdown")){
			stopCalc();
		}
		if(action.contains("showall")){
			showAll();
			calcLoop();
		}
	}
	
	public static void showAll(){
		printCalcMessage("[ShowAll Start]");
		for(int x = 0; x < outputs.size(); x++){
			printCalcMessage(numbersOne.get(x) + " " + actions.get(x) + " " + numbersTwo.get(x) + " = " + outputs.get(x));
			printCalcMessage("------------------------------");
		}
		printCalcMessage("[ShowAll End]");
	}
	
	@SuppressWarnings("resource")
	public static void askForNumbers(){
		Scanner scanner = new Scanner(System.in);
		printCalcMessage("Please enter a number.");
		numberOne = scanner.nextInt();
		printCalcMessage("Please enter another number");
		numberTwo = scanner.nextInt();
	}
	
	@SuppressWarnings("null")
	public static void clearClac(){
		numbersOne.clear();
		numbersTwo.clear();
		outputs.clear();
		numberOne = (Integer) null;
		numberTwo = (Integer) null;
		output = (Integer) null;
	}
	
	public static void stopCalc(){
		printCalcMessage("The calculator is shutting down, have a nice day :)");
		System.exit(1);
	}
	
	public static void printCalcMessage(String message){
		System.out.println("[Easy Calc]" + message);
	}

}
