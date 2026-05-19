
public class Ex2_Boolean {

    public static void main(String args[]) {

        int a = 10;
        String s[]=new String[5];
        s[0]="Rahul";
        s[1]=new String("Is");
        s[2]=s[0]+s[1];
        if (a > 0) // boolean expression required
        {
            System.out.println("Inside If");
        }

        boolean b = false;

        if (b) {
            System.out.println("Inside If");
        } else {
            System.out.println("Inside Else");
        }

    }
}

/*
Key Notes
---------
Java does NOT allow:

if(a) ❌

Must use boolean expression:

if(a > 0) ✔
 */