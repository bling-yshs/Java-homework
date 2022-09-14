import java.util.HashMap;
import java.util.Scanner;

public class j1017 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // create a HashMap <Srting,String>
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("WYS", "KXZSMR");
        map.put("CQ", "CHAIQIANG");
        map.put("LC", "DRAGONNET");
        // key "SYT" or"SSD" or "LSS" or "LYF",value="STUDYFATHER"
        map.put("SYT", "STUDYFATHER");
        map.put("SSD", "STUDYFATHER");
        map.put("LSS", "STUDYFATHER");
        map.put("LYF", "STUDYFATHER");

        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            str[i] = map.get(str[i]);
            if (str[i] == null) {
                str[i] = "DENOMINATOR";
            }
        }
        // output str
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        in.close();
    }
}