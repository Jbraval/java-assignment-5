import java.util.Scanner; 
public class q8 { 
 public static void main(String[] args) { 
 Scanner scn = new Scanner(System.in); 
 int x1; 
 int x2; 
 int x3; 
 int number=3; 
 int banner=0; 
 x1 = scn.nextInt(); //denoting length of pattern 
 int d= x1; 
 for(x2=1;x2<= x1; x2++){ 
 for(int e=1;e<=d;e++){ 
 System.out.print(" "); 
 } 
 if(x2==1){//1st line 
 System.out.print("2"); 
 } 
 else{//other lines 
 for(x3=0; x3!= x2;){ 
 banner=0; 
 for (int k=2;k<number;k++){ if((number%k)==0) 
 banner=1; //not prime 
 } 
 if(banner==0){ //prime 
 x3++; 
 System.out.print(number + " "); 
 } 
 number++; 
 } 
 } 
 System.out.println(); //move to next line 
 d--; 
 } 
 } 
} 
