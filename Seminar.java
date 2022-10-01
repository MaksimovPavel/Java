import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/* 
public class seminar {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) 
                continue;
            
            System.out.println(i);
        }
    }
}
 // Задача 1
 import java.util.Scanner; 
 public class program {
     public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}

import java.util.Scanner;
import java.util.logging.Logger;

public class seminar
{
    public static void main(String[] args) 
    {
        Logger l = Logger.getAnonymousLogger();
        String str = "ab";
        l.info(concat(5,str));

    }
        
    private static String concat(int n, String string){
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}

import java.util.logging.Logger;
import java.util.Scanner;
public class seminar {
    public static void main(String[] args){
        Logger l = Logger.getAnonymousLogger();
    
        l.info(search("aB", "aaaBaAbbbB"));
    }
    private static String search (String jewels, String stones){
        int counter;
        StringBuilder sb = new StringBuilder();
        for(char c1: jewels.toCharArray()){
            counter = 0;
            for(char c2: stones.toCharArray()){
                if (c1 == c2){
                    counter++;
                }
                
            }
            sb.append(c1).append(counter);
        }
        return sb.toString();
    }
}


public class seminar {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});
        System.out.println(s1.equals(s5));
        System.out.println(s1 == s5);
    }
      
}

public class seminar {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(10);
        list.add(5);
        
        list.sort(Comparator.naturalOrder());


        System.out.println(list);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class seminar {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mercury");
        list.add("venues");
        list.add("earth");
        list.add("mars");
        list.add("venera");
        list.add("jupiter");
        list.add("mercury");
        list.add("venues");
        list.add("earth");
        list.add("mars");
        list.add("venera");
        list.add("jupiter");

        System.out.println(list);
        // Map<String,Long> fr = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));       
        // System.out.println(fr); 2 варик ниже:
        
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))){
                    count++;   
                }         
            }
        System.out.println(list.get(i) + " " + count );  
        }
        
    }
}
*/
/**
 * program
 */
/* 
import java.util.Scanner; 
public class program {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) 
                continue;
            
            System.out.println(i);
        }
    }
}

 // Задача 1
 import java.util.Scanner; 
 public class program {
     public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}

// Задача 2 Запросить имя, в зависимости от времени, вывести приветствие
import java.util.Scanner;
public class program {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
        System.out.println("Для выхода из программы введите - q");
        String c = scanner.nextLine();
        if (c == ("q")) {
            System.exit(0);
        }

    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}


public class program {
    public static void main(String[] args) {
        //var s = System.currentTimeMillis();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000; i++) {
            str += "+";
            //sb.append("+");
    }
    //System.out.println(System.currentTimeMillis() - s);
    System.out.println(str);
    System.out.println(sb);
    }
}
*/

