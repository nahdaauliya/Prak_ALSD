|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Labs 7
# Searching

## 7.2. Sequential Search Method

The solution is implemented in Students.java, SearchStudent.java, and MainStudent.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/5ffd2ecf-2277-4e4b-bd5a-9c9b0ba24734)

**Brief explanaton:** There are 5 Question: 
1.  If the displayData method is a method that displays student data that is being searched through the NIM. 
But displayPosition only displays the index of the student whose NIM is being searched.

2. The break statement immediately stops further iterations of the loop, as the desired result has already been found.

3. If the nim data entered is not sorted from smallest to largest value, then the program will not error and the output will remain the same. Because this program uses sequential search. Where this search does not depend on the sorted data. So when the match of the element has been found, it will immediately return the position of the matching element. 

4. Because if we set the position variable to 0 from the beginning, when the value we are looking for is not found, the program will be confusing. This is because the number 0 has 2 meanings:  Either the program does not find the value or the value is found at index 0 in the array. This confusion will cause misunderstanding

## 7.3. Binary Search Method

The solution is implemented in Student21.java, TopStudents21.java and Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/6db12260-ed09-4d53-a02b-07ac50384906)

**Brief explanaton:** There are 4 question: 
1.![Image](https://github.com/user-attachments/assets/4ca13319-2cf3-4322-b4d6-2e0bd6673f9b)

2. ![Image](https://github.com/user-attachments/assets/e64c88d2-e5ba-4061-b8b7-a820a0ef08ce)

3. The search results are incorrect because this program  uses the Binary Search method.
Binary Search only works if the data is sorted. Unlike Sequential Search which can search through random data, Binary Search divides the data into two parts and determines the search direction based on the order of the data. If we try to search for data in an unordered list, Binary Search will not be able to find the data correctly because this method relies on an ordered pattern.

![Image](https://github.com/user-attachments/assets/f3ab3d32-2f6b-4f4e-86f8-ab75bda3a350)

    The search result was not found. Because the data is not sorted from smallest to largest

![Image](https://github.com/user-attachments/assets/c46274bc-ee17-4c52-9570-3a4cc54cd625)

4. ![Image](https://github.com/user-attachments/assets/cf5e86a3-aebf-4821-8b66-65de3663b869)

![Image](https://github.com/user-attachments/assets/d40aef17-8be5-4878-a374-5e93bc22f388)


## 7.4. Review Devide and Conquer
The solution is implemented in MergeSort.java, SortMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/8d227fa8-9ed0-4008-80a7-413e852be618)

**Brief explanaton:** There are 0 question: 


## 7.5. Assignment

The solution is implemented in Lecturer21.java, LecturerData21.java, and LecturerDemo.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/a1f202bc-5ecb-40cf-b1f2-862468247325)

![Image](https://github.com/user-attachments/assets/3a26567f-2cf6-454e-8b09-389fc6bbd172)

**Brief explanaton:** 

1. In this assignment 
    There are 4 attributes:
    - id: String
    - name: String
    - gender: Boolean
    - age: int
2. Class Sructure:
    - Lecturer21 => Represents a lecturer with attributes: ID, Name, Gender, and Age.
    - LecturerData21 => Stores an Array of lecturers and provides methods to add, display, sort data, and search data
    - LecturerDemo => The main class that runs the menu-driven program and takes user input

3. The program flow
    1. User Input number of lecturera
    2. The program will displaying the Menu
    3. If the user choose option 1. The rogram will asks the user to input lecturers details
    4. If users choose option 2. Then, the program will prints all data of the lecturers
    5. If users choose option 3. Then, the program will sort in Ascending Order(Youngest to Oldest) by using Bubble Sort
    6. If users choose option 4. Then, the program will sort in Descending Order(Oldest to Youngest) by using Selection sort. \
    7. If the user chooses option 5. Then, the program will search for the lecturer's data by inputting the lecturer's name. Then the program will search for the lecturer's name using sequential search.
    8. If the users choose option 6. Then, the program will search for the lecturer's data by inputting the lecturer's age. Then the program will search for the lecturer's age using binary search
    9. If users choose option 5. Then, the program will display a message "Thank you for chooing our program". And then the program will be exit.
    