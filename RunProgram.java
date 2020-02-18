
/*
 * Description : 1. Enter a complex number.
 *               2. Complex number display.
 * 				 3. Add 2 complex numbers.
 * 				 4. Multiply 2 complex numbers.
 * @Author : Do Thi Ngung Bich
 * @since  : 18 - 02 - 2020
 * @version: 1.00
 */

package com.tsdv.ComplexNumber.main;

import java.util.Scanner;

import com.tsdv.ComplexNumber.entity.ComplexNumber;
import com.tsdv.ComplexNumber.service.Calculate;

public class RunProgram {

	Scanner input = new Scanner(System.in);
	Calculate calculate;
	ComplexNumber complexNumber1 = new ComplexNumber();
	ComplexNumber complexNumber2 = new ComplexNumber();
	
	public void play() {
		int choose;
		while (true) {
			showMenu();
			System.out.print("Enter yours selection : ");
			choose = input.nextInt();
			calculate = new Calculate();
			
			switch (choose) {
			case 1:
				complexNumber1 = calculate.inputNumb();
				complexNumber2 = calculate.inputNumb();
				complexNumber1.showComNumb();
				complexNumber2.showComNumb();
				break;
			case 2:
				Calculate.additionNumb(complexNumber1, complexNumber2);
				break;
			case 3:
				Calculate.multiply(complexNumber1, complexNumber2);
				break;
			case 4:
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("Your selection does not match. Please enter again!");
				System.out.println("Enter yours selection(from 1 to 4) : ");
				break;
			}
		}
	}

	public void showMenu() {
		System.out.println("**************************************************");
		System.out.println("**                                              **");
		System.out.println("**             	  SHOW MENU                     **");
		System.out.println("**        1.Enter the complex number            **");
		System.out.println("**        2.Sum to complex numbers              **");
		System.out.println("**        3.Subtract to complex numbers         **");
		System.out.println("**        4.Exit!                               **");
		System.out.println("**                                              **");
		System.out.println("**************************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunProgram main = new RunProgram();
		main.play();
	}

}