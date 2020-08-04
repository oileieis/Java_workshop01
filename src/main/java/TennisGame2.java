public class TennisGame2
{

    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;



    public TennisGame2(String player1Name, String player2Name) {

        this.player1Name = player1Name;

        this.player2Name = player2Name;

    }



    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String [] textScores = {"Love","Fifteen","Thirty","Forty"};

        //Win condition
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            return "Win for " + player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            return "Win for " + player2Name;
        }

        //Advantage after deuce
        if (player1Point > player2Point && player2Point >= 3)
        {
            return "Advantage " + player1Name;
        }
        if (player2Point > player1Point && player1Point >= 3)
        {
            return "Advantage " + player2Name;
        }

        //คะแนนเท่ากันแต่ยังไม่ถึง deuce
        boolean sameScoreButNotDeuce = player1Point == player2Point && player1Point < 3;
        if (sameScoreButNotDeuce)
        {
            return textScores[player1Point] + "-All";
        }

        //คะแนนเท่ากัน
        boolean isDeuce = player1Point == player2Point && player1Point >=3;
        if (isDeuce) {

            return "Deuce";
        }

        //Normal case
        return textScores[player1Point] + "-" + textScores[player2Point];

    }




    public void p1Score(){

        player1Point++;

    }



    public void p2Score(){

        player2Point++;

    }



    public void wonPoint(String player) {

        if ("player1".equals(player))

            p1Score();

        else

            p2Score();

    }

}
