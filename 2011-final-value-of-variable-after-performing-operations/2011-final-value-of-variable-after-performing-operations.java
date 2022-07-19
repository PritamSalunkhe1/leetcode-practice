class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int s = 0; s < operations.length; s++) {
            if (operations[s].equals("++X") || operations[s].equals("X++")) {
                count++;
            } else if (operations[s].equals("--X") || operations[s].equals("X--")) {
                count--;
            }
        }
        return count;
    }
}
