package HomeWork;

import java.util.LinkedList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> lnList = new LinkedList<>();
        Random rnd = new Random();
        int sum = 0;
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        lnList.add(rnd.nextInt(1,10));
        System.out.println(lnList);
        for (Integer sumItem : lnList) {
            sum+=sumItem;
        }
        System.out.println(sum);
    }
    
}
