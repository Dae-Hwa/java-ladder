package laddergame.view;

import java.util.Scanner;

public class LadderGameInput {

  private static final Scanner scanner = new Scanner(System.in);

  public static String[] getPlayerNamesInputWithPrintMsg() {
    LadderGameView.printInputPlayerNamesMsg();

    return scanner.nextLine().split(",");
  }

  public static String[] getResultNamesInputWithPrintMsg() {
    LadderGameView.printInputResultNamesMsg();

    return scanner.nextLine().split(",");
  }

  public static int getHeightInputWithPrintMsg() {
    LadderGameView.printInputLadderHeightMsg();

    int value = scanner.nextInt();
    scanner.nextLine();

    return value;
  }

  public static String getPlayerForResultInputWithPrintMsg() {
    LadderGameView.printInputPlayerForResultMsg();

    return scanner.nextLine();
  }

}
