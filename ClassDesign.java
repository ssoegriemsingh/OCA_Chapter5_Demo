import classes.Character;
import classes.Knight;
import classes.Paladin;
import classes.Villager;

import java.util.Arrays;
import java.util.ArrayList;

public class ClassDesign {

    private static final String LINEBREAK = "\n";
    private static final String MARKER = "- ";
    private static final String ATKOPTIONS = "Attack options:";
    private static final String DEFOPTIONS = "Defense options:";

    public static void main(String[] args) {
        ClassDesign classDesign = new ClassDesign();
    }

    private ClassDesign() {
        ArrayList<Character> charList = createCharacters();
        displayCharacters(charList);
    }

    private ArrayList<Character> createCharacters() {
        ArrayList<Character> charList = new ArrayList<>();

        Knight k = new Knight();
        Paladin p = new Paladin();
        Villager v = new Villager();

        charList.addAll(Arrays.asList(k, p, v));
        return charList;
    }

    private void displayCharacters(ArrayList<Character> charList) {
        for (Character c : charList) {
            System.out.println(LINEBREAK + MARKER + c.name);

            System.out.println(LINEBREAK + ATKOPTIONS);
            c.attackOptions();

            System.out.println(LINEBREAK + DEFOPTIONS);
            c.defenseOptions();
        }
    }
}
