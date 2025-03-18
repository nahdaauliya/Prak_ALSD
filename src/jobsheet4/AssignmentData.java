package jobsheet4;

public class AssignmentData {
    public static void showAllData(Assignmentt[] assignmentArray){
        for(Assignmentt assignment : assignmentArray){
            System.out.println("===================================");
            System.out.println("Name: " + assignment.name);
            System.out.println("Id Number: "+ assignment.studentID);
            System.out.println("Year of Admission: "+ assignment.yearOfAdmission);
            System.out.println("Midterm Score: "+ assignment.midtermScore);
            System.out.println("Final Score: "+ assignment.finalScore);
        }

        System.out.println("===================================");
        System.out.printf("%-30s %30s %30s %20s\n", "Name", "Midterm Score", "Final Score", "Total Score");
        System.out.println("===================================");
        for (Assignmentt assignment : assignmentArray){
            System.out.printf("%-32s %30s %28d %21d\n", assignment.name , assignment.studentID, assignment.yearOfAdmission, assignment.midtermScore, assignment.finalScore);
        }
    }

    public static Assignmentt findMax (Assignmentt[] assignmentArray, int left, int right){
        if (left == right){
            return assignmentArray[left];
        }

        int mid = (left + right) / 2;
        Assignmentt leftResult = findMax(assignmentArray, left, mid);
        Assignmentt rightResult = findMax(assignmentArray, mid + 1, right);

        return (leftResult.midtermScore > rightResult.midtermScore) ? leftResult : rightResult;
    }

    public static Assignmentt findMin (Assignmentt[] assignmentArray, int left, int right){
        if (left == right){
            return assignmentArray[left];
        }

        int mid = (left + right)/ 2;
        Assignmentt leftResult = findMin(assignmentArray, left, mid);
        Assignmentt rightResult = findMin(assignmentArray, mid + 1, right); 

        return (leftResult.midtermScore < rightResult.midtermScore) ? leftResult : rightResult;
    }

    public static double calculateAverageFinalScore(Assignmentt[] data){
        int total = 0;

        for (Assignmentt assignment : data){
            total += assignment.finalScore;
        }
        
        return (double) total / data.length;
    }
}
