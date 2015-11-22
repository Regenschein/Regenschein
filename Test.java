import java.util.Scanner;

/**
  * Simpelster Test um meinen Githubeinstieg zu ermoeglichen
  */
  public class Test {

    public Test(String s) {

      System.out.println("Willkommen auf GitHub, " + s);

    }

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Wie ist dein Name?");
      Test test = new Test(scanner.nextLine());

    }



  }
