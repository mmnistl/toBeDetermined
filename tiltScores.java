import java.io.*;
import java.util.*;
public class Project {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner main = new Scanner(System.in);
        //files path with information or just string with information
        String majorFile = "../project/Majors.txt";
        String jobsFile = "../project/Jobs.txt";
        String salariesFile = "../project/JobsSalaries.txt";
        System.out.println("This is an interactive program that prompts the user to choose majors from a four-year university, then choose corresponding job titles.\nThe user will input student loan information to determine if their average salaries will be able to cover their monthly loan payments.\nThis is applicable to universities in the United States only.\n");

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
        
    //tiltScore
    public static void getUserTiltScore(double[] lowerRanges, double[] upperRanges, String[][] specificMajors) {
        Scanner console = new Scanner(System.in);

        System.out.print("Would you like to use your Tilt Score to determine your major? (yes/no) ");
        String response = console.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("What is your Tilt Score? ");

            while (!console.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number in decimal format.");
                System.out.print("What is your Tilt Score? ");
                console.nextLine();
            }

            double tiltScore = console.nextDouble();
            console.nextLine();

            int matchingIndex = findMatchingIndex(tiltScore, lowerRanges, upperRanges);

            if (matchingIndex >= 0 && matchingIndex < specificMajors.length) {
                System.out.println("These are the majors that correspond to your Tilt Score:");
                for (String major : specificMajors[matchingIndex]) {
                    System.out.println("- " + major);
                }
                System.out.println();
                System.out.println("Additionally, here is the complete list of Majors: \n");
            } else {
                System.out.println("No matching majors found based on your Tilt Score.\n");
            }
        } else if(response.equalsIgnoreCase("no")){
            System.out.print("Here is the complete list of Majors to choose from: \n");
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
