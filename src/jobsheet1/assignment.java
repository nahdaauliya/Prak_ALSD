package jobsheet1;

import java.util.Scanner;
public class assignment {
    static char [] code = {'A','B','C','D','E','F','G','H','L','N', 'T'};
    static char[][] city = {{'B','A','N','T','E','N',},
                     { 'J','A','K','A','R','T','A'},
                     {'B','A','N','D','U','N','G'},
                     {'C','I','R','E','B','O','N'},
                     {'B','O','G','O','R'},
                     {'P','E','K','A','L','O','N','G','A','N'},
                     {'S','E','M','A','R','A','N','G'},
                     {'S','U','R','A','B','A','Y','A'},
                     {'M','A','L','A','N','G'},
                     {'T','E','G','A','L'}};
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the code of the city: ");
        char input = sc.next().charAt(0);

        boolean found = false;
        for(int i = 0; i < code.length; i++){
            if (code[i] == input){
                System.out.print("City: ");
                for(char plateCode : city[i]){
                    System.out.print(plateCode);
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("City not found");
        }
        sc.close();
    }

}