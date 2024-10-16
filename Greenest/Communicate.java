/*
 * Interface Communicate
 * Implementeras av classer som hämtar, processar och lämnar info från användare så länge som användaren önskar.
 *
 * Ylva Fröjmark
 * 24-09-29
 *
 * Metoder:
 * void askForInput(String question)
 * void processInput(String input)
 * void respond(String response)
 * void goAgain(String option)
 */

package Sprint1.Greenest;

public interface Communicate {
    void askForInput(String question);
    void processInput(String input);
    void respond(String response);
    void goAgain(String option);
}
