import java.util.*;

class Keypad_Typing {
    public String printNumber(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='b' || ch=='c')sb.append(2);
            else if(ch=='d' || ch=='e' || ch=='f')sb.append(3);
            else if(ch=='g' || ch=='h' || ch=='i')sb.append(4);
            else if(ch=='j' || ch=='k' || ch=='l')sb.append(5);
            else if(ch=='m' || ch=='n' || ch=='o')sb.append(6);
            else if(ch=='p' || ch=='q' || ch=='r' || ch=='s')sb.append(7);
            else if(ch=='t' || ch=='u' || ch=='v')sb.append(8);
            else if(ch=='w' || ch=='x' || ch=='y' || ch=='z')sb.append(9);
        }
        return sb.toString();
    }
}