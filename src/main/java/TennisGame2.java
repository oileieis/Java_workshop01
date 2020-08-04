public class TennisGame2
{

    private int p1Point;

    private int p2Point;


    private String player1Name;

    private String player2Name;



    public TennisGame2(String player1Name, String player2Name) {

        this.player1Name = player1Name;

        this.player2Name = player2Name;

    }



    public String getScore(){
        String player1Result = "";
        String player2Result = "";

        String score = "";

        if (p1Point == p2Point && p1Point < 4)

        {

            if (p1Point ==0)

                score = "Love";

            if (p1Point ==1)

                score = "Fifteen";

            if (p1Point ==2)

                score = "Thirty";

            score += "-All";

        }

        if (p1Point == p2Point && p1Point >=3)

            score = "Deuce";



        if (p1Point > 0 && p2Point ==0)

        {

            if (p1Point ==1)

                player1Result = "Fifteen";

            if (p1Point ==2)

                player1Result = "Thirty";

            if (p1Point ==3)

                player1Result = "Forty";



            player2Result = "Love";

            score = player1Result + "-" + player2Result;

        }

        if (p2Point > 0 && p1Point ==0)

        {

            if (p2Point ==1)

                player2Result = "Fifteen";

            if (p2Point ==2)

                player2Result = "Thirty";

            if (p2Point ==3)

                player2Result = "Forty";



            player1Result = "Love";

            score = player1Result + "-" + player2Result;

        }



        if (p1Point > p2Point && p1Point < 4)

        {

            if (p1Point ==2)

                player1Result="Thirty";

            if (p1Point ==3)

                player1Result="Forty";

            if (p2Point ==1)

                player2Result="Fifteen";

            if (p2Point ==2)

                player2Result="Thirty";

            score = player1Result + "-" + player2Result;

        }

        if (p2Point > p1Point && p2Point < 4)

        {

            if (p2Point ==2)

                player2Result="Thirty";

            if (p2Point ==3)

                player2Result="Forty";

            if (p1Point ==1)

                player1Result="Fifteen";

            if (p1Point ==2)

                player1Result="Thirty";

            score = player1Result + "-" + player2Result;

        }



        if (p1Point > p2Point && p2Point >= 3)

        {

            score = "Advantage " + player1Name;

        }



        if (p2Point > p1Point && p1Point >= 3)

        {

            score = "Advantage " + player2Name;

        }



        if (p1Point >=4 && p2Point >=0 && (p1Point - p2Point)>=2)

        {

            score = "Win for " + player1Name;

        }

        if (p2Point >=4 && p1Point >=0 && (p2Point - p1Point)>=2)

        {

            score = "Win for " + player2Name;

        }

        return score;

    }




    public void p1Score(){

        p1Point++;

    }



    public void p2Score(){

        p2Point++;

    }



    public void wonPoint(String player) {

        if ("player1".equals(player))

            p1Score();

        else

            p2Score();

    }

}
