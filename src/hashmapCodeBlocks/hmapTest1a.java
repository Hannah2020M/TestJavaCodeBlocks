package hashmapCodeBlocks;

import java.util.HashMap;
import java.util.ArrayList;

public class hmapTest1a {
    public static void main(String[] args){

            System.out.println("Testing hashmap code blocks");
        HashMap<String, String> hFavorites = new HashMap<>();

        hFavorites.put("Favorite man", "Mr.Moses");
        hFavorites.put("Favorite place ", "Niagara Falls,Canada");
        hFavorites.put("Favorite food","Kolache");
        hFavorites.put("Favorite chair","Rocking chair");
        hFavorites.put("Favorite role model", "Angela");
        hFavorites.put("Favorite kid", "Alice");
        hFavorites.put("Favorite person", "my mom Beatrice");
        hFavorites.put("Favorite book","Holy Bible");
        hFavorites.put("Favorite hymn","Praise to the Lord");
        hFavorites.put("Favorite Color","Red");
ArrayList<HashMap<String,String>> alFavorites = new ArrayList<>();
System.out.println(hFavorites.toString());
        System.out.println(alFavorites.toString());
    }
}
