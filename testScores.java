import java.util.Scanner;

public class testScores {
    public static void main(String[] args) {
        // Initialize the list of majors
        String[] majors = {
                "Biological and Biomedical Sciences",
                "Business, Management, Marketing, and Related Support Services",
                "Communication, Journalism, and Related Programs",
                "Computer and Information Sciences and Support Services",
                "Education",
                "Engineering",
                "English Language and Literature/Letters",
                "Health Professions and Related Programs",
                "Liberal Arts and Sciences, General Studies, and Humanities",
                "Mathematics and Statistics",
                "Physical Sciences",
                "Psychology",
                "Social Sciences"
        };

        // Initialize the score ranges and their corresponding majors
        int[] scoreRanges = {
                400, 560, 700, 630, 700, 630, 770, 690, 680, 850, 770, 710, 590, 1600
        };
        double[] tiltAverages = {
                -0.01, 0.06, -0.30, 0.18, -0.11, 0.27, -0.47, -0.04, -0.04, 0.42, 0.12, -0.19, -0.18
        };

        // Get the total SAT score from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your total SAT score: ");
        int totalScore = scanner.nextInt();
        scanner.close();

        // Find the best-suited college major based on the total score
        int majorIndex = -1;
        for (int i = 0; i < scoreRanges.length; i++) {
            if (totalScore >= scoreRanges[i]) {
                majorIndex = i;
                break;
            }
        }

        // Display the suggested major
        if (majorIndex != -1) {
            System.out.println("Suggested major: " + majors[majorIndex]);
            System.out.println("Tilt average: " + tiltAverages[majorIndex]);
        } else {
            System.out.println("No major suggestion based on the given score.");
        }
    }
}

//Narrow down Major options
//     Scanner scanner = new Scanner(System.in);
//     System.out.print("Would you like to see the available majors in " + majors[majorIndex] + "?");
//     int totalScore = scanner.nextInt();
//     scanner.close();
//
// move onto selecting major code that is already written.
