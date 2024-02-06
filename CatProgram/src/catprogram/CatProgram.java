package catprogram;

import java.util.Scanner;

public class CatProgram {

    public static void main(String[] args) {

        Scanner kboard = new Scanner(System.in);

        //objects
        Cat[] theCats = new Cat[3];

        for (int i = 0; i < theCats.length; i++) {
            theCats[i] = new Cat();
            System.out.println("Enter name for cat " + (i + 1));
            String catName = kboard.next();
            theCats[i].setCatName(catName);

            System.out.println("Enter breed for cat " + (i + 1));
            String catBreed = kboard.next();
            theCats[i].setCatBreed(catBreed);

            System.out.println("Enter age for cat " + (i + 1));
            int catAge = kboard.nextInt();
            theCats[i].setCatAge(catAge);

        }
        
        //display cats deatatils
        theCats[0].cat(theCats[0].getCatName(), theCats[0].getCatBreed(), theCats[0].getCatAge());
    }

}
