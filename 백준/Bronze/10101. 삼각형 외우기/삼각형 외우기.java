import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int i =0;
    int sum = 0;
    int angle =0;
    
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    angle = a+b+c;

    if(a == 60 && b == 60 && c == 60){
        System.out.println("Equilateral");
    }

    else if(angle  == 180 && (a == b || b==c || a==c)){
        System.out.println("Isosceles");
    }
    else if(angle  == 180 && (a != b || b!=c || a!=c)){
        System.out.println("Scalene");
    }

    else { System.out.println("Error");}
   
    }
}
    