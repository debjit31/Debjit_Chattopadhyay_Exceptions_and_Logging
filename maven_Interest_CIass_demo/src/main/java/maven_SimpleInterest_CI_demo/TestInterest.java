package maven_SimpleInterest_CI_demo;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.*;
public class TestInterest {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LogManager lgmngr = LogManager.getLogManager(); 
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		//PrintWriter writer = new PrintWriter(System.out);
		//String s ="Enter the principal amount :- ";
		//writer.printf("%s", s);
		//writer.flush();
		log.log(Level.INFO, "Enter the principal amount :- ");
		double principal = sc.nextDouble();
		/*s="Enter the rate of interest  :- ";
		writer.printf("%s", s);
		writer.flush();*/
		log.log(Level.INFO, "Enter the rate of interest  :- ");
		float rate = sc.nextFloat();
		/*s= "Enter the time period  :- ";
		writer.printf("%s", s);
		writer.flush();*/
		log.log(Level.INFO, "Enter the time period  :- ");
		int time = sc.nextInt();
		
		SimpleInterest si = new SimpleInterest(principal,rate,time);
		si.calcInterest();
		
		CompoundInterest ci = new CompoundInterest(principal, rate, time);
		ci.calcInterest();
	}

}
