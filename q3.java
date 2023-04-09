import java.util.Scanner; 
public class q3 { 
 public static void main(String[] args) { 
 Scanner scn = new Scanner(System.in); 
 int n = scn.nextInt(); 
 int ans = 1; 
  for(int i = 2; i <= n; i++){ 
 ans *= i;   } 
 System.out.println(ans); 
 } 
}
