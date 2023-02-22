package Day4Assingment;

public class uc2 {
		/*The Player rolls the die
		to get a number
		between 1 to 6. - Use ((RANDOM)) to get the number between*/
	
	static final int START_POSITION = 0;
    public static void main(String[] args) {
        int dieNumber;
        int position=START_POSITION;

        System.out.println("current position : "+position);
        dieNumber=rollDie();

        System.out.println("Die Number = "+dieNumber);
    }
    static int rollDie(){
        int random= (int) (Math.random()*10%6);
        return random;
        
        
        
    }
}
