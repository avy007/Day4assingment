package Day4Assingment;

public class uc7 {
	
	/*Play the game with 2
	Player. In this case if a
	Player gets a Ladder
	then plays again.
	Finally report which
	UC 7 Player won the game*/
	
	static final int StART_POSITION = 0;
    static final int LADDER_OPTION = 2;
    static final int SNAKE_OPTION = 1;
    static final int PLAYER_1 = 1;
    static final int PLAYER_2 = 2;
    public static void main(String[] args) {
        int dieNumber, option;
        int dieCount=0;
        int player1Position=StART_POSITION;
        int player2Position=StART_POSITION;
        int currentPlayer=PLAYER_1;


        while (player1Position<100 && player2Position<100){
            dieNumber=rollDie();
            dieCount++;
            System.out.println("#"+dieCount);
            System.out.println("Die Number = "+dieNumber);

            option=checkOption();

            switch (option){
                case LADDER_OPTION:
                    System.out.println("ladder option");
                    if (currentPlayer == PLAYER_1) {
                        player1Position+=dieNumber;
                    }else {
                        player2Position+=dieNumber;
                    }
                    break;
                case SNAKE_OPTION:
                    System.out.println("snake option");
                    if (currentPlayer == PLAYER_1) {
                        player1Position-=dieNumber;
                    }else {
                        player2Position-=dieNumber;
                    }
                    currentPlayer=switchPlayer(currentPlayer);
                    break;
                default:
                    System.out.println("No Play option");
                    currentPlayer=switchPlayer(currentPlayer);
                    break;
            }

            //ensure start position and exact winning position
            if (player1Position < 0){
                player1Position=0;
            } else if (player2Position < 0){
                player2Position=0;
            }else if (player1Position>100) {
                player1Position-=dieNumber;
            } else if (player2Position>100) {
                player2Position-=dieNumber;
            }

            System.out.println("current player1 position : "+player1Position);
            System.out.println("current player2 position : "+player2Position);


        }
        System.out.println("*******************************");
        showWinner(player1Position,player2Position);
        System.out.println("Number of times die played = "+dieCount);
    }

    static int rollDie(){
        return (int) (Math.random()*10%6);
    }
    static int checkOption(){
        return (int) (Math.random()*10%3);
    }
    static int switchPlayer(int currentPlayer){
        if (currentPlayer == PLAYER_1) {
            return PLAYER_2;
        }else {
            return PLAYER_1;
        }
    }

    static void showWinner(int player1Position, int player2Position){
        if (player1Position==100){
            System.out.println("Player1 is Winner");
        } else if (player2Position==100) {
            System.out.println("Player2 is Winner");
        }
    }

}
