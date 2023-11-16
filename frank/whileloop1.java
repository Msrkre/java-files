public class whileloop1{
public static void main(String[]args){
boolean flag = true;
int count = 0;

while (flag) {
    System.out.println("Count: " + count);
    count++;

    if (count == 5) {
        flag = false;
    }
}}}