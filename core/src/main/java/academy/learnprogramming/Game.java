package academy.learnprogramming;

public interface Game {

    int getNumber();

    int getGuess();

    void setGuest(int guess);

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGamesLost();
}
