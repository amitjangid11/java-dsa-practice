package module_08_basics;

import java.util.Scanner;

public class CharDataType_15 {
    public static void main(String[] args) {
        // char :-
        //  Special character : ! @ # $ % ^ & *( )
        // small alphabet char :  a b c d e f g h i j k l m n ...
        // Big alphabet char :  A B C D E F G H I J K L M N ...
        // Integer :  0 1 2 3 4 5 6 7 8 9
        // Total - 128 character
        char ch = 'A';
        System.out.print("ASCII value of 'A' is : " + (int)ch+"\n");

        // Taking character Input
        Scanner sc = new Scanner(System.in);
        char new_Ch = sc.next().charAt(0);
        System.out.println(new_Ch);

    }
}
