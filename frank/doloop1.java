public class doloop1{
public static void main(String[]args){
boolean flag = true;
int count = 0;

do {
    System.out.println("Count: " + count);
    count++;

    if (count == 5) {
        flag = false;
    }
} while (flag);}}