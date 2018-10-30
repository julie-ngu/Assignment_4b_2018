/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Triangle program stub
 *
 ****************************************************************************/

import java.util.Scanner;

public class TriangleInfo {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Select a combination for the computer to user to solve your triangle (A stands for angle, S for side): \n\n"
						+ "   - AAS (two angles, one side not between angles)\n"
						+ "   - ASA (two angles, one side between angles)\n"
						+ "   - SSA (two sides, one angle not between sides)\n"
						+ "   - SAS (two sides, one angle between sides)\n"
						+ "   - SSS (three sides)\n\nCombo: ");
		
		if(userInput.hasNextLine()) {
			String userCombo = userInput.nextLine();
			
			if(userCombo.equalsIgnoreCase("AAS")) {
				System.out.print("\nEnter value of angle A (degrees): ");
				if(userInput.hasNextDouble()) {
					double angleA = userInput.nextDouble();
					
					System.out.print("Enter value of angle C (degrees): ");
					if(userInput.hasNextDouble()) {
						double angleC = userInput.nextDouble();
						
						System.out.print("Enter length of side C: ");
						if(userInput.hasNextDouble()) {
							double sideC = userInput.nextDouble();
							Triangle myTriangle = new Triangle(userCombo, angleA, angleC, sideC);
							myTriangle.calculate(userCombo);
							
							myTriangle.isTriangleValid();
							
							if(myTriangle._isValid == true) {
								myTriangle.getPerimeter();
								myTriangle.getArea();
								myTriangle.classify();
								
								myTriangle.print();
							}
							else if (myTriangle._isValid == false){
								System.out.print("\nNot a triangle.");
							}
							else {
								System.out.print("Error.");
							}
						}
						else {
							System.out.print("Error.");
						}
					}
					else {
						System.out.print("Error.");
					}
				}
				else {
					System.out.print("Error.");
				}
			}
			else if(userCombo.equalsIgnoreCase("ASA")) {
				System.out.print("\nEnter value of angle A (degrees): ");
				if(userInput.hasNextDouble()) {
					double angleA = userInput.nextDouble();
					
					System.out.print("Enter length of side C: ");
					if(userInput.hasNextDouble()) {
						double sideC = userInput.nextDouble();
						
						System.out.print("Enter value of angle B (degrees): ");
						if(userInput.hasNextDouble()) {
							double angleB = userInput.nextDouble();
							Triangle myTriangle = new Triangle(userCombo, angleA, sideC, angleB);
							myTriangle.calculate(userCombo);
							
							myTriangle.isTriangleValid();
							
							if(myTriangle._isValid == true) {
								myTriangle.getPerimeter();
								myTriangle.getArea();
								myTriangle.classify();
								
								myTriangle.print();
							}
							else if (myTriangle._isValid == false){
								System.out.print("\nNot a triangle.");
							}
							else {
								System.out.print("Error.");
							}
						}
						else {
							System.out.print("Error.");
						}
					}
					else {
						System.out.print("Error.");
					}
				}
				else {
					System.out.print("Error.");
				}
			}
			else if(userCombo.equalsIgnoreCase("SSA")) {
				System.out.print("\nEnter length of side B: ");
				if(userInput.hasNextDouble()) {
					double sideB = userInput.nextDouble();
					
					System.out.print("Enter length of side C: ");
					if(userInput.hasNextDouble()) {
						double sideC = userInput.nextDouble();
						
						System.out.print("Enter value of angle B (degrees): ");
						if(userInput.hasNextDouble()) {
							double angleB = userInput.nextDouble();
							Triangle myTriangle = new Triangle(userCombo, sideB, sideC, angleB);
							myTriangle.calculate(userCombo);
							
							myTriangle.isTriangleValid();
							
							if(myTriangle._isValid == true) {
								myTriangle.getPerimeter();
								myTriangle.getArea();
								myTriangle.classify();
								
								myTriangle.print();
							}
							else if (myTriangle._isValid == false){
								System.out.print("\nNot a triangle.");
							}
							else {
								System.out.print("Error.");
							}
						}
						else {
							System.out.print("Error.");
						}
					}
					else {
						System.out.print("Error.");
					}
				}
				else {
					System.out.print("Error.");
				}
			}
			else if(userCombo.equalsIgnoreCase("SAS")) {
				System.out.print("\nEnter length of side B: ");
				if(userInput.hasNextDouble()) {
					double sideB = userInput.nextDouble();
					
					System.out.print("Enter value of angle A (degrees): ");
					if(userInput.hasNextDouble()) {
						double angleA = userInput.nextDouble();
						
						System.out.print("Enter length of side C: ");
						if(userInput.hasNextDouble()) {
							double sideC = userInput.nextDouble();
							Triangle myTriangle = new Triangle(userCombo, sideB, angleA, sideC);
							myTriangle.calculate(userCombo);
							
							myTriangle.isTriangleValid();
							
							if(myTriangle._isValid == true) {
								myTriangle.getPerimeter();
								myTriangle.getArea();
								myTriangle.classify();
								
								myTriangle.print();
							}
							else if (myTriangle._isValid == false){
								System.out.print("\nNot a triangle.");
							}
							else {
								System.out.print("Error.");
							}
						}
						else {
							System.out.print("Error.");
						}
					}
					else {
						System.out.print("Error.");
					}
				}
				else {
					System.out.print("Error.");
				}
			}
			else if(userCombo.equalsIgnoreCase("SSS")) {
				System.out.print("\nEnter length of side A: ");
				if(userInput.hasNextDouble()) {
					double sideA = userInput.nextDouble();
					
					System.out.print("Enter length of side B: ");
					if(userInput.hasNextDouble()) {
						double sideB = userInput.nextDouble();
						
						System.out.print("Enter length of side C: ");
						if(userInput.hasNextDouble()) {
							double sideC = userInput.nextDouble();
							Triangle myTriangle = new Triangle(userCombo, sideA, sideB, sideC);
							myTriangle.calculate(userCombo);
							
							myTriangle.isTriangleValid();
							
							if(myTriangle._isValid == true) {
								myTriangle.getPerimeter();
								myTriangle.getArea();
								myTriangle.classify();
								
								myTriangle.print();
							}
							else if (myTriangle._isValid == false){
								System.out.print("\nNot a triangle.");
							}
							else {
								System.out.print("Error.");
							}
						}
						else {
							System.out.print("Error.");
						}
					}
					else {
						System.out.print("Error.");
					}
				}
				else {
					System.out.print("Error.");
				}
			}
			else {
				System.out.print("Error.");
			}
		}
		else {
			System.out.print("Error.");
		}
	}
}
