|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020042|
| Nama |  Nahda Auliya Raudhatunnisa |
| Kelas | TI - 1I |
| Repository | https://github.com/nahdaauliya/ALSD.git |

# Jobsheet 10 
# Stack

## 2.1. Experiment 1 : Queue Basic Operations

The solution is implemented in Queue.java dan QueueMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/c19230eb-6003-42ce-96f7-4bbb1a7f1d31)

![Image](https://github.com/user-attachments/assets/68343834-ede2-4e1c-99c2-dafb1f6427d3)

**Brief explanaton:** There are 5 Question: 
1. front and rear start at -1 to indicate that the element is still empty. And size is to show the number of elements in the current queue. So if the queue is added or enqueue then the size will increase by one. 

2. The code is to check if the rear has reached the last index.

3. The code is to check if the front has reached the last index. If so, the front value will be set back to the beginning of the array.

4. If we retrieve or process data that has already been input. Then the index is now empty. And if we start a print through index 0 then the data that we have previously dequeued will be printed again.

5. To proceed to the next index for printing 
6. 

7. ![Image](https://github.com/user-attachments/assets/46e7bcec-dc6e-4e15-a5d4-53768fb90bb6)

![Image](https://github.com/user-attachments/assets/daa51d86-6c8a-4bab-a459-90fe1699ebc5)


## 2.2 Academic Service Queue

The solution is implemented in Student.java, StudentQueue.java, and StudentQueueMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/22d532cd-c76f-44f6-a921-1cf6c97faaeb)

![Image](https://github.com/user-attachments/assets/26e3c216-b5f2-4d60-8ecb-e01259b1926d)

![Image](https://github.com/user-attachments/assets/eec706ee-ae0d-416b-b48e-15fff8b16c38)

![Image](https://github.com/user-attachments/assets/47d62cac-7147-44e0-8990-17fae2372aa5)

![Image](https://github.com/user-attachments/assets/70c97266-bd68-4ba4-b0cc-81f61932e698)

**Brief explanaton:** There are 2 question: 
1. The difference is that in Experiment 1 the data managed is data in integer form only. And the data that is managed using queues in experiment 2 is data that is in an object. 

2. 
    - In this code (rear = (rear+1)%max;) uses a pure circular queue unlike in experiment 1. In experiment 1 it uses if-else.

    - In experiment 2, we do not reset the front value because we have set the front value = 0 from the beginning.

3. - Experiment 1
        Why does the front in the queue have a value of -1? Because it indicates that the queue is still empty. But every time we enqueue for the first time we have to set front = 0 first.
    - Experiment 2
        Why does the front in the queue have a value of 0? Because it is ready to use. So, the front will always be at index 0. And we don't need to set the front on every first enqueue.

4. ![Image](https://github.com/user-attachments/assets/cdc20d30-7be4-49bf-9e4b-f1967dd24faf)

![Image](https://github.com/user-attachments/assets/44700880-d75b-4ad4-ae88-21e4b59f8741)

## 2.3 Assignment
The solution is implemented in Assignment.java, AssignmentQueue.java and AssignmentQueueMain.java, and below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/a0546014-96a1-4463-b900-c9118fdd128b)

![Image](https://github.com/user-attachments/assets/cebce6e3-6ed8-4e6b-ad7a-a0bd974f1490)

![Image](https://github.com/user-attachments/assets/7a454f0c-1d1c-4123-ba26-12ec811dadc1)

![Image](https://github.com/user-attachments/assets/f7b5f9c6-df3c-4af7-8e6f-4f7c4eae2ffd)

![Image](https://github.com/user-attachments/assets/56b04c5a-7195-4ab2-b8f0-88497104bbf2)