import java.util.*;

public class LuckNum {
    public String getNum() {
        StringBuffer strbuf = new StringBuffer();
        ArrayList<String> list = getRedNum();
        String str = "红球：";
        for (String s : list) {
            str += s + "";
        }
        str += " 蓝球：" + getBlueNum();
        return str;
    }

    public String getBlueNum() {
        Random ran = new Random();
        int index = ran.nextInt(16) + 1;
        if (index < 10)
            return "0" + index;
        else
            return "" + index;
    }

    public ArrayList<String> getRedNum() {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        for (int i = 1; i <= 33; i++) {
            if (i < 10)
                list1.add(" 0" + i);
            else
                list1.add(" " + i);
        }
        for (int i = 0; i < 6; i++) {
            int size = list1.size();
            Random ran = new Random();
            int index = ran.nextInt(size);
            String rednum = list1.get(index);
            list2.add(rednum);
            list1.remove(index);
        }
        Collections.sort(list2);
        return list2;
    }
}