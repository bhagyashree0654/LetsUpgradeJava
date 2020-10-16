
public class Game {
	Question[] questions=new Question[10];
	Player player=new Player();
	
	String[] question= {"What is the size of int variable?",
			" What is the default value of String variable?",
			"Which of the following is false about String?",
			" What is inheritance?",
			" What is function overriding?",
			"What are Wrapper classes?",
			"What is a data type ?",
			"Which of the following is NOT a correct variable name?",
			"Which of the following declarations is NOT correct?",
			"Which of the following shows the syntax of an assignment statement?"};
	
	String[] options1= {"8 bit","\" \" ","String is immutable.",
			"It is the process where one object acquires the properties of another.",
			"If a subclass uses a method that is already provided by its parent class, it is known as Method Overriding.",
			"These are classes that allow primitive types to be accessed as objects.",
			"The calculator of the CPU.","2schlecht"," double duty;","variable name = expression ;"}; 
	
	String[] options2= {"16 bit"," '' ","String can be created using new operator.",
			"inheritance is the ability of an object to take on many forms.",
			"If a subclass provides a specific implementation of a method that is already provided by its parent class, it is known as Method Overriding.",
			"These are classes that wraps functionality of an existing class.",
			"A portion of the main memory used to store data."," zero","float credit;","expression = expression ;"}; 
	
	String[] options3= {"32 bit","null","String is a primary data type.",
			"inheritance is a technique to define different methods of same type.","Both of the above",
			"Both of the above.","A special scheme to represent values ??in bit patterns.",
			"derLetzteWertVonAllen","boolean value = 12;","expression = variable name ;"};
	
	String[] options4= {"64 bit","not defined","None of the above."," None of the above.",
			" None of the above.","None of the above.",
			"The collection of variables that a program uses.","Year 2000","int start = 34, end = 99;",
			"data type = variable name ;"};
	
	int[] correct= {3,3,3,1,2,1,3,1,3,1};
	
	public void initGame() {
		for(int i=0;i<10;i++) {
			questions[i]=new Question();
		}
		for(int i=0;i<3;i++)
        {

        questions[i].question=question[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAns=correct[i];
        }
	}
	
	public void play()
    {

          player.getPlayerDetails();
          for(int i=0;i<10;i++)
          {
              boolean status=questions[i].askAQuestion();
              if(status==true)
              {
                  System.out.println("Correct...");
                  player.score=player.score++;
              }
              else{
                  System.out.println("Ooppsss.... Wrong answer!!!");
                  player.score=player.score--;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }
}




