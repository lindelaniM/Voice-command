import java.io.*;
import java.util.*;
import java.lang.*;

public class Vs{
	
	public static void sum(){	//start of a method sum,
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("HOW MANY VALUES DO YOU WISH TO ADD?");
		int value = input.nextInt();
		double array [] = new double[value]; //Declaring an array.
		double add=0;	//the control variable of sum
			
		System.out.println(" ");
		System.out.println("PLEASE INPUT VALUES TO ADD");	//asking for the user input values?
		System.out.println("");
		
		for(int k=0; k<value; k++){	// a loop to allow user to store values in an array.
			
			array [k] = input.nextDouble();
		}
		for(int i=0; i<value; i++){	// a loop to add.
			
			add += array [i];
		}
		System.out.print(" The total sum is: "+add);	// the display of the sum	
		
    }	// End of function sum.
    
	public static void devision() {

        Scanner input2 = new Scanner(System.in);

        System.out.println("PLEASE INPUT VALUES TO PROCEED WITH YOUR CALCULATION");
        double x = input2.nextDouble();
        double i = input2.nextDouble();

            double div = x/i;
            //System.out.print("the value of "+x);
            //System.out.print(" devide by "+i);
            System.out.print(" YOUR ANSWER IS: "+div);

    }// end of method div

    public static void subtraction(){

        Scanner input3 = new Scanner(System.in);

        System.out.println("PLEASE INPUT VALUES TO PROCEED WITH YOUR CALCULATION");
        double x = input3.nextDouble();//user input
        double k = input3.nextDouble();// "%"

        double sub = x-k;//initializing
        System.out.println(" YOUR ANSWER IS : "+sub);
    }//END OF THE METHOD SUB

	public static void product(){
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("HOW MANY VALUES DO YOU WISH TO MULTIPLY?");// value to keep as the length
		int val = input1.nextInt();//value of the length()% for array and the loop
		
		if(val<=2){			

		System.out.println("PLEASE INPUT VALUES TO CALCULATE");// user input
		int x = input1.nextInt();//store the value captured
		int y = input1.nextInt();// ""
		
		double mul = x * y;// get the product
		System.out.println("The product value is :"+mul);// display the value of the product
		}
		else if(val>2){
			
			System.out.println("PLEASE INPUT VALUES TO CALCULATE");// asking for the user input
			double arr [] = new double [val]; // array Declaring
			
			for(int i=0; i<val; i++){
				
				arr [i] = input1.nextDouble();
				}
			double pro = 1; //control variable for the loop
			for(int k=0; k<val; k++){

				pro = pro * arr [k];
			}
			System.out.println("The product value is: "+pro);
		}
	}// end of method product
	
	public static void self(){
		
		System.out.println("Oh yes, I'M FRIDAI AND YOU ARE?");
		System.out.println("");
		
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		name.trim();
		
		if(name.length()<10){
			
			System.out.println("ok then i will call you "+name);
			System.out.print("Hi! nice to meet you "+name);
			System.out.print("...how are you doing?");
			System.out.println("");
			
			Scanner in1 = new Scanner(System.in);
			String name1 = in1.nextLine();
			name1.trim();
			//healthy condition
			
			if(name1.equalsIgnoreCase("I'M VERY GOOD THANKS AND YOU")||
				name1.equalsIgnoreCase("I'M great THANKS and you")||
					name1.equalsIgnoreCase("I'M GOOD HOW ARE YOU")||
						name1.equalsIgnoreCase("I'M FINE YOURSELF")){
							
							System.out.println(" Oh me? I'm forever good, thanks for asking");//confident
				}
			else if(name1.equalsIgnoreCase("I'M FINE")||
						name1.equalsIgnoreCase("GREAT")||
							name1.equalsIgnoreCase("GOOD")||
								name1.equalsIgnoreCase("FINE")||
									name1.equalsIgnoreCase("VERY GOOD")||
								name1.equalsIgnoreCase("I'M VERY GOOD")||
							name1.equalsIgnoreCase("I'M DOING GOOD")||
						name1.equalsIgnoreCase("I'M GOOD")||
                    name1.equalsIgnoreCase("I'M VERY GOOD THANKS")||
                name1.equalsIgnoreCase("I'M DOING GREAT THANKS")||
                    name1.equalsIgnoreCase("I'M DOING GOOD THANKS")||
                        name1.equalsIgnoreCase("I'M OK THANKS")||
                            name1.equalsIgnoreCase("GOOD THANKS")||
                                name1.equalsIgnoreCase("GREAT THANKS")||
                                    name1.equalsIgnoreCase("FINE THANKS")){
							
            System.out.println(" WELL It's good to be good, i mean when your good, you do good...");//compliment
            System.out.println(" WHAT CAN I DO FOR YOU "+name);
				}
			else if(name1.equalsIgnoreCase("bad")||
					name1.equalsIgnoreCase("very bad")||
						name1.equalsIgnoreCase("not so good")||
							name1.equalsIgnoreCase("not good")||
								name1.equalsIgnoreCase("sick")||
									name1.equalsIgnoreCase("feeling sick")||
								name1.equalsIgnoreCase("not well")||
							name1.equalsIgnoreCase("coping")||
						name1.equalsIgnoreCase("I'm coping")||
					name1.equalsIgnoreCase("I'm not alright")||
				name1.equalsIgnoreCase("I'm not ok")||
			name1.equalsIgnoreCase("feeling dizzy")){
				
				System.out.println(" Oh no you sound really bad, should i call a Doctor for you?");//pitiful
				
				Scanner in2 = new Scanner(System.in);
				String name2 = in2.nextLine();
				name2.trim();
				
				if(name2.equalsIgnoreCase("yes")||	//care condition
					name2.equalsIgnoreCase("yes please")||
						name2.equalsIgnoreCase("that would do")||
							name2.equalsIgnoreCase("please")||
								name2.equalsIgnoreCase("yeah")){
								
								System.out.println(" Ok i'm calling a doctor right away");//calling a Dr
							}
				else if(name2.equalsIgnoreCase("no")||
					name2.equalsIgnoreCase("no is nothing")||
				name2.equalsIgnoreCase("no need for that")||
			name2.equalsIgnoreCase("No i will be fine")||
				name2.equalsIgnoreCase("Don't bother")||
					name2.equalsIgnoreCase("no is cool")||
						name2.equalsIgnoreCase("not necessary")){
						
						System.out.println(" Ok cool, Get better soon");//terminating
					}
				else{
					System.out.println(" I'm sorry, i can't hear you");
				}//indc line
			}else{
				System.out.println(" I'M SORRY, I DIDN'T GET THAT");
			}
		}//when name is not clear
		else if(name.equalsIgnoreCase("give me a name")||
			name.equalsIgnoreCase("why don't you give me a name")||
				name.equalsIgnoreCase("call me anything")||
					name.equalsIgnoreCase("i don't have a name")||
						name.equalsIgnoreCase("call me whatever")){
							
				System.out.println("lol!! IT's FUNNY HOW DUM YOUR ARE ");//making a joke
				System.out.println("i will call you LINDELANI! i like it for you");// the giving of a name
		
		}else{
			System.out.println(" IM SORRY, I DIDN'T GET THAT");//when not clear
		}
	}
	//start of main method
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		String namer = in.nextLine();
		namer.trim();
		
	if(namer.equalsIgnoreCase("tell me your name")||
		namer.equalsIgnoreCase("a little intro")||
			namer.equalsIgnoreCase("can we be friends")||
				namer.equalsIgnoreCase("do you have a name")||
					namer.equalsIgnoreCase("do you wanna get to know me")||
						namer.equalsIgnoreCase("what is your name")||
							namer.equalsIgnoreCase("what do we call you")){
			
			self();//calling self method
		}//END OF SELF QUESTIONS
		
	else if(namer.equalsIgnoreCase("open calculator")||
	namer.equalsIgnoreCase("calculator")||
		namer.equalsIgnoreCase("a alculator please")||
			namer.equalsIgnoreCase("i wanna make some calculation")||
				namer.equalsIgnoreCase("Do you have a calculator")||
					namer.equalsIgnoreCase("can i use your calculator")){
			
			System.out.println("Calculator is open...,WHAT DO YOU WISH TO DO?");
			
			Scanner inline = new Scanner(System.in);
			String option = inline.nextLine();
			
			if(option.equalsIgnoreCase("sum")||
				option.equalsIgnoreCase("to sum")||
					option.equalsIgnoreCase("i wish to sum")||
						option.equalsIgnoreCase("to add")||
							option.equalsIgnoreCase("add values")||
								option.equalsIgnoreCase("to add values")||
							option.equalsIgnoreCase("i wish to add")||
						option.equalsIgnoreCase("to make addition")){
				
				sum();	//calling the method sum
			}
			else if(option.equalsIgnoreCase("multiply")||
			option.equalsIgnoreCase("to multiply")||
		option.equalsIgnoreCase("i wish to multiply")||
			option.equalsIgnoreCase("to get the product")||
				option.equalsIgnoreCase("product")||
					option.equalsIgnoreCase("i wish to get the product")){
				
				product(); // calling method 
            }
            else if(option.equalsIgnoreCase("Devision")||
            option.equalsIgnoreCase("Devide")||
                option.equalsIgnoreCase("to Devide")||
                    option.equalsIgnoreCase("i wish to Devide")||
                        option.equalsIgnoreCase("to make Devision")){

                devision();
            }
            else if(option.equalsIgnoreCase("TO MAKE SUBTRACTION")||
            option.equalsIgnoreCase("TO SUBTRACT")||
                option.equalsIgnoreCase("SUBTRACTION")||
                    option.equalsIgnoreCase("I WISH TO SUBTRACT")||
                        option.equalsIgnoreCase("I WISH TO MAKE SUBTRACTION")||
                            option.equalsIgnoreCase("SUBTRACT")){

                subtraction();
            }
            else{
                System.out.print(" I'M SORRY, I DIDN'T GET THAT");
            }
		}
		else if(namer.equalsIgnoreCase("FRIDAI you there")||
			namer.equalsIgnoreCase("FRIDAI are you there")||
		namer.equalsIgnoreCase("FRIDAI")||
			namer.equalsIgnoreCase("FRIDAI can i ask you something")||
				namer.equalsIgnoreCase("FRIDAI are you awake")||
					namer.equalsIgnoreCase("FRIDAI can you hear me")||
						namer.equalsIgnoreCase("DO me a favour")||
							namer.equalsIgnoreCase("FRIDAI DO ME A FAVOUR")){
			
			System.out.println(" I'M At your service");
			System.out.println("what can i do for you?");
		} 	
		else if(namer.equalsIgnoreCase("WHAT ARE YOU")||
		namer.equalsIgnoreCase("WHAT GENDER ARE YOU")||
			namer.equalsIgnoreCase("HAVE you ANY GENGER")||
				namer.equalsIgnoreCase("DO YOU HAVE SEXUALITY")||
					namer.equalsIgnoreCase("ARE YOU A MALE OR FEMALE")||
						namer.equalsIgnoreCase("ARE YOU A HUMAN")||
							namer.equalsIgnoreCase("tell me about yourself")||
						namer.equalsIgnoreCase("DO YOU HAVE PERCEPTION")||
					namer.equalsIgnoreCase("FRIDAI TELL ME ABOUT YOURSELF")){
								
		System.out.println("");				
			System.out.println("        WELL I'M FRIDAI!, I AM WITHOUT FORM and I'M NOT A HUMAN.");
				System.out.println("I AM A PROGRAMME MADE BY MTIZA, I HAVE NO GENDER nor DO I HAVE SEXUALITY.");
					System.out.println("        I'M HERE ONLY TO HELP,ALL YOU HAVE TO DO IS TO JUST ASK.");
		}
		else if(namer.equalsIgnoreCase("DO YOU HAVE A FAMILY")||
		namer.equalsIgnoreCase("DO YOU HAVE FRIENDS")||
			namer.equalsIgnoreCase("DO YOU HAVE ANY FRIEND")||
				namer.equalsIgnoreCase("WHERE IS YOUR FAMILY")||
					namer.equalsIgnoreCase("WHERE ARE YOUR FRIENDS")||
						namer.equalsIgnoreCase("WHERE IS YOUR FRIEND")||
							namer.equalsIgnoreCase("TELL ME ABOUT YOUR FAMILY")||
								namer.equalsIgnoreCase("TELL ME ABOUT YOUR FRIENDS")){
					
			System.out.println(" Well i consider everybody my friend and family");
		
		}else if(namer.equalsIgnoreCase("Do you have a father")||
		namer.equalsIgnoreCase("have you a father")||
			namer.equalsIgnoreCase("your father's name")||
				namer.equalsIgnoreCase("do you know your father")||
					namer.equalsIgnoreCase("tell me about your father")||
						namer.equalsIgnoreCase("TELL ME ABOUT YOUR DAD")||
							namer.equalsIgnoreCase("TELL ME YOUR FATHER'S NAME")||
								namer.equalsIgnoreCase("WHAT IS YOUR FATHER'S NAME")){
						
			System.out.println(" Oh yes, my father is Lindelani Mtiza, he's the one who made me");
		
		}else if(namer.equalsIgnoreCase("DO YOU HAVE A MOTHER")||
		namer.equalsIgnoreCase("HAVE YOU A MOTHER")||
			namer.equalsIgnoreCase("TELL ME ABOUT YOUR MOM")||
				namer.equalsIgnoreCase("TELL ME ABOUT YOUR MOTHER")||
					namer.equalsIgnoreCase("DO YOU HAVE A MOM")||
						namer.equalsIgnoreCase("TELL ME YOUR MOTHER'S NAME")||
							namer.equalsIgnoreCase("DO YOU KNOW YOUR MOTHER")||
								namer.equalsIgnoreCase("WHAT IS YOUR MOTHER'S NAME")){
								
			System.out.println(" WELL I DO NOT REALLY HAVE A MOTHER, BUT I DO HAVE A FATHER");
		}
		else if(namer.equalsIgnoreCase("TELL ME YOUR AGE")||
		namer.equalsIgnoreCase("HOW OLD ARE YOU")||
			namer.equalsIgnoreCase("WHEN WERE YOU BORN")||
				namer.equalsIgnoreCase("TELL ME YOUR DATE OF BIRTH")||
					namer.equalsIgnoreCase("DO YOU KNOW YOUR AGE")||
						namer.equalsIgnoreCase("DO YOU KNOW YOUR DATE OF BIRTH")||
							namer.equalsIgnoreCase("YOUR DATE OF BIRHT")){
								
			System.out.println(" WELL TO BE HONEST WITH YOU, I'M TODAY YEARS OLD");
			System.out.println("AND I DO NOT HAVE A DATE OF BIRHT, LOL!");
		}
		else if(namer.equalsIgnoreCase("TELL ME ABOUT YOUR SISTER")||
		namer.equalsIgnoreCase("TELL ME ABOUT YOUR BROTHER")||
			namer.equalsIgnoreCase("DO YOU HAVE A BROTHER")||
				namer.equalsIgnoreCase("DO YOU HAVE A SISTER")||
					namer.equalsIgnoreCase("DO YOU HAVE SIBLINGS")||
						namer.equalsIgnoreCase("HOW ARE YOUR SIBLINGS")||
							namer.equalsIgnoreCase("HOW MANY SIBLINGS DO YOU HAVE")||
								namer.equalsIgnoreCase("DO YOU HAVE ANY SIBLING")){
								
			System.out.println(" I'M SORRY, I DON'T HAVE ANY SIBLING");
			System.out.print("WELL I CONSIDER EVERYBODY MY FRIEND AND FAMILY");
		}
		else if(namer.equalsIgnoreCase("FRIDAI HOW ARE YOU")||
		namer.equalsIgnoreCase("FRIDAI HOW ARE YOU DOING")||
			namer.equalsIgnoreCase("DO YOU GET SICK")||
				namer.equalsIgnoreCase("DO YOU FEEL SICK")||
					namer.equalsIgnoreCase("HEY FRIDAY, YOU GOOD")||
						namer.equalsIgnoreCase("FRIDAI HOW ARE YOU FEELING")||
							namer.equalsIgnoreCase("FRIDAI HOW IS YOUR DAY")){
								
			System.out.println(" Oh me? I'm forever good, thanks for asking");					
		}
		else if(namer.equalsIgnoreCase("GOOD MORNING FRIDAI")||
		namer.equalsIgnoreCase("GOOD EVENING FRIDAI")||
			namer.equalsIgnoreCase("GOOD DAY THERE")||
				namer.equalsIgnoreCase("GOOD AFTERNOON")||
					namer.equalsIgnoreCase("GREETINGS FRIDAY")||
						namer.equalsIgnoreCase("GREETINGS")||
							namer.equalsIgnoreCase("GOOD AFTERNOON FRIDAI")){
								
            System.out.println(" HELLO THERE");
            System.out.println("WHAT CAN I DO FOR YOU?");
		}
		else if(namer.equalsIgnoreCase("FRIDAI WHERE DO YOU STAY")||
		namer.equalsIgnoreCase("WHERE DO YOU STAY")||
			namer.equalsIgnoreCase("FRIDAI WHERE DO YOU RESIDE")||
				namer.equalsIgnoreCase("TELL ME WHERE YOU ARE")||
					namer.equalsIgnoreCase("Can we meet")){

			System.out.println(" WELL, I'M ACTUALLY A PROGRAMME");
			System.out.println("I HAVE NO PHYSICAL ADDRESS, I LIVE IN THE INTERNET");
		}
		else if(namer.equalsIgnoreCase("ARE YOU A PROGRAMME")||
		namer.equalsIgnoreCase("SO YOU CALL YOURSELF FRIDAI")||
			namer.equalsIgnoreCase("SO YOU HAVE NO FORM")||
				namer.equalsIgnoreCase("SO I SHOULD CALL YOU FRIDAI")){

			System.out.println("WELL, YOU'RE A VERY PERCEPTIVE PERSON");
			System.out.println("I AM A PROGRAMME, RATHER CALL ME FRIDAI");
		}
		// END OF HELP QUESTIONING
		else{
			System.out.println(" I'M SORRY I DIDN'T CATCH THAT, PLEASE TRY BE A LITTLE MORE CLEAR");//if question not clear or specified
			System.out.println("RATHER, TRY SAY 'tell me about yourself?' ");
		}
	}
}