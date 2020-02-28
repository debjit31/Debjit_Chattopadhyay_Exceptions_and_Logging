import java.util.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.*;
public class TestConstruction {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LogManager lgmngr = LogManager.getLogManager(); 
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		/*PrintWriter writer = new PrintWriter(System.out);
		String s = "";
		s = "Enter Material Standard : - ";
		writer.printf("%s", s);
		writer.flush();*/
		log.log(Level.INFO, "Enter Material Standard : - ");
		String materialStandard = sc.next();
		/*s = "Enter total Area :- ";
		writer.printf("%s", s);
		writer.flush();*/
		log.log(Level.INFO, "Enter total Area :- ");
		int totalArea = sc.nextInt();
		/*s = "Do you want a fully automated home ? :- ";
		writer.printf("%s", s);
		writer.flush();*/
		log.log(Level.INFO, "Do you want a fully automated home ? :- ");
		boolean fullyAutomated = sc.hasNextBoolean();
		
		
		CostEstimator ce = new CostEstimator(materialStandard, totalArea, fullyAutomated);
		ce.calculateCost();
	}
}
