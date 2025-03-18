package p1;

public class MemberMain {
    static Member[] memberArray;
    public static void main(String[] args) {
        memberArray = new Member[3];

        memberArray[0] = new Member();
        System.out.println("Member 1");
        memberArray[0].nameMember = "Joong";
        memberArray[0].age = 17;
        memberArray[0].membershipFee = 10000;
        memberArray[0].workoutHours = 15;
        memberArray[0].print(memberArray);

        memberArray[1] = new Member("Archen", 60, 10000, 20);
        memberArray[1].print(memberArray);
        memberArray[2] = new Member("Natachai", 50, 1000, 4);
        memberArray[2].print(memberArray);
    }
}
