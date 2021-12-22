//class HelloWorld {

    //public static void main(String[] args) {
        //String today = "Tuesday";
        //System.out.println("The lenght of the string is");
        //System.out.println(today.length());

        //String message1 = "Hello ";
        //String message2 = "World";
        //System.out.println(message1.concat(message2));
        //Concat joins the second string to the end of the first one

        //String message1 = "Hello ";
        //String message2 = "World";
        //System.out.println(message1.toUpperCase());
        
/*class HelloWorld {
    public static void main(String[] args) {
        int num = 2;
        if (num < 0){
        System.out.println("You have a negative number");
        } else if (num > 1) {
        System.out.println("You have a positive number");
        }else { 
            System.out.println("You have zero");
                
        }
    }
}*/

/*class HelloWorld {
    public static void main(String[] args) {
        int day = 7;
        if (day==0){
            System.out.println("Sunday)");
            } else if (day == 1) {      
            System.out.println("Monday");    
            } else if (day == 2) {      
            System.out.println("Tuesday");    
            } else if (day == 3) {      
            System.out.println("Wednesday");    
            } else if (day == 4) {      
            System.out.println("Thursday");    
            } else if (day == 5) {      
            System.out.println("Friday");    
            } else if (day == 6) {      
            System.out.println("Saturday");
        }
        
    }
}*/


/*class HelloWorld {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 0:
            System.out.println("Sunday");
            break;           
            case 1:
            System.out.println("Modany");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;

        }
    }
}*/



/*class HelloWorld {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
            System.out.println("I've got 1");//Without "break" command.
            case 2:
            System.out.println("I've got 2");
            case 3:
            System.out.println("I've got 3");
            
           

        }
    }
}*/

/*class HelloWorld {
    public static void main(String[] args) {
        int age = 0;
        while (age<18) {
            System.out.println("You are not old enough"); // While loop - "While" check first and do the statement
            age = age + 1;
        }
        System.out.println("You are good to go");

        
    }
}*/

/*class HelloWorld {
    public static void main(String[] args) {
        int age = 20;
        do {
            System.out.println("You are not old enough"); //Do while loop // all you put on "Do" part is running at least once. "Do" execute first
            age = age + 1;
        } while (age < 18);
        System.out.println("You are good to go");

        
    }
}*/


/*class HelloWorld {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) { 
             if ((i % 6) == 0) {
                 System.out.println(i);
                    
            //System.out.println(i);  // // Multiple of 3 => When you divide a num by 3, it should have 0 remainder.    
            // % operator => checks if there is a remainder other than 0.    
            //for (int i = 1; i <= 20; i++) {      if ((i % 3) == 0) {        System.out.println(i);      }   
             }            

        }
               
    }
}*/

/*class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Before the loop");
        for (int i = 1; i <= 5; i++) { //loop will be running 5x
        if (i == 3) { // if true - break statement - it will run until 3x
            continue; // used to skip on run of the loop
        }
            System.out.println(i);
        }
        System.out.println("After the loop");
        
        
    }
}*/

/*class HelloWorld {
    public static void main(String[] args) { //Math method
        System.out.println(Math.max(4, 10));
        System.out.println(Math.min(-3, 10));
        System.out.println(Math.sqrt(10));
        System.out.println(Math.random());
        
                 
        
    }
}*/
/*import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your age: ");
        String myInput = input.nextLine(); //to enter string - nextInt to enter numbers
        int age = input.nextInt();
        System.out.println("You have entered : " + age);
        input.close();
    }
}*/        

/*class HelloWorld {
    int x = 5;
    public static void main(String[] args)
    {
    HelloWorld myObj = new HelloWorld();
    System.out.println(myObj.x);
    } 
}*/


/*class HelloWorld {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args)
    {
    HelloWorld myObj = new HelloWorld();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
    } 
}*/


/*public class HelloWorld {
    public static void main(String[] args){ //many parameters
    sayHi("Vania", 25, "Auckland");  
    }               
    public static void sayHi(String name, int age, String city){
  System.out.println("Hi " + name);
   System.out.println("Age " + age);
    System.out.println("Your city is: " + city);
    }    
}*/

public class HelloWorld {
    public static void main(String[] args){
    int result = readNumbers();
    System.out.println(results);

    public static int readNumbers
    Scanner input = new Scanner (System.in);
    System.out.println("Enter four numbers \n");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    input.close();

    int difference = findDifference(num1,num2);
    return difference;

      
    }    
}

