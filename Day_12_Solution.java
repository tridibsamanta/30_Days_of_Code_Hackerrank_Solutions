/**
 * Title   : Day_12_Solution.java
 * Author  : Tridib Samanta
 * Created : 05-01-2020
 * Link    : https://www.hackerrank.com/challenges/30-inheritance/problem
 **/

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;

      public Student(String firstName, String lastName, int id, int [] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    public char calculate() {
        double average = 0;
        for (int score : testScores) {
            average += score;
        }
        average /= testScores.length;

        if  (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

class Day_12_Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
