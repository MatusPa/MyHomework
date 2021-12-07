package home_work_1;

public class HomeWorkT6 {
    public static void main(String[] args) {
         int [] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
         int i = 0;
        String str = "";
        String num[];
        num = new String[10];
         while (i<10) {
             String s = Integer.toString(m[i]);
             num[i]= s;
             i++;
         }
            System.out.println("("+num[0]+num[1]+num[2]+")"+" "+num[3]+num[4]+num[5]+"-"+num[6]+num[7]+num[8]+num[9]);
    }
}
