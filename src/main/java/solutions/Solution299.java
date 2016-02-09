package solutions;

/**
 * You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to
 * guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits
 * in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits
 * match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses
 * and hints to eventually derive the secret number.
 *
 * @see <a href="https://leetcode.com/problems/bulls-and-cows/">299. Bulls and Cows</a>
 */
public class Solution299 {
    public String getHint(String secret, String guess) {
        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();
        int bulls = 0;
        int cows = 0;

        for (int pos = 0; pos < secret.length(); pos++) {
            if (secretChars[pos] == guessChars[pos]) {
                bulls++;
                secretChars[pos] = ' ';
                guessChars[pos] = ' ';
            }
        }

        for (int posSecret = 0; posSecret < secret.length(); posSecret++) {
            for (int posGuess = 0; posGuess < guess.length(); posGuess++) {
                if (secretChars[posSecret] != ' ' && secretChars[posSecret] == guessChars[posGuess]) {
                    cows++;
                    secretChars[posSecret] = ' ';
                    guessChars[posGuess] = ' ';
                }
            }
        }
        return String.format("%dA%dB", bulls, cows);
    }
}
