package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	int count = 0; // initiates move counter
	public void run() {
		move();
		count++;
		while(frontIsClear() == true) { 
			if(beepersPresent()) {
			move();						
			count++;		
			/* 
			instructs Karel to proceed if the ballot contains a beeper
			in the current position
			*/
		}
			cleanChad();
			frontIsClear();
			move();
			count++;
		}
	}
	
	public void cleanChad() {
		// uses modulo to tell Karel to skip past the empty spaces in the ballot
		 if (count % 2 > 0) { 
			turnLeft();
			move();
			count++;
			
		// goes through the squares in the ballot to clean any remaining chad	
			while(beepersPresent()){
				pickBeeper();
		 }
				turnAround();
				move();
				move();
				count += 2;
			
			while(beepersPresent()){
				pickBeeper();
			}
				turnAround();
				move();
				count++;
				turnRight();
		}
	}
}
	
		
