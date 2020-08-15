import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    private String firstName;
    private String lastName;
    private int id;
     
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores)
    {  
        super(firstName,lastName,id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
     }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here

    public char calculate()
    {
         int sum = 0;  
         for (int i = 0; i < testScores.length; i++) 
         {  
           sum = sum + testScores[i];  
         }  
         int score= (sum/testScores.length);
    
        if(90<=score && score<=100)
        {
            return 'O';
        }
        else if(80<=score && score<=90)
        {
            return 'E';
        }
        else if(70<=score && score<=80)
        {
            return 'A';
        }
        else if(55<=score && score<=70)
        {
            return 'P';
        }
        else if(40<=score && score<=55)
        {
            return 'D';
        }
        else if(score<40)
        {
            return 'T';
        }
        return Character.MIN_VALUE;
    }
}

class Solution {