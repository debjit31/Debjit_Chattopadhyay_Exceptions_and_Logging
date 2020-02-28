package maven_SimpleInterest_CI_demo;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SimpleInterest {
	
	protected double principal;
	protected float rate;
	protected int time;
	public SimpleInterest(double p, float r, int t){
		this.principal = p;
		this.rate = r;
		this.time = t;
	}
	public void calcInterest()
	{
		double simpleInterest  = (this.principal * this.rate * this.time) / 100;
		//System.out.println("Simple Interest is :- " + simpleInterest);
		LogManager lgmngr = LogManager.getLogManager(); 
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.INFO, "Simple Interest is :- " + simpleInterest); 
	}

}
