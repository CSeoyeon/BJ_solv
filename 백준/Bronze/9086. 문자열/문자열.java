import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for(int i= 0; i<t; i++){
            String s = bufferedReader.readLine();
            char[] array = s.toCharArray();
            System.out.println(array[0]+String.valueOf(array[s.length()-1]));
        }

    }

}