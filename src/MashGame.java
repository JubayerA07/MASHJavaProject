public class MashGame {
    private MashOption[] categories;

    public MashGame(MashOption[] categories) {
        this.categories = categories;
    }

    public String playGame() {
        StringBuilder result = new StringBuilder("Your Future:\n");

        // Iterate through the categories to build results
        String[] prompts = {
                "You will live in a ",
                "You will work as a ",
                "You will drive a ",
                "You will live in ",
                "You will have "
        };

        for (int i = 0; i < categories.length; i++) {
            result.append(prompts[i]).append(categories[i].getRandomOption());
            if (i == 4) {
                result.append(" kid(s).");
            }
            result.append("\n");
        }

        return result.toString();
    }
}