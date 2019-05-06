import java.util.Scanner;
public class Seach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []students = {"duy","lan","huy","dat","tuan"};
        System.out.println("Enter names student : ");
        String names;
        names = scanner.nextLine();
        boolean ckeck = false;
        for (int i =0;i<students.length;i++){
            if (students[i].equals(names)){
                System.out.println("Vi tri cua sinh vien "+ names + " la "+ (i+1));
                ckeck = true;
                break;
            }
        }
        if (!ckeck){
            System.out.println("sinh vien khong thuoc trong lop");
        }
    }
}
