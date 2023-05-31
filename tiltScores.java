import java.util.Scanner;

public class tiltScores {
    public static void main(String[] args) {
        // Create tilt score range arrays, upper and lower.
        double[] lowerRanges = {-0.47, -0.30, -0.19, -0.18, -0.11, -0.04, -0.04, -0.01, 0.06, 0.12, 0.18, 0.27, 0.42};
        double[] upperRanges = {-0.29, -0.20, -0.19, -0.12, -0.05, -0.04, -0.02, 0.05, 0.11, 0.17, 0.26, 0.41, 0.42};

        // Create array with specific majors to match with tilt score ranges.
        String[][] specificMajors = {
                {"Classical Studies", "English", "Linguistics"},
                {"Communication"},
                {"Philosophy", "Psychology"},
                {"Anthropology", "History", "Law, Societies, and Justice", "Political Science", "Real Estate",
                        "Social Welfare", "Sociology"},
                {"Education Studies"},
                {"Art", "Art History", "Cinema & Media Studies", "Drama", "Music"},
                {"Food Systems, Nutrition, and Health", "Medical Laboratory Science", "Neuroscience", "Nursing",
                        "Public Health - Global Health"},
                {"Biochemistry", "Biology", "Marine Biology", "Microbiology"},
                {"Business Administration", "Economics"},
                {"Astronomy", "Atmospheric Sciences", "Chemistry", "Environmental Studies", "Geography", "Physics"},
                {"Computer Science", "Informatics"},
                {"Architecture", "Bioengineering", "Chemical Engineering", "Civil Engineering",
                        "Computer Science and Engineering", "Electrical Engineering", "Environmental Engineering",
                        "Industrial Engineering", "Mechanical Engineering"},
                {"Aeronautics and Astronautics", "Earth and Space Sciences", "Mathematics"}
        };

        getUserTiltScore(lowerRanges, upperRanges, specificMajors);
    }

    public static void getUserTiltScore(double[] lowerRanges, double[] upperRanges, String[][] specificMajors) {
        Scanner console = new Scanner(System.in);
        String majorFile = "../project/Majors.txt";//This is not right.

        System.out.print("Would you like to use your average Tilt Score to determine your major? (yes/no) ");
        String response = console.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("What is your average Tilt Score? ");
            double averageTiltScore = console.nextDouble();

            int matchingIndex = findMatchingIndex(averageTiltScore, lowerRanges, upperRanges);

            if (matchingIndex >= 0 && matchingIndex < specificMajors.length) {
                System.out.println("These are the majors that correspond to your average Tilt Score:");
                for (String major : specificMajors[matchingIndex]) {
                    System.out.println("- " + major);
                }
            } else {
                System.out.println("No matching majors found based on your average Tilt Score.");
            }
        } else if (response.equalsIgnoreCase("no")) {
            System.out.print("Would you like to see the complete list of majors? (yes/no) ");
            response = console.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.println(majorFile);
            }
        }
    }

    public static int findMatchingIndex(double averageTiltScore, double[] lowerRanges, double[] upperRanges) {
        for (int i = 0; i < lowerRanges.length; i++) {
            if (averageTiltScore >= lowerRanges[i] && averageTiltScore <= upperRanges[i]) {
                return i;
            }
        }
        return -1;
    }
}
