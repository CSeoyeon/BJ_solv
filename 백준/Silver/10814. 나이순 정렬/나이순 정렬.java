import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Person implements Comparable<Person>{
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int compareTo(Person o){
        return this.age - o.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Person> array = new ArrayList<>();
        for(int i =0; i<num; i++){
            array.add(new Person(scanner.nextInt(), scanner.nextLine()));
        }

        Collections.sort(array);

        for(Person x : array){
            System.out.print(x.age + x.name);
            System.out.println();
        }


    }
}
