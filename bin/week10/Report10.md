|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Jobsheet 10 
# Stack

## 2.1. Assignment Submission

The solution is implemented in Student21.java, StudentAssignmentStack21.java, and StudentDemo21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/09fe99d4-8e40-47d2-9db1-eb369532b477)

![Image](https://github.com/user-attachments/assets/e27605bf-7a67-4ee6-887f-6cc3fa62312e)

![Image](https://github.com/user-attachments/assets/76132e88-b0de-458c-9f17-d0c4414dbbcc)

**Brief explanaton:** There are 5 Question: 
1. Because in this program, if you think logically when students collect assignments, the last student to collect the assignment is the first to be assessed. That is what is called LIFO (Last In, First Out). And why not use queue or list? Because if we use a queue then the student who first collects the assignment will be assessed. I think this is more suitable for serving queues in buying and selling. In queue we use FIFO (First In, First Out). And if we use a list, the list is uncertain from where we can prioritize. For example, if we want to judge from the top, bottom or middle task, we can do it. So it's irregular.

2. Push is for adding stacks, while pop is for retrieving and deleting the topmost stack. In this program, push is used to add student data. Then, pop is used when the user enters the assignment value. So, after the user chooses case 2, namely grading the assignment, the program will take the topmost stack and give a nukau to the stack that was taken earlier.

3. The existence of !isFull is to check whether the element is full or not. If we don't use !isFull then there will be an ArrayIndexOutOfBoundsException. Because the stack will continue to grow without seeing whether the element is full or not.

4. There are 5. 
![Image](https://github.com/user-attachments/assets/b3624ca2-a8a0-4a9c-a798-70be2190e214)

5. ![Image](https://github.com/user-attachments/assets/2eb313c6-7ba1-45ba-83ae-1cb8636a4170)
I added a lihatTerbawah() method to display the students who submit their assignments first. By doing so, the program will first check whether the stack is empty or not. If not, it will return the stack in element 0. However, if the element is empty then the program will display a message that the stack is empty.

![Image](https://github.com/user-attachments/assets/d3953e25-50c9-492d-b631-62b4263ccf12)

And in the Main section I added in case 4. First, I will call the lihatTerbawah() method. Then it checks whether the element is null or not. If it is not null, the program will display the name of element 0.

6. ![Image](https://github.com/user-attachments/assets/478cc4c6-cffc-4d65-aaa7-843bf725e60a)

returns the number of elements on the stack and top is incremented by 1. Because the top index starts from 0.

![Image](https://github.com/user-attachments/assets/507339bb-45ec-4235-ac0c-61d0fd5b478f)

7. A stack is a data structure that works in a LIFO or Last In First Out manner. So all data elements are arranged sequentially. However, the arrangement is stacked so the one that enters first will come out last and vice versa. Just like when we put plates in a stack. 
Then there are several operations in the stack:
- Push
- Pop
- Peek
- IsEmpty
- IsFull
- Clear

Application:
When we are switching pages in the browser, the URL is stored in the stack. And when we click "Back" or the left arrow on the top left, the browser will retrieve the last address and display the previous page.

## 2.2 Convert Assignment Grade to Binary

The solution is implemented in Student21.java, StudentAssignmentStack21.java, ConversionStack21.java, and StudentDemo21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/94f3c035-6c7c-4cd5-a323-2a689ce8cea3)

**Brief explanaton:** There are 2 question: 
1. in the method there are 2 while. Where the first while serves to store the modulus of the grade into the stack. However, the way it works is by storing it from the last binary number forward. So in this method we need pop to take the binary numbers arranged in reverse so that the order becomes correct.

2. Actually the same result but if we use while(grade != 0), when the user enters a grade below zero or negative the program can still run. Because the true condition of the while is when the grade is not zero (0)

## 2.4 Assignment
The solution is implemented in ExcuseLetter21.java, ExcuseLetterStack21.java and ExcuseLetterDemo21.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/97a72e78-5a8e-49cf-904b-2ee7ebf0d811)

![Image](https://github.com/user-attachments/assets/76c77e59-496d-4406-9a5c-3dacc95ec44d)

![Image](https://github.com/user-attachments/assets/8fc8aeff-1a69-49b8-821a-abf98d01a72a)

