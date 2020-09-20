// 字符转char数组：.toCharArray()；char数组转字符串：String.valueOf(str)

//String的substring()取子串

// 利用StringBuilder的append()，String的charAt()获取指定下标元素

public class Leecode {
    public static void main(String[] args) {
        String s = "lrloseumgh"; int n = 6;
        String res = reverseLeftWords(s, n);
        System.out.println(res);
        String res1 = s.substring(n, s.length()) + s.substring(0, n);
        System.out.println(res1);

        StringBuilder sb = new StringBuilder();
        for (int i=n; i<s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int j=0; j<n; j++) {
            sb.append(s.charAt(j));
        }
        System.out.println(sb.toString());
    }

    public static String reverseLeftWords(String s, int n) {
        char[] chs = s.toCharArray();
        char[] pre = new char[n];
        char[] lef = new char[chs.length - n];
        String last;
        for (int i=0; i<chs.length; i++) {
            if (i<n) {
                pre[i]= chs[i];
            } else {
                lef[i-n] = chs[i];
            }
        }
        last = String.valueOf(lef) + String.valueOf(pre);
        return last;
    }
}
