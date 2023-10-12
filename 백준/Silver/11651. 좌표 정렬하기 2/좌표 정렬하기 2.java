import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point o){
        if(this.y == o.y){
            return this.x - o.x;
        }
        else return this.y- o.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //array init
        ArrayList<Point> array = new ArrayList<>();
        for(int i =0; i<num; i++){
            array.add(new Point(scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(array);

        for(Point a : array){
            System.out.print(a.x + " " + a.y);
            System.out.println();
        }
    }
}
