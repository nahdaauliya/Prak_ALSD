package week10;

public class ExcuseLetterStack21{
  ExcuseLetter21[] stack;
  int top, size;

  public ExcuseLetterStack21(int size){
    this.size = size;
    top = -1;
    stack = new ExcuseLetter21[size];
  }
  
  public boolean isFull(){
    if (top == size -1){
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

  void push(ExcuseLetter21 excuse){
    if(!isFull()){
      top++;
      stack[top] = excuse;
    }else{
      System.out.println("Stack is already full!!");
    }
  }
  
  ExcuseLetter21 pop(){
    if(!isEmpty()){
      ExcuseLetter21 el = stack[top];
      top--;
      return el;
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  ExcuseLetter21 peek(){
    if(!isEmpty()){
      return stack[top];
    } else {
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  void print(){
    for (int i = 0; i <= top; i++){
      System.out.println(stack[i].id + "\t" + stack[i].name + "\t" + stack[i].className + "\t" + stack[i].typeOfExcuse + "\t" + stack[i].duration);
    }
    System.out.println("");
  }

  public int findSeqSearch(String search){
    int position = -1;
    for (int i = 0; i <= top; i++){
      if(stack[i].name.equalsIgnoreCase(search)){
        position = i;
        System.out.println("Excuse Letter from:");
        System.out.println("Name: "+ stack[i].name);
        System.out.println("NIM: "+ stack[i].id);
        System.out.println("Class: "+ stack[i].className);
        System.out.println("Type of Excuse Letter: "+ stack[i].typeOfExcuse);
        System.out.println("Duration of Excuse Letter: "+ stack[i].duration);
        System.out.println("--------------------------------------------------------------");
        break;
      }
    }
    return position;
  }

}