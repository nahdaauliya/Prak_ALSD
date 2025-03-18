|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Labs 5
# Brute Force and Divide Conquer

## 5.2. Calculating Factorial Using Brute Force and Divide and Conquer Algrithms

The solution is implemented in Faktorial.java and MainFaktorial.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/2a7ea9d0-b938-4732-8bfb-f60109099d9f)

**Brief explanaton:** There are 5 Question: 
1.  If: This is the base case. For stoping the recrusive and  directly return the value. 
    else: This is the recrusive case. The else block handles the recrusive step where the problem is divide into smaller subproblems.
2. Yes, it is possible to modify the loop in the factorialBF() method using an alternative to the for loop. For example 
    1. while loop = a while loop can be used to iterate as long as a condition is true. 
        ![Image](https://github.com/user-attachments/assets/8a8d6363-d37e-4ef3-a0fb-1e78b0e85104)
    2. do-while loop = A do-while loop is similar to the while loop, except that it guarantees at least one iteration, even if the condition is false at start.
        ![Image](https://github.com/user-attachments/assets/8a2c2d1a-4cca-43a5-8503-885234f40731)
   
3. - facto = facto * i;
        Each iteration, the facto value will be multiplied by the value of i.
    - facto = n * factorialDC(n-1);
        this is recrusivemethod when the method calls itself. So, if n has not reached 1, then this method will call itself with the parameter n-1. If n has reached 1, then return 1.
4. - factorialBF()
        - Usses a for loop to iterate from 1 to n
        - Each iteration meltiplies the current result by the loop index.
        - The process is straightforward and efficient for small to medium-sized inputs.
        - It follows an iterative approach, which typically consumes less memory since it doesn't involve repeated function calls.
    - factorialDC()
        - Uses recrusion, where the methood calls itself with n-1 until reaching the base case n == 1.
        - This approach is more concise and elegant. 
        - Recrusive methods tend to have higher memory consumption because each recrusive call stores data in the call stack. 

## 5.3. Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in Power.java and PowerMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/3c814067-a433-4dd0-a0aa-cb5bbc01eb3c)

**Brief explanaton:** There are 4 question: 
1. powerBF() = Uses a for loop that iterates e times. And on each iteration, the result is multiplied by n.
    powerDC() = Splits the problem into smaller parts (e/2) and multiplies result
2. Yes, the combine stage exist in the provided code
    ![Image](https://github.com/user-attachments/assets/56dc3044-6942-4e72-8397-3dbfb7adee74)

    ![Image](https://github.com/user-attachments/assets/ec0b35d8-5d68-40d2-921e-e97c0f3aefb5)
3. Yes, The powerBF() method can be implemented without parameters since the Power class already has baseNumber and exponent attributes. 
![Image](https://github.com/user-attachments/assets/f91171d7-a94c-4b3d-88a7-5087d886bfd6)


4.  - powerBF() = this method using loop for count power result manually. And loop will repeat an exponent number of times.
    example: the user input the base number is 2 and exponent number is 3. Then this will loop 3 times
        - Iteration 1: result = 1 x 2= 2
        - Iteration 2: result = 2 x 2 = 4
        - Iteration 3: result = 3 x 2 = 6

    - powerDC() = this method using recrusion with Devde and Conquer technic
        So, if the power == 1, then will directly return to base case. 
        If the power is odd number then 
                n,e = (n, e/2) x (n, e/2) x n
        If the power is even number then 
                n,e =  (n, e/2) x (n, e/2)

## 5.4. Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in Sum.java and SumMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/3f7c6930-2950-4d36-8594-ae6007d73702)

**Brief explanaton:** There are 5 question: 
1. Because mid variable helps to split the array into two halves. 
2.  - double lsum = totalDC(arr,l,mid);
        This line recrusively calls the totalDC() method to calculate the sum of the left half of the array. This step computes the sum of elements from index 1 to mid.
    -  double rsum = totalDC(arr, mid + 1, r);
        This line recrusively calls the totalDC() method to calculate the sum of the right half of the array. This step computes the sum of elements from index mid+1 to r.
3. Because return lsum + rsum is combines result from the left half and the right half.
4. if (l == r){
            return arr[l];
        }

        this the base case of totalDC() method
5.  - ![Image](https://github.com/user-attachments/assets/2a34d5cb-df02-420c-813d-42806aa7ea1a)
        This step is devide. In this step the array is split into two halves by finding the middle index
    - ![Image](https://github.com/user-attachments/assets/deedc8c5-1682-460a-8a29-87bb7974112f)
        This step is conquer. In this step the method is called recursively on both halves to calculate their respective sums.
    - ![Image](https://github.com/user-attachments/assets/bce83c6f-b6d2-4137-9e53-991a58747aa2)
        This step is combine. In this step the two result are added together to form the total sum. 
    - ![Image](https://github.com/user-attachments/assets/4632ec16-cfb3-494f-a48f-53ac3803e386)
        And the last step is base case. In this step the recursion will stops when the array reaches its smallest part. 

        
## 5.5. Assignment 1 Solution

The solution is implemented in Lecturer21.java, AssignmentData.java, AssignmentData.java, and Assignmentt.java , and below is screenshot of the result.
![Image](https://github.com/user-attachments/assets/d7c1cd65-b155-407d-aeb4-ee88a1205a4d)

![Image](https://github.com/user-attachments/assets/9dee0b53-00d3-45b0-815b-b4d76e1af2d7)

![Image](https://github.com/user-attachments/assets/4787e49d-2dfd-43b3-a129-d73302d4874e)

**Brief explanaton:** 
1. In this assignment 
    There are 4 attributes:
    - name
    - studentID
    - yearOfAdmission
    - midtermScore
    - finalScore
    There are 4 methods:
    - showAllData(Assignmentt[] assignmentArray)
    - Assignmentt findMax (Assignmentt[] assignmentArray, int left, int right)
    - Assignmentt findMin (Assignmentt[] assignmentArray, int left, int right)
    - double calculateAverageFinalScore(Assignmentt[] data)
    There are 2 constructor:
    - Default constructor
    - Parameterized constructor
2. How this program work:
    1. Input Student Data
    2. Display menu
        1. Show All Lecturer Data
            If the user choose 1 then the program will display all lecturers data 
        2. Find The Highest Midterm Score(UTS) Using the Devide and Conquer Approach
            If the user choose 2, then the program will Find The Highest Midterm Score(UTS) Using the Devide and Conquer Approach and display it
        3. Find The Lowest Midterm Score(UTS) Using the Devide and Conquer Approach
            If the user choose 3, then the program will Find The Lowest Midterm Score(UTS) Using the Devide and Conquer Approach and display it
        4. Calculate The Average Final Score(UAS) Of All Students Using The Brute Force Approach
            If the user choose 4, then the program will Calculate The Average Final Score(UAS) Of All Students Using The Brute Force Approach and display it. 
    3. Confirm to continue the program. 
        In this step the program will ask the user wheter the user wants to continue this program or not.

