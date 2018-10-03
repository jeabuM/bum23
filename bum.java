import java.util.Scanner;
class bum {
static Scanner sc = new Scanner(System.in);
static Scanner se = new Scanner(System.in);
public static void getData(int[] id,String[] name) {
  for(int i = 1; i <= 5; i++){
  System.out.print("Enter Minister ID : ");
  id[i] = sc.nextInt();
  

  System.out.print("Enter Minister Name : ");
  name[i] = se.nextLine();
  System.out.println();
  }
  }

public static void getVote(int[] vote,String [] name) {
for(int i = 1; i <= 200; i++){
System.out.print("Vote ID : ");
vote[i] = sc.nextInt();
int k = vote[i];
System.out.println("Name "+name[k]);
System.out.println("");
}
}
public static void countVote(int[] count,int[] vote) {
for (int i = 1; i <= 200; i++){
count[vote[i]]++;
}
}
public static int findMax(int[] count) {
int max = 1;
for (int i = 2; i <= 200; i++) {
if (count[i] > count[max]) {
max = i;
}
}
return max;
}
public static void main(String[] args) {

int[] id = new int[6];
String[] name = new String[6
	];
int[] vote = new int[201];
int[] count = new int[201];
getData(id,name);
getVote(vote,name);
countVote(count,vote);
int max = findMax(count);
System.out.println("The winner: " + name[max]+"  Score is "+count[max]);
}
}
