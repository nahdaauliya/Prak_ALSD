|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Labs #Array Of Objects

## 1.2. Create, insert, and display Array of Objects

The solution is implemented in Rectangle.java and ArrayOfObject.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/0ccdb54a-da02-4b43-a3ed-605d93173bcd)

**Brief explanaton:** There are 5 Question: 
1. Yes, because if there OOP without attributes and methodes, then the object can't display the program well.
2. Rectangle class don't have a constructor. 
    Why we instantiate the object as follows? 
    In java in every class have a constructor. So if we don't create the default constructor manually, then it won't be a problem. But if we want to create parametric constructor, then we must create a default constructor manually.
3. Create array that has 3 elements and store the object in the rectangle class. 
4. Create a new object on Rectangle class and store it on index 1.  Then acsess the attribute length and width.
5. From me, this class separated because the code is easy to understand. So we can distinguish which class is responsible for logic, data structures and methods. And which class is responsible for running the program.

## 1.3. Input data into Array of Objects using Loops

The solution is implemented in Rectangle.java and ArrayOfObject.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/03ae295e-3dd7-4b00-83ab-59f58a6d2cb6)

![Image](https://github.com/user-attachments/assets/49c19c14-746f-4c1d-810a-4ba7fccf71fb)

**Brief explanaton:** There are 4 question: 
1. Yes, Array of Object can be implemented on 2D array
2. Because, 2D arrays are basically arrays within arrays. And each element in the array stores an object
3. Because, we haven't create Square object. 
    How to create? : squareArray[5] = new Square();
    We can put it before (squareArray[5].side = 20;)
4.  ![Image](https://github.com/user-attachments/assets/057afa6a-eece-475e-9171-05a2e06a8d2a)
5. We can duplicate it. But, it will overwrite previous references in the index that has been created. So, that makes the previous object that has been created will be lost.

## 1.4. Mathematical Operation in Array of Object's Attribute

The solution is implemented in ArrayBlocks.java and Blocks.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/af742c0e-fa06-46a0-b7bb-f0fffb9aa65f)

**Brief explanaton:** There are 7 main step: 
1. Yes, we can create more than one constructor in one class. This called constructor overloading. Constructor overloading is technique where a class has a multiple constructors with different parameters.  
2. ![Image](https://github.com/user-attachments/assets/4518e99a-4855-4299-bd71-a5e349a92da8)
3. ![Image](https://github.com/user-attachments/assets/0b99a0a9-df58-427b-856d-bedaa6903a29)
4. ![Image](https://github.com/user-attachments/assets/4db188a2-b4e4-4dc5-ba03-0a230f7d4e33) 
5. ![Image](https://github.com/user-attachments/assets/8d2db33c-4025-446e-84d7-01a2ee7cb3d2)

    Result:
        ![Image](https://github.com/user-attachments/assets/9fda486b-3aab-431b-9daa-29c2784b0f04)
        
## 2.4. Assignment 1 Solution

The solution is implemented in Lecturer21.java, LecturerData21.java, and LecturerDemo21.java , and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/aa3d7e83-2b4a-4e45-a628-fdcf48dbb589)

![Image](https://github.com/user-attachments/assets/de70d280-61c6-441d-bee1-64e4d69efaeb)

![Image](https://github.com/user-attachments/assets/d8163e32-0437-4758-b035-492a4ce8f34d)

![Image](https://github.com/user-attachments/assets/9c7568e3-b231-4ec0-8588-7d61e33f14d3)

**Brief explanaton:** 
1. In this assignment 
    There are 4 attributes:
    - idNumber
    - name
    - gender
    - age
    There are 4 methods:
    - showAllLecturerData(Lecturer[] lecturerArray)
    - countLecturerByGender(Lecturer[] lecturerArray)
    - averageLecturerAgeByGender(Lecturer[] lecturerArray)
    - showOldestLecturerInfo(Lecturer[] lecturerArray)
    - showYoungestLecturerInfo(Lecturer[] lecturerArray)
    There are 2 constructor:
    - Default constructor
    - Parameterized constructor
2. How this program work:
    1. Input Lecturer Data
    2. Display menu
        1. Show All Lecturer Data
            If the user choose 1 then the program will display all lecturers data 
        2. Count Lecturer by Gender
            If the user choose 2, then the program will count and display sum of male and female lecturers
        3. Average Lecturer Age by Gender
            If the user choose 3, then the program will count and display average age of lecturers by gender
        4. Show Oldest Lecturer Info 
            If the user choose 4, then the program will find and display the oldest lecturer
        5. Show Youngest Lecturer
            If the user choose 5, then the program will find and display the youngest lecturer
    3. Confirm to continue the program. 
        In this step the program will ask the user wheter the user wants to continue thia program or not.

