import java.util.Scanner;

public class testScores {
    public static void main(String[] args) {
        //Create one array for the upper range and one array for the lower range of each grouping of tilt scores.
        double[] lowerRanges = {-0.47, -0.30, -0.19, -0.18, -0.11, -0.04,
                                -0.04, -0.01, 0.06, 0.12, 0.18, 0.27, 0.42};
        double[] upperRanges = {-0.29, -0.20, -0.19, -0.12, -0.05, -0.04,
                                -0.02, 0.05, 0.11, 0.17, 0.26, 0.41, Double.POSITIVE_INFINITY};
        //Create an array for major groupings
        String[] majorGroupings = {"English", "Communication", "Psychology", "Social Sciences", "Education",
                                    "Liberal Arts", "Health Professions", "Biology", "Business",
                                    "Physical Science", "Computer Science", "Engineering", "Mathematics"};
        //Create an array for specific majors within the major groupings
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

        // Prompt the user to input their average tilt score
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your average tilt score? ");
        double averageTiltScore = scanner.nextDouble();

        // Find the index of the matching major grouping
        //Take avg tilt score, lower range and upper range as parameters to find the index of the
        //matching major grouping. Store the results in matchingIndex.
        int matchingIndex = findMatchingIndex(averageTiltScore, lowerRanges, upperRanges);

        //if matchingIndex does not equal -1 that means a match has been found. our range of tilt scores
        //is from -0.47 to 0.42.
        if (matchingIndex != -1) {
            //Display the matching major grouping
            //Retrieves the specific major grouping that corresponds to the average tilt score provided by the user.
            String matchingMajorGrouping = majorGroupings[matchingIndex];
            System.out.println("Major Grouping: " + matchingMajorGrouping);

            // Prompt the user if they want to see the specific majors within their majorGrouping
            System.out.print("Would you like to see the specific majors in this grouping? (Y/N): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Y")) {
                //Display the specific majors within the majorGrouping based on their tilt score.
                String[] majors = specificMajors[matchingIndex];
                System.out.println("Specific Majors:");
                for (String major : majors) {
                    System.out.println("- " + major);
                }
            }
        } else {
            System.out.println("No matching major grouping found.");
        }
    }

    public static int findMatchingIndex(double averageTiltScore, double[] lowerRanges, double[] upperRanges) {
        for (int i = 0; i < lowerRanges.length; i++) { //loop through the lower ranges array, continues to loop
            //as long as i is less than the lower ranges array length.
            //check the tilt score against the lower ranges array
            if (averageTiltScore >= lowerRanges[i] && averageTiltScore <= upperRanges[i]) {
                //this checks to see if the tilt score is within a range between lower and upper ranges arrays
                return i;
                //return the position of the array index to determine the corresponding major group
            }
        }
        return -1; //if no match is found, return -1.
    }
}
/*
//testing notes:
if user chooses "no" when asked if they want to see the specific majors in their grouping,
no further programming is executed.
Thinking of where we can integrate this chunk of code into the core programming-
Do we want to use this point to move onto asking about jobs in the specific major grouping?
If a user inputs a tilt score that is out of range, do we want to prompt them to enter a score that is
within the specified range? (-0.47 to 0.42)
if the user types "yes" or "no" when asked if they want to see the specific majors, nothing happens.
They have to specifically type "y" or "n" - Do we want to change this?
Do you agree with how the majors are divided up into majorGroupings?
*/