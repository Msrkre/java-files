public class doloop2{
public static void main(String[]args){
int x = 0;
int y = 5;

do {
    System.out.println("x: " + x + ", y: " + y);
    x++;
    y--;
} while (x < 3 && y > 0);}}