import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws IOException{
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
    
    System.out.println(simpleDateFormat.format(date));
}
}
    