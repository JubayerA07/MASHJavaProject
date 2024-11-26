import java.util.Scanner;

public class MASHRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mash!");
        System.out.println();

        //Get user input for jobs category
        System.out.println("Please enter one job you WOULD like to have:");
        String Job1 = scanner.nextLine();
        System.out.println("Please enter one job you would NOT like to have:");
        String Job2= scanner.nextLine();
        System.out.println("Please enter one job you WOULD like to have:");
        String Job3 = scanner.nextLine();
        System.out.println("Please enter one job you would NOT like to have:");
        String Job4 = scanner.nextLine();
        System.out.println();

        //Get user input for cars category
        System.out.println("Please enter one vehicle you WOULD like to have:");
        String Car1 = scanner.nextLine();
        System.out.println("Please enter one vehicle you would NOT like to have:");
        String Car2= scanner.nextLine();
        System.out.println("Please enter one vehicle you WOULD like to have:");
        String Car3= scanner.nextLine();
        System.out.println("Please enter one vehicle you would NOT like to have:");
        String Car4 = scanner.nextLine();
        System.out.println();

        //Get user input for location category
        System.out.println("Please enter a location where you WOULD like to live:");
        String Lo1 = scanner.nextLine();
        System.out.println("Please enter a location where you would NOT like to live:");
        String Lo2= scanner.nextLine();
        System.out.println("Please enter a location where you WOULD like to live:");
        String Lo3= scanner.nextLine();
        System.out.println("Please enter a location where you would NOT like to live:");
        String Lo4 = scanner.nextLine();
        System.out.println();


        // Get user input for kids category
        System.out.println("Please enter the number of children you WOULD be comfortable having (must be greater than 0):");
        String Kid1 = scanner.nextLine();
       // Validate input for Kid1
        if (Kid1.matches("\\d+") && Integer.parseInt(Kid1) > 0) {
            System.out.println("Valid input for kids.");
        } else {
            System.out.println("Invalid input for kids. Defaulting to 1.");
            Kid1 = "1";
        }
        System.out.println("Please enter the number of children you would NOT be comfortable having (must be greater than 0):");
        String Kid2 = scanner.nextLine();
        // Validate input for Kid2
        if (Kid2.matches("\\d+") && Integer.parseInt(Kid2) > 0) {
            System.out.println("Valid input for kids.");
        } else {
            System.out.println("Invalid input for kids. Defaulting to 1.");
            Kid2 = "1";
        }
        System.out.println("Please enter the number of children you WOULD be comfortable having (must be greater than 0):");
        String Kid3 = scanner.nextLine();
        // Validate input for Kid3
        if (Kid3.matches("\\d+") && Integer.parseInt(Kid3) > 0) {
            System.out.println("Valid input for kids.");
        } else {
            System.out.println("Invalid input for kids. Defaulting to 1.");
            Kid3 = "1";
        }
        System.out.println("Please enter the number of children you would NOT be comfortable having (must be greater than 0):");
        String Kid4 = scanner.nextLine();
        // Validate input for Kid1
        if (Kid4.matches("\\d+") && Integer.parseInt(Kid4) > 0) {
            System.out.println("Valid input for kids.");
            System.out.println();
        } else {
            System.out.println("Invalid input for kids. Defaulting to 1.");
            Kid4 = "1";
            System.out.println();
        }


        // Define categories and options
        MashOption houses = new MashOption("House", new String[]{"Mansion", "Apartment", "Shack", "House"});
        MashOption jobs = new MashOption("Job", new String[]{Job1, Job2, Job3, Job4});
        MashOption cars = new MashOption("Car", new String[]{Car1, Car2, Car3, Car4});
        MashOption location = new MashOption("Location", new String[]{Lo1, Lo2, Lo3, Lo4});
        MashOption kids = new MashOption("Kids", new String[]{Kid1, Kid2, Kid3, Kid4});

        MashOption[] categories = {houses, jobs, cars, location, kids};



        // Initialize game
        MashGame game = new MashGame(categories);

        // Display results
        System.out.println(game.playGame());

        scanner.close();


    }
}