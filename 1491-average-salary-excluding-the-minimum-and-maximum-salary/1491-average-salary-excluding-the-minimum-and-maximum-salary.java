class Solution {

    public double average(int[] salary) {
        double sum = 0d;
        int len = salary.length;

        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();
        for (int i = 0; i < len; i++) {
            sum += salary[i];
        }
        return (sum - min - max) / (len - 2);
    }
}
