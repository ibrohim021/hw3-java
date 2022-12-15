
// 1. Пусть дан произвольный список целых чисел,
// удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex1{
    
    public static void main(String[] args) {
        sortList();
    }
    static void sortList(){

        List <Integer> number=new ArrayList <Integer>();
     
        number.add(11);
        number.add(45);
        number.add(12);
        number.add(32);
        number.add(36);
     
        System.out.println("Перебираемый List: "+number);
     
        for (int i=0;i<number.size();i++){      
            int even=number.get(i)%2;       
             if (even==0){
                 System.out.println("Четное число:"+ number.get(i));
                 number.remove(i);
             }    
         }
     
         Collections.sort(number);
         System.out.println("Отсортированный List: "+number);
     
      }
    
}