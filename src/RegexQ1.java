import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Name starting with n|N
public class RegexQ1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[n|N][a-z A-Z]*");
        Matcher m = p.matcher("Naman");
        int c=0;
        while (m.find()){
            System.out.println(m.start()+"---"+m.end()+"---"+m.group());
            c++;
        }
    }
}

// Name Ending with j|J

class RegexQ2{
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[a-z A-Z]*[j|J]");
        Matcher m1 = p1.matcher("Anuj");
        int c=0;
        while (m1.find()){
            System.out.println(m1.start()+"---"+m1.end()+"---"+m1.group());
            c++;
        }
    }
}

// Name Starting with n|N and j|J

class RegexQ3{
    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("[n|N][a-z A-Z]*[j|J]");
        Matcher m2 = p2.matcher("Nikunj");
        int c=0;
        while (m2.find()){
            System.out.println(m2.start()+"---"+m2.end()+"---"+m2.group());
            c++;
        }
    }
}

// check whether entered email is valid or invalid

class RegexQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p3 = Pattern.compile("\\w[a-z A-Z 0-9]+@gmail.com|@yahoo.com|@rediffmail.com");
        Matcher m3 = p3.matcher(sc.nextLine());
        int ctr=0;
        while (m3.find()){
            System.out.println(m3.start()+"---"+m3.end()+"---"+m3.group());
            ctr++;
        }
    }
}


