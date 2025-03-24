|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Labs 6
# Bubble, Selectionx, and Insertion Sort

## 6.2. Implementing Sorting Using Objects

The solution is implemented in Sorting21.java, and SortingMain21.java, and below is screenshot of the result.
- **A**
![Image](https://github.com/user-attachments/assets/b85b3a64-b866-49ff-ba6b-0cd805ae4af9)
- **B**
![Image](https://github.com/user-attachments/assets/2b63f503-e880-49a2-a6f9-2d0efbd8d4d6)
- **C**
![Image](https://github.com/user-attachments/assets/b355c57a-8135-4039-8e06-61a347c203be)

**Brief explanaton:** There are 5 Question: 
1.  ![Image](https://github.com/user-attachments/assets/b15a6877-1b72-4320-a530-f16a9f76c0fe)

This code serves to swap elements in the array if they have a larger value than the element after them. If this condition is met, the two elements will be swapped so that the smaller value moves to the earlier position, making the array more sorted.

2. ![Image](https://github.com/user-attachments/assets/259b6992-ae28-44ab-9ee7-3101a6e458ac)
    **Answer:**
    ![Image](https://github.com/user-attachments/assets/7c8b72a4-046b-4d2c-9c15-5ad70202bbef)
3. ![Image](https://github.com/user-attachments/assets/55e3cf3e-55be-4028-9a20-51614490af25)

    So in this code we check the conditions whether j is more than equal to 0 and whether the data element [j] is more than the key. And if these two conditions are met then the data element[j] will be shifted to the right and make room for the key to be inserted in the correct position.
4. ![Image](https://github.com/user-attachments/assets/e9ddeb32-2c36-4ff8-9088-93b03a72d1d0)

    This command serves to shift elements to the right in Insertion Sort.

## 6.3. Sorting Using an Array of Objects

The solution is implemented in Student21.java, TopStudents21.java and Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/3c814067-a433-4dd0-a0aa-cb5bbc01eb3c)

**Brief explanaton:** There are 2 question: 
1. ![Image](https://github.com/user-attachments/assets/bbe0f583-ab70-4904-9d26-1d5e9de5e7ba)
    - Since Bubble Sort requires n - 1 iterations to sort n elements.
    - Since each outer iteration (i) will put the largest element into the correct position, the last part does not need to be compared again.
    - The i loop will be executes 49 timens. And, Bubble sort will be performs 49 stages too.
2. ![Image](https://github.com/user-attachments/assets/67fc0527-ef75-4c17-aa71-582b7f47eab8)

## 6.3.5 Sorting Student Data Based on GPA(Selection Sort)
The solution is implemented in Student21.java, TopStudents21.java and Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/62f831bb-ac75-45c4-a334-af85c5429f35)

**Brief explanaton:** There are 1 question: 
1. This code is part of Selection Sort which functions to find the index of the element with the smallest GPA in the unsorted part of the array. After the index is found, this element will be swapped with the element in position i, so the data will be sorted from smallest to largest GPA.
        
## 6.3.10 Sorting Student Data Based on GPA Using Insertion Sort

The solution is implemented in Student21.java, TopStudents21.java and Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/115e2cfb-0858-47da-9c9b-90d5381d5f35)

**Brief explanaton:** 

1. ![Image](https://github.com/user-attachments/assets/7cbfe222-745c-4811-acbb-583cd6e1ed81)

## 6.4. Assignment

The solution is implemented in Lecturer21.java, LecturerData21.java, and LecturerDemo.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/1194c922-d4e8-4552-8779-9bf1c9de1388)

![Image](https://github.com/user-attachments/assets/4b5c223d-a577-49e1-92ec-d7ea2d715dab)

![Image](https://github.com/user-attachments/assets/9f1ae0bc-ff36-4a91-ae2e-ec2679cb9d30)

**Brief explanaton:** 

1. In this assignment 
    There are 4 attributes:
    - id: String
    - name: String
    - gender: Boolean
    - age: int
2. Class Sructure:
    - Lecturer21 => Represents a lecturer with attributes: ID, Name, Gender, and Age.
    - LecturerData21 => Stores an Array of lecturers and provides methods to add, display and, sort data
    - LecturerDemo => The main class that runs the menu-driven program and takes user input

3. The program flow
    1. User Input number of lecturera
    2. The program will displaying the Menu
    3. If the user choose option 1. The rogram will asks the user to input lecturers details
    4. If users choose option 2. Then, the program will prints all data of the lecturers
    5. If users choose option 3. Then, the program will sort in Ascending Order(Youngest to Oldest) by using Bubble Sort
    6. If users choose option 4. Then, the program will sort in Descending Order(Oldest to Youngest) by using Selection sort. 
    7. If users choose option 5. Then, the program will display a message "Thank you for chooing our program". And then the program will be exit.