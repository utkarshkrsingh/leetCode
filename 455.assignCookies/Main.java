import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g, s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int content = 0;
        int cookiesIndex = 0;
        while(cookiesIndex < s.length && content < g.length) {
            if (s[cookiesIndex] >= g[content]) {
                content++;
            }
            cookiesIndex++;
        }
        return content;
    }
}