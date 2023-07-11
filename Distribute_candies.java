import java.util.HashSet;

class Distribute {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int c = candyType.length;
        set.add(candyType[0]);
        int ans = 1;
        int half = candyType.length / 2;
        for (int i = 1; i < c; i++) {
            if (!(set.contains(candyType[i])) && ans < half) {
                set.add(candyType[i]);
                ans++;
            }
        }
        return ans;
    }
}