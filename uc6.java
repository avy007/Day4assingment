package Day4Assingment;

public class uc6 {

	/*Report the number of
	times the dice was
	played to win the game
	and also the position
	after every die role*/
	
	static final int StART_POSITION = 0;
    static final int LADDER_OPTION = 2;
    static final int SNAKE_OPTION = 1;
    public static void main(String[] args) {
        int dieNumber, option;
        int dieCount=0;
        int position=StART_POSITION;

        while (position<100){
            dieNumber=rollDie();
            dieCount++;
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

            if (position < 0){
                position=0;
            } else if (position>100) {
                position-=dieNumber;
            }
            System.out.println("current position : "+position);
        }
        System.out.println("Number of times die played = "+dieCount);


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
