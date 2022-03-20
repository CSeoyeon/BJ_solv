import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int count = 0;

        for(int i =0; i< c; i++){
            String word = scanner.next();
            boolean[] check = new boolean[26];
            boolean marking = true;

            for(int j= 0; j<word.length(); j++){
                //문자 사용 확인: 사용한 이력 있음
                if(check[word.charAt(j)-'a']){
                    //이전 문자와 연속 확인
                    if(word.charAt(j-1) != word.charAt(j)){
                        //연속되지 않음 
                        marking = false;
                        break;
                    }
                } 
                else{
                    check[word.charAt(j)-'a'] = true;}
            }
            if(marking == true){count+=1;}
        }
      
        System.out.println(count);
        scanner.close();
    }
    
}