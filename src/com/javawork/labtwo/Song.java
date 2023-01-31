package JavaClassWork.src.com.javawork.labtwo;
// Kenneth Angelikas
// 1/30/22
// Song
public class Song {

    static String verse1(String animal) {
        // Verse 1 the animal gets assigned to the variables same throughout the song
        return ("Bought me a " + animal + " and the " + animal + " pleased me,\n"
                + "I fed my " + animal + " under yonder tree.");
    }

    static String catverse() {
        return ("Cat goes fiddle-i-fee.");
    }

    static String henverse() {
        return ("Hen goes chimmy-chuck, chimmy-chuck,");
    }

    static String duckverse() {
        return ("Duck goes quack, quack,");
    }

    static String gooseverse() {
        return ("Goose goes hissy, hissy,");
    }

    static String sheepverse() {
        return ("Sheep goes baa, baa,");
    }

    static String pigverse() {
        return ("Pig goes oink, oink,");
    }

    public static void main(String[] args) {
        // Variables
        final String hen = "Hen";
        final String cat = "Cat";
        final String duck = "Duck";
        final String goose = "Goose";
        final String sheep = "Sheep";
        final String pig = "Pig";

        // main function
        // a for loop to iterate through the song
        for (int i = 0; i < 6; i++) {
            System.out.println();

            if (i == 0) {
                System.out.println(verse1(cat) + "\n" + catverse());
            } else if (i == 1) {
                System.out.println(verse1(hen) + "\n" + henverse() + "\n" + catverse());
            } else if (i == 2) {
                System.out.println(verse1(duck) + "\n" + duckverse() + "\n" + henverse() + "\n" + catverse());
            } else if (i == 3) {
                System.out.println(verse1(goose) + "\n" + gooseverse() + "\n" + duckverse() + "\n" + henverse() + "\n" + catverse());
            } else if (i == 4) {
                System.out.println(verse1(sheep) + "\n" + sheepverse() + "\n" + gooseverse() + "\n" + duckverse() + "\n" + henverse() + "\n" + catverse());
            } else {
                System.out.println(verse1(pig) + "\n" + pigverse() + "\n" + sheepverse() + "\n" + gooseverse() + "\n" + duckverse() + "\n" + henverse() + "\n" + catverse());
            }

        }
    }
}
