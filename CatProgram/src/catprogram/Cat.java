package catprogram;

import java.io.*;

public class Cat {

    //variables
    private String catName;
    private String catBreed;
    private int catAge;

    //constructor 
    Cat() {
        catName = "Unknown";
        catBreed = "Unknown";
        catAge = 0;
    }

    public void cat(String a, String b, int c) {
        getCatDetails(a, b, c);
    }

    //methods
    public void getCatDetails(String gCatName, String gBreed, int gAge) {
        catName = gCatName;
        catBreed = gBreed;
        catAge = gAge;
    }

    public void displaytDetailsd()
            throws IOException {
        System.out.println("Cats name is : " + catName);
        System.out.println("Cats breed is : " + catBreed);
        System.out.println("Cats age is : " + catAge);
    }

    //getters and setters
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

}
