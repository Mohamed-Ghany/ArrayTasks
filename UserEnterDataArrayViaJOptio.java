import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;
//Create program take all user data (Name, mobile, email, age, Faculty, department) from Joptionpane and save them in Array and pass this Array to Method to print it 
public class UserEnterDataArrayViaJOptio {
	
	public static void main(String[] args) {
		String name,mobile,email,age,faculty,departement; // array elements have to be in the same Data type

//Create "Array" with name "userInputArray" :
		String [] userInputArray = new String[6]; //Array of Reference [ made initialize & contraction in the same line ] 
//Create welcome message :	
		JOptionPane.showMessageDialog(null,"Welcome..Please press\"Ok\" and follow the next steps");
//Create "JOptionPane"To show pop-up Dialogue message asks user for his Name :	
		name = JOptionPane.showInputDialog("Please enter your Name"); //after user enter his name , it'll be stored in variable called "userInput"
				    JOptionPane.showMessageDialog(null,"Hi"+" "+name+" "+"Please press\"Ok\"to continue"); //just welcoming the user
//Then pass the name value to the 1st array elements :
		 userInputArray[0] = name;
//--------------------		 
//To show pop-up Dialogue message asks user for his Mobile number :			
		 mobile = JOptionPane.showInputDialog("Please enter your Mobile");
		//Then pass the mobile value to the 2nd array elements :
		 userInputArray[1] = mobile;
//---------------------
		 email = JOptionPane.showInputDialog("Please enter your Email");
	     userInputArray[2] = email;
//---------------------
	     age = JOptionPane.showInputDialog("Please enter your Age");
	     userInputArray[3] = age;
//---------------------
	     faculty = JOptionPane.showInputDialog("Please enter your Faculty");
	     userInputArray[4] = faculty;
//---------------------
	     departement = JOptionPane.showInputDialog("Please enter your Departement");
	     userInputArray[5] = departement;
//---------------------
	         
	 printArrayElements(userInputArray[0],userInputArray[1],userInputArray[2],userInputArray[3],userInputArray[4],userInputArray[5]);//this's to Call or invoke the below method"printArrayElements"	
	
	}
//create print method defining the data wanted from user,data type & print them
	public static void printArrayElements (String name,String mobile,String email,String age,String faculty,String departement) { // Method,,void as no return & (Static so that can call the above main Static method)
		 
		System.out.println("The name is: "+name+"\nThe Mobile is: "+mobile+"\nThe Email is: "+email+"\nThe Age is: "+age+"\nThe Faculty is: "+faculty+"\nThe Departement is: "+departement);
		 
		 }
		
	}
