package maven_SimpleInterest_CI_demo;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CompoundInterest {
	
	protected double principal;
	protected float rate;
	protected int time;
	public CompoundInterest(double p, float r, int t){
		this.principal = p;
		this.rate = r;
		this.time = t;
	}
	public void calcInterest() {
		double compoundInterest, finalAmount;
		
		finalAmount = this.principal * Math.pow((1 + (this.rate/100)), this.time); 
		//System.out.println("Compund Interest is : " + (finalAmount - this.principal));
		LogManager lgmngr = LogManager.getLogManager(); 
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.INFO, "Compund Interest is : " + (finalAmount - this.principal)); 
		
		
	}

}
