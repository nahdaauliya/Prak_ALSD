package jobsheet3;

public class LecturerData21 {

   public static void showAllLecturerData(Lecturer21[] lecturerArray){
      for (Lecturer21 lecturer : lecturerArray){
         System.out.println("========================================================================================================================================");
         System.out.println("Id number: " + lecturer.idNumber);
         System.out.println("Name: " + lecturer.name);
         System.out.println("Gender: " + (lecturer.gender != null ? (lecturer.gender? "Male" : "Female"): "Unknown"));
         System.out.println("Age: " + lecturer.age);
      }
      System.out.println("========================================================================================================================================");
      System.out.printf("%-30s %30s %30s %20s\n", "Id Number", "Name", "Gender", "Age");
      System.out.println("========================================================================================================================================");
      for (Lecturer21 lecturer : lecturerArray){
         System.out.printf("%-32s %30s %28s %21s\n", lecturer.idNumber, lecturer.name, lecturer.gender != null ? (lecturer.gender? "Male" : "Female"): "Unknown", lecturer.age);
      }
   }

   public static void countLecturerByGender(Lecturer21[] lecturerArray){
      int countMale = 0;
      int countFemale = 0;
      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.gender != null){
            if (lecturer.gender){
               countMale++;
            } else {
               countFemale++;
            }

         }
      }
      System.out.println("Male Lecturer: " + countMale);
      System.out.println("Female Lecturer: " + countFemale);
   }

   public static void averageLecturerAgeByGender(Lecturer21[] lecturerArray){
      int countMale = 0;
      int countFemale = 0;
      int countAgeMale = 0;
      int countAgeFemale = 0;
      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.gender != null){
            if (lecturer.gender){
               countMale++;
               countAgeMale += lecturer.age;
            }else {
               countFemale++;
               countAgeFemale += lecturer.age;
            }
         }
      }
      if (countMale > 0){
         System.out.println("Average Male Lecturer Age: " + (countAgeMale / countMale));
      }else {
         System.out.println("Nothing to calculate");
      }

      if (countFemale > 0){
         System.out.println("Average Female Lecturer age: " + (countAgeFemale/ countFemale));
      } else{
         System.out.println("Nothing to calculate");
      }
      
   }
    
   public static void showOldestLecturerInfo(Lecturer21[] lecturerArray){
      int oldestLecturer = 0;
      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.age > oldestLecturer){
            oldestLecturer = lecturer.age;   
         }
      }
      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.age == oldestLecturer){
            System.out.println("========================================================================================================================================");
            System.out.println("Id number: " + lecturer.idNumber);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender != null ? (lecturer.gender? "Male" : "Female"): "Unknown"));
            System.out.println("Age: " + lecturer.age);
         }
      }
   }

   public static void showYoungestLecturerInfo(Lecturer21[] lecturerArray){
      int youngestAge = Integer.MAX_VALUE;

      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.age < youngestAge){
            youngestAge = lecturer.age;   
         }
      }
      for (Lecturer21 lecturer : lecturerArray){
         if (lecturer.age == youngestAge){
            System.out.println("========================================================================================================================================");
            System.out.println("Id number: " + lecturer.idNumber);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender != null ? (lecturer.gender? "Male" : "Female"): "Unknown"));
            System.out.println("Age: " + lecturer.age);
         }
      }

   }
}
