package week12;

public class AssignmentNode{
  Assignment data;
  AssignmentNode next;
  public AssignmentNode(){

  }

  public AssignmentNode(Assignment data, AssignmentNode next){
    this.data = data;
    this.next = next;
  }
}