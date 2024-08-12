public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            // when you start a new column , take  new sum for that row
            int rowkasum = 0;
            for (int bankAccount = 0; bankAccount< accounts[person].length; bankAccount++){
                rowkasum = accounts[person][bankAccount];
            }
            // here , we have answer of sum of accounts of person
            // check with overall answer
            if(rowkasum>max){
                max = rowkasum;
            }
        }
        return max;
    }
}
