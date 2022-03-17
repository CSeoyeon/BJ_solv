public class Main {
    public static void main(String[] args) {
       boolean[] check = new boolean[10001];

       for(int i=1; i< 10001; i++){
            int number = self(i);
            if(number<10001){check[number] = true;}
       }

       for(int j=1; j<10001; j++){
           if(check[j] == false){System.out.println(j);}
       }

    }

    public static int self(int num){
        int sum = num; 

        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }

}