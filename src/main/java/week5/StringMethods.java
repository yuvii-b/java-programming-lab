package week5;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B (2024503541) | Week 5 | Question - String Methods\n");

        String s1="Welcome to Java";
        String s2=s1;
        String s3=new String("Welcome to Java");
        String s4=s1.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s4);
        System.out.println(s1.substring( 3));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("Hi".trim());
        s1.replace('o', 'O');
        s1.replaceAll("o", "O");
        s1.replaceFirst("o", "O");
        s1.split("O");
        s1.split("O", 4);
        System.out.println(s1.toCharArray());
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.contains("or"));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}

