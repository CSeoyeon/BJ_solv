import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] wdic = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        scanner.close();

        for(int i =0; i<wdic.length; i++){
            // boolean contains() -> 문자열 포함 확인, 대소문자 구분 
            if(word.contains(wdic[i])){
                word = word.replace(wdic[i],"1");
            }
        }
        System.out.println(word.length());
    }
}