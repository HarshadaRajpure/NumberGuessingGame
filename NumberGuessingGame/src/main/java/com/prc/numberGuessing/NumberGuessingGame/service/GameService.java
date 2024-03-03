package com.prc.numberGuessing.NumberGuessingGame.service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

	private int secretNumber;
	private int remainingAttempts;
	
	public void restart() {
		secretNumber= (int)(Math.random()*10)+1;
		remainingAttempts=3;
	}
	
	
	public String  guess(int number) {
		if(remainingAttempts<=0) {
			return "Ypu have used all attempts.The secret number is. "+secretNumber;
		}
		else if(number==secretNumber) {
			return "Congratulations! you guessed corect number"+(4-remainingAttempts)+"Attempts";
		}
		else if(number<secretNumber) {
			remainingAttempts--;
			if(remainingAttempts==0)
			return "You have used all attempts.The secret number is:"+secretNumber;
		}
		else {
			return "The number is higher than" +number+"you have remaining attempts"+remainingAttempts+"atttempts left";
			
		}
		return "Secret number is lower than"+number+"you have remaining attempts"+remainingAttempts+"atttempts left";
	}
}
