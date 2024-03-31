import java.sql.SQLOutput;

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        String str="hello";

        String str2=new String("GenShin Impact");

        char[] chars={'z','d','z'};
        String str3=new String(chars);

//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str2.length());//获取字符串长度
//        String str4=""; //长度为0的字符串
//        System.out.println(str4.isEmpty());
//        String str5=null;//
//
//        System.out.println(str2.charAt(1));
//        int index=str2.indexOf("mpa",5);
//        System.out.println(index);

//        int index=str2.lastIndexOf('i');
//        System.out.println(index);

//        String strInt=String.valueOf(123);
//        System.out.println(strInt);
//        //序列化
//        String str22=String.valueOf(new Student("zhangsan",999));
//        System.out.println(str22);

//        Integer a=Integer.parseInt("321");
//        Integer aa=Integer.valueOf("2222");
//        System.out.println(a);
//        System.out.println(aa);
//
//        Double dd=Double.parseDouble("32.111");
//        System.out.println(dd);

//        String s="Genshin%Impact%hello#bit%hello%bit#Kobe#byrant";
//        char[] chars1=s.toCharArray();
//        for (int i = 0; i < chars1.length; i++) {
//            System.out.println(chars1[i]);
//        }
//
//        String s2=new String(chars1);
//        System.out.println(s2);
//
//        String s3="hello";
//        System.out.println(s3.toUpperCase());
//        String s4="HELLO";
//        System.out.println(s4.toLowerCase());
//
//        String ssss1=String.format("%d-%d-%d",2019,9,14);
//        System.out.println(ssss1);

//        String ss=s.replace('n','J');
//        String ss=s.replace("mpact","jpppppppp");
//        String ss=s.replaceAll("n","Kobe");
//        String ss2=s.replaceFirst("n","JJ");
//        String ip="192.168.1.4";
//        String[] strings=ip.split("//.");
//        for(String x:strings){
//            System.out.println(x);
//        }

//        String[] strings=s.split("#");
//        for(String x:strings){
//            String[] sss=x.split("%");
//            for (String xx:sss) {
//                System.out.println(xx);
//            }
//        }
        String s="abcdefaaaa";
        String ret=s.substring(4,7);
        System.out.println(ret);

        String str123="           aa      bb ca  fff      ";
        String str33=str123.trim();
        System.out.println(str33);

        StringBuffer sb=new StringBuffer();
        sb.append("Genshin Impact");
        System.out.println(sb.reverse());

    }
}