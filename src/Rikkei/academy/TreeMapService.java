package Rikkei.academy;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap treeMap = new TreeMap<>();
        System.out.println("Điền vào một chuỗi: ");
        String string = sc.nextLine();
        String[] part = string.split(" ");
        for (int i = 0; i < part.length; i++) {
            if(!treeMap.containsKey(part[i].toUpperCase())){
                treeMap.put(part[i].toUpperCase(),1);
            } else {
                int oldValue = (int) treeMap.get(part[i].toUpperCase());
                treeMap.put(part[i].toUpperCase(),(oldValue+1));
            }
        }
        System.out.println(treeMap);
    }
}
