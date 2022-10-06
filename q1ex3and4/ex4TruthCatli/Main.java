/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4TruthCatli;

/**
 *
 * @author TRUTH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declares the initial favorite song
        Song one = new Song("One");
        String favoriteSong = one.name();
        
        //declares the initial pet name and color
        Pet whiteCat = new Pet("white", "cat");
        String petName = whiteCat.name();
        String petColor = whiteCat.color();
        
        //creates an instance of a singer called rick and introduces them
        Singer rick = new Singer("Rick", 0, 0, favoriteSong, petName, petColor);
        Singer astley = new Singer("Astley", 2, 0, favoriteSong, petName, petColor);
        rick.introduce();
        astley.introduce();
        rick.totalPerfCount();
        
        //changes pet name and color
        Pet brownDog = new Pet("brown", "dog");
        petName = brownDog.name();
        petColor = brownDog.color();
        rick.changePet(petName, petColor);
        
        //performs for an audience altering some values in the object
        rick.performForAudience(astley, 12);
        
        //changes pet name and color and introduces again to show the changes
        Pet pinkRabbit = new Pet("pink", "rabbit");
        petName = pinkRabbit.name();
        petColor = pinkRabbit.color();
        rick.changePet(petName, petColor);
        rick.introduce();
        astley.introduce();
        astley.totalPerfCount();
        
        //updates the favorite song and introduces to show updated information
        Song two = new Song("Two");
        favoriteSong = two.name();
        rick.changeFavSong(favoriteSong);   
        rick.introduce();
        rick.totalPerfCount();
    }
    
}
