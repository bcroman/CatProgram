package catprogram;

import java.io.IOException;
import java.util.Scanner;

public class CatProgram {

    public static void main(String[] args) throws IOException {

        Scanner kboard = new Scanner(System.in);

        //objects
        Cat[] theCats = new Cat[3];

        for (int i = 0; i < theCats.length; i++) {
            theCats[i] = new Cat();
            System.out.println("Enter name for cat " + (i + 1));
            String catName = kboard.next();

            System.out.println("Enter breed for cat " + (i + 1));
            String catBreed = kboard.next();

            System.out.println("Enter age for cat " + (i + 1));
            int catAge = kboard.nextInt();

            theCats[i].getCatDetails(catName, catBreed, catAge);

        }

        //display cats deatatils
        theCats[0].displaytDetailsd();
        theCats[1].displaytDetailsd();
        theCats[2].displaytDetailsd();
    }

}
