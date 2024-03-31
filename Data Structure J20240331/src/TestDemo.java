import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestDemo {




    public static List<Character> func(String str1,String str2){
        List<Character>list=new ArrayList<>();
        for (int i = 0; i < str1.length();i++) {
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"")){
                list.add(ch);
            }

        }
        return list;
    }

        public static void main (String[]args){
            System.out.println(func("Welcome to cvte", "come"));
        }
//        public static void main11 (String[]args){
            ArrayList<Integer> arrayList = new ArrayList<>();
//            arrayList.add(1);
//            arrayList.add(2);
//
//            Iterator iterator = arrayList.iterator();
//        }


}
