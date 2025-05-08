import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());

       HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if(word.length() >= m){
                map.put(word, map.getOrDefault(word, 0)+1);
            }
        }


        //hashmap has not sequence. first, put on the List.
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        //entry can be use key and value at the same time.
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer>o2){
                if(Integer.compare(o1.getValue(), o2.getValue()) != 0){
                    return o2.getValue()-o1.getValue();
                }
               if(o1.getKey().length() != o2.getKey().length()){
                    return  o2.getKey().length()- o1.getKey().length();
                }
                return o1.getKey().compareTo(o2.getKey());
            }

        });


        for (Map.Entry<String, Integer> entry : list){
            bw.write(entry.getKey() +"\n");
        }

        bw.flush();

    }

}



