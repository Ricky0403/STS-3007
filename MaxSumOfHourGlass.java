public class MaxSumOfHourGlass {
    static int maxSum(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        if(r<3 || c<3){
            System.out.println("No possible solution");
            System.exit(0);
        }
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0;i<r-2;i++){
            for(int j = 0;j<c-2;j++){
                int sum = mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];
                MaxSum = Math.max(MaxSum,sum);
            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,0,0},
                {0,0,0,0,0},
                {2,1,4,0,0},
                {0,0,0,0,0},
                {1,1,0,1,0}};
        int res = maxSum(mat);
        System.out.println("Maximum sum is "+res);
    }
}
