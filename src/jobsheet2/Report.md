|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Labs #2 Object

## 2.1. Declaring Classes, Attributes, and Methods

The solution is implemented in Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/9ae32688-15e5-4d72-95c1-739c68a79fbf)

**Brief explanaton:** There are 5 Question: 
1. Characteristic of Class is general. And characteristic object is specific.
2. There are 4 attribute: Student ID, Name, Class Name, GPA
3. There are 4 methods: print(), changeClass(String newClass), updateGPA(double newGPA), evaluate().
4. ![Image](https://github.com/user-attachments/assets/ad284e6b-ddb0-4507-b3d5-d7c5037612b2)
5. evaluate() methods determines a student's performance based on their GPA.
    - If student's GPA is 3.5 or higher then the method returns "Excellent".
    - If student's GPA is 3.0 but less than 3.5 then the method returns "Good".
    - If student's GPA is 2.0 but less than 3.0 then the method returns "Fair".
    - If student's GPA is below 2.0 then the method returns "Poor".

## 2.2. Object Instantiation and Accessing Attributes and Methods

The solution is implemented in StudentMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/1add324c-7aed-41c9-b901-e3099718f21e)

**Brief explanaton:** There are 4 question: 
1. ![Image](https://github.com/user-attachments/assets/e106b112-435d-4a96-8acf-75cf8c9d251a)
    Name of the ceated object is student1
2. First, we create the object. After creating object, then we can access its attribute as well as calling its method
    - Accessing attribute: objectName.attributeName = value;
        example: student1.studentID= "244107020042";
    - Accessing method: objectName.methodName();
        example: student1.print();
3. The output between first and second differs because the object's attributes change between the two method calls.

## 2.3. Creating Constructor

The solution is implemented in StudentMain.java and Student21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/955587c2-0766-4fa7-8594-8dcd1a330532)

**Brief explanaton:** There are 7 main step: 
1. ![Image](https://github.com/user-attachments/assets/1d1008ce-217b-4ce5-b26c-3a4777e917bc)
2.  Student21 student2 = new Student21("244107020040", "Archen", "TI-1I", 3.5);
    Calls the parameterixed constructor of Student21. 
3. ![Image](https://github.com/user-attachments/assets/2a716d24-cf60-4df2-bf66-a4ef42dd1d74)
    In StudentMain class there error on the code
    ![Image](https://github.com/user-attachments/assets/ac42e175-6207-456e-b304-3b6ec0133bb6)
    And in the Student21 class can't run the program because, there Parametric Constructor. If there parametris constructor then must manually input the default constructor.
4. No, the methods in the Student21 class don't need to be accessed in order after an object is instantiated. Because in java methods execute only when wxplicity called. Methods are not automatically executes just because ther're in the class. 
5. ![Image](https://github.com/user-attachments/assets/6a86fe94-c7ad-49a5-ac78-8293a617bd94)

## 2.4. Assignment 1 Solution

The solution is implemented in Course21.java and CourseMain21.java , and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/da82fe7b-b285-4072-b575-4b3f99b7dc89)

**Brief explanaton:** 
1. In this assignment 
    There are 4 attributes:
    - courseID
    - name
    - credit
    - hour
    There are 4 methods:
    - print()
    - changeCredit(int newCredit)
    - addHour(int hour)
    - reduceHour(int hour)
    There are 2 constructor:
    - Default constructor
    - Parameterized constructor
2. How this program work:
    1. Execution of main() on CourseMain21
    2. Course1
        - Creat object course1 with default constructor
    3. Course2
        - Creat object course2 and input all attributes manually
        - Calls print() for course2
        - Calls addHour for course2
    4. Modifies the attributes courses and prints the updates.

## 2.5. Assignment 2 Solution

The solution is implemented in Lecturer21.java and LecturerMain21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/18577948-5524-4e75-affb-515b28d596aa)

**Brief explanaton:** 
1. In this assignment 
    There are 4 attributes:
    - lecturerID
    - name
    - status
    - startYear
    - expertiseField
    There are 4 methods:
    - print()
    - setStatus(boolean status)
    - calculateTenure(int yearNow)
    - changeExpertiseField(String newField)
    There are 2 constructor:
    - Default constructor
    - Parameterized constructor
2. How this program work:
    1. Execution main() on LecturerMain21
    2. Lecturer1
        - Create object Lecturer1 with default constructo
    3. Lecturer2
        - Create object Lecturer2 and input the attributes manually
        - Calls print() for Lecturer2
        - Calls calculateTenure for Lecturer2
    4. Lecturer3
        - Create object Lecturer3 with parameter constructor
        - Calls print() for Lecturer3
        - Calls calculateTenure() for Lecturer3
