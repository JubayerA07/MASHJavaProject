public class MashOption {
    private String category;
    private String[] options;

    public MashOption(String category, String[] options) {
        this.category = category;
        this.options = options;
    }


    public String getRandomOption() {
        int randomIndex = (int) (Math.random() * options.length);
        return options[randomIndex];
    }



}

