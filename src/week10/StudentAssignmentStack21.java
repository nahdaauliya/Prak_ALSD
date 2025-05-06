package week10;

public class StudentAssignmentStack21{
  Student21[] stack;
  int top,size;

  public StudentAssignmentStack21(int size){
    this.size = size;
    top = -1;
    stack = new Student21[size];
  }

  public boolean isFull(){
    if (top == size-1){
      return true;
    }else{
      return false;
    }  
  }

  public boolean isEmpty(){
    if (top == -1){
      return true;
    }else{
      return false;
    }
  }

  void push(Student21 std){
    if(!isFull()){
      top++;
      stack[top] = std;
    }else{
      System.out.println("Stack is already full!!");
    }
  }

  Student21 pop(){
    if(!isEmpty()){
      Student21 std = stack[top];
      top--;
      return std;
    } else{
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  Student21 peek(){
    if(!isEmpty()){
      return stack[top];
    }else{
    System.out.println("There is no data in Stack!!");
    return null;
    }
  }
  void print(){
    for(int i=0; i<=top; i++){
      System.out.println(stack[i].nim + "\t" +stack[i].name + "\t" + stack[i].className);
    }
    System.out.println("");
  }

  Student21 lihatTerbawah(){
    if (!isEmpty()){
      return stack[0];
    }else{
      System.out.println("Tidak ada stack yang tersimpan!!");
      return null;
    }
  }

  int hitungTugas(){
    return top +1;
  }

  String convertToBinary(int grade){
    ConversionStack21 stack = new ConversionStack21();
    while (grade > 0){
      int mod =  grade % 2;
      stack.push(mod);
      grade = grade/2;
    }
    String binary = "";
    while (!stack.isEmpty()){
      binary += stack.pop();
    }
    return binary;
  }

  
}