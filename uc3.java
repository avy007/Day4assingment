package Day4Assingment;

public class uc3 {
	    
	//The Player then checks for
	//a Option. They are No Play, ladder or snake
	
	static final int START_POSITION = 0;
    static final int LADDER_OPTION = 2;
    static final int SNAKE_OPTION = 1;
    public static void main(String[] args) {
        int dieNumber, option;
        int position=START_POSITION;

        dieNumber=rollDie();
        System.out.println("Die Number = "+dieNumber);

        option=checkOption();

        switch (option){
            case LADDER_OPTION:
                System.out.println("ladder option");
                position+=dieNumber;
                break;
            case SNAKE_OPTION:
                System.out.println("snake option");
                position-=dieNumber;
                break;
            default:
                System.out.println("No Play option");
                break;
        }


        System.out.println("current position : "+position);

    }
    static int rollDie(){
        int random= (int) (Math.random()*10%6);
        return random;
    }
    static int checkOption(){
        int random= (int) (Math.random()*10%3);
        return random;
    }
	
	
	

}
