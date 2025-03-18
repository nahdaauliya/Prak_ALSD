package p1;

public class Member{
    String nameMember;
    int age;
    int workoutHours;
    double membershipFee;

    public Member(){

    }

    public Member(String name, int age, int hours, double fee){
        nameMember = name;
        this.age= age;
        workoutHours= hours;
        membershipFee = fee;

    }

    public static void totalCost(Member[] memberArray){
        double total;
        for (Member members : memberArray){
            if (members.workoutHours > 15){
                total = members.workoutHours * members.membershipFee * (10/100); 
            } else{
                total = members.workoutHours * members.membershipFee;
            }
        }
    }
    void print(Member[] memberArray){
        for(Member members : memberArray){
            System.out.println("===================================================================================");
            System.out.println("Name: " +members.nameMember);
            System.out.println("Age: "+ members.age);
            System.out.println("Workout Hours: "+ members.workoutHours);
            System.out.println("Membership Fee: " + members.membershipFee);
        }
        
    }
    public static void printData(Member[] memberArray){
        for(Member members : memberArray){
            System.out.println("===================================================");
            System.out.println("Name Member: " + members.nameMember);
            System.out.println("Age: " + members.age);
            System.out.println("Workout Hours: " + members.workoutHours);
            System.out.println("Membership Fee" +members.membershipFee);

        }
        System.out.println("========================================================================================================================================");
        System.out.printf("%-30s %30s %30s %20s\n", "Name", "Age", "Workout Hours", "Membership Fee");
        System.out.println("========================================================================================================================================");
        for (Member members : memberArray){
            System.out.printf("%-30s %30s %30s %20s\n" + members.nameMember + members.age +members.workoutHours+ members.membershipFee);
        }
        calculateTotalWorkoutHoursMembers40YearsOld(memberArray);
        calculateNumberOfMemberAgeBetween35and40(memberArray);
    }

    public static void calculateTotalWorkoutHoursMembers40YearsOld(Member[] memberArray){
        int calculate40 = 0;
        for (Member members : memberArray){
            if (members.age >= 40){
                calculate40 += members.workoutHours;
            }
        }
        System.out.println("Total Workout Hours Of All Members Above 40 Years Old is "+ calculate40 );
    }

    public static void calculateNumberOfMemberAgeBetween35and40(Member[] memberArray){
        int numMember = 0;
        for (Member members : memberArray){
            if (members.age >= 35 && members.age <= 40){
                numMember++;
            }
        }
        System.out.println("Number of member age between 35 and 40 is " + numMember);
    }
    
}