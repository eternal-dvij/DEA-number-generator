import java.util.*;
public class DEAnumberGenerator {
    public static void main(String[] args) {
        System.out.println("Enter the last name of prescriber: \n");
        Scanner inputobj = new Scanner(System.in);
        String lastname = inputobj.nextLine();
        char firstletteroflName = lastname.charAt(0);
        String dea = "B";
        dea = dea+Character.toUpperCase(firstletteroflName);
        ArrayList<Integer> s = new ArrayList<Integer>();
        for(int i =2;i<8;i++){
            Random rand = new Random();
            int t = rand.nextInt(9);
            s.add(t);
        }
        for(int i =0;i<s.size();i++){
            String x = (s.get(i)).toString();
            dea = dea+x;
        }
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i =0;i<s.size();i++){
            if(i%2==0){
                even.add(s.get(i));
            }
            else{
                odd.add(s.get(i));
            }
        }
        int sumeven = 0;
        for (int number : even){
            sumeven += number;
        }
        int sumodd = 0;
        for (int number : odd){
            sumodd += number;
        }
        int finalsum = sumeven+(sumodd*2);
        dea = dea+(finalsum%10);
        System.out.println(dea);
    }

}
