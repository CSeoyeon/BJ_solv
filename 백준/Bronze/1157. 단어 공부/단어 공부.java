import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toUpperCase();
        scanner.close();

        int[] array = new int[26];

        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i)-'A';
            array[num]++;
        }

        int max = 0;
        char mn = '?';
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
                mn =(char)(i+'A');
            }
            else if(max == array[i]){
                mn = '?';
            }
        }
        System.out.println(mn);
    }
}