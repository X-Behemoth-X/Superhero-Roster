public class SuperheroRoster {

    public static void main(String[] args) {
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging, Super Strength, and Enhanced Senses", "Flying high-tech armor, Genius mind, and Rich", "Stealth, Combat, and Espionage"};
        int[] powerLevels = {85, 90, 50};

        System.out.println("=== Superhero Roster ===");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println("-----------------------");
        }

        String searchName = "Iron Man";
        searchHero(heroNames, abilities, powerLevels, searchName);

        double avgPower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + avgPower);

        System.out.println("\n=== Superhero Objects ===");
        Superhero[] heroObjects = new Superhero[heroNames.length];
        for (int i = 0; i < heroNames.length; i++) {
            heroObjects[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            heroObjects[i].displayHero();
            System.out.println("-----------------------");
        }
    }

    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\n=== Hero Found ===");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nHero not found: " + target);
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}