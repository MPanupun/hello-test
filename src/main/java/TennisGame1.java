import java.util.Objects;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;
    private final String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty" };

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    public String getScore() {
        if (m_score1 == m_score2)
           return  getScoreResults(m_score1);
        if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if(minusResult >= 1)
                return getPlayer1Name(minusResult,this.player1Name);
            else {
                return getPlayer1Name(minusResult * -1,this.player2Name);
            }
        }
        return scoreResults[m_score1]+("-")+scoreResults[m_score2];
    }
    public String getPlayer1Name(int minusResult,String player)
    {
        if(minusResult >= 2)
            return   "Win for " + player;
        else
            return  "Advantage " + player;
    }
    public String getScoreResults(int number)
    {
        if(number <= 2)
            return scoreResults[m_score1] +"-All";
        else
            return "Deuce";
    }
}