import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bataille {
    public static void main(String[] args){

        List<Integer> intergerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        boolean aboveFiveList = intergerList.stream().anyMatch(nbrList -> nbrList >15);

        if (aboveFiveList){
            System.out.println(" la condition est vraie");
        } else {
            System.out.println(" la condition est fausse");
        }

        List <Integer> bdxList = intergerList.stream().filter(nbrList -> nbrList >4).collect(Collectors.toList());

        System.out.println(bdxList);

        List<Integer> belowFiveList = new ArrayList<Integer>();

        for (Integer newList: intergerList){
            if (newList > 2 && newList <9){
                belowFiveList.add(newList);
            }
        }


        System.out.println(belowFiveList);
        System.out.println(aboveFiveList);


    }
}
