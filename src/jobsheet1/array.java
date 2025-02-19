package jobsheet1;

import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String [] courseName = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemograman", "Keselamatan dan Kesehatan Kerja"};
        int [] grade = new int[8];
        String [] letterGrade = new String[8];
        double [] nilaiSetara = new double[8];
        int [] bobotSKS = {2, 2, 2, 3, 2, 3, 1, 2};
        double ipSemester = 0;
        double totalNilai = 0;
        double totalSKS = 0;

        System.out.println("===================================================");
        System.out.println("Program For Calculate Semester IP");
        System.out.println("===================================================");
        System.out.println("===================================================");

        for (int i = 0; i < courseName.length; i++){
            System.out.print("Enter the grade for MK " + courseName[i] + ": ");
            grade[i] = sc.nextInt();

            if (grade[i] > 80 && grade[i] <= 100){
                letterGrade[i] = "A";
            } else if (grade [i]> 73 && grade[i] <= 80){
                letterGrade[i] = "B+";
            } else if (grade[i] > 65 && grade[i] <= 73){
                letterGrade[i] = "B";
            } else if (grade[i] > 60 && grade[i] <= 65){
                letterGrade[i] = "C+";
            } else if (grade[i] > 50 && grade[i] <= 60){
                letterGrade[i] = "C";
            } else if (grade[i] > 39 && grade[i] <= 50){
                letterGrade[i] = "D";
            } else if (grade[i] >= 0 && grade[i] <= 39){
                letterGrade[i] = "E";
            } else{
                System.out.println("Nilai tidak valid");
                letterGrade[i] = "Tidak Valid";
            } 

            if (letterGrade[i].equals("A")){
                nilaiSetara[i] = 4.0;
            } else if (letterGrade[i].equals("B+")){
                nilaiSetara[i] = 3.5;
            } else if (letterGrade[i].equals("B")){
                nilaiSetara[i] = 3.0;
            } else if (letterGrade[i].equals("C+")){
                nilaiSetara[i] = 2.5;
            } else if (letterGrade[i].equals("C")){
                nilaiSetara[i] = 2.0;
            } else if (letterGrade[i].equals("D")){
                nilaiSetara[i] = 1.0;
            } else if (letterGrade[i].equals("E")){
                nilaiSetara[i] = 0.0;
            } else{
                nilaiSetara[i] = 0.0;
            }
        }

        System.out.println("==================================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==================================================================================");

        System.out.printf("%-40s %10s %15s %10s\n", "Mata Kuliah", "Nilai", "Nilai Huruf", "Bobot SKS");
        System.out.println("==================================================================================");

        for (int i = 0; i < courseName.length; i++){
            System.out.printf("%-40s %10s %10s %12s\n",courseName[i], grade[i], letterGrade[i], nilaiSetara[i]);
        }

        System.out.println("==================================================================================");

        for (int i = 0; i < courseName.length; i++){
            totalNilai += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        ipSemester = totalNilai / totalSKS;
        System.out.println("IP Semester: " + ipSemester);
        
    }
}

