package Day4Assingment;

public class uc5 {
	
	/*Ensure the player gets
	to exact winning
	position 100*/
	
	static final int StART_POSITION = 0;
    static final int LADDER_OPTION = 2;
    static final int SNAKE_OPTION = 1;
    public static void main(String[] args) {
        int dieNumber, option;
        int position=StART_POSITION;

        while (position<100){
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

            if (position < 0){
                position=0;
            } else if (position>100) {
                position-=dieNumber;
            }
            System.out.println("current position : "+position);
        }


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
