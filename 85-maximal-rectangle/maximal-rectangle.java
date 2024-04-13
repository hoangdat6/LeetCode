class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int histograms[][] = new int[rowLen][colLen];

        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(i==0){
                    histograms[i][j] = Character.getNumericValue(matrix[i][j]);
                }else{
                    char value = matrix[i][j];
                    if(value!='0'){
                       histograms[i][j] = histograms[i-1][j] + Character.getNumericValue(value);
                    }
                }
            }
        }

        int maxArea = 0;

        for(int i=0;i<rowLen;i++){
            maxArea = Math.max(maxArea, getMaxRectangleArea(colLen,histograms[i]));
        }



        return maxArea;
    }

    public int getMaxRectangleArea(int len , int height[]){

        int left []= new int [len];
        int right [] = new int [len];

        Stack<Integer> stack = new Stack<>();

        for(int i=len-1;i>=0;i--){
            if(stack.isEmpty()){
                right[i]= len;
            }else if( !stack.isEmpty() && height[stack.peek()]< height[i]){
                right[i]= stack.peek();
            }else if(  !stack.isEmpty() && height[stack.peek()] >=height[i]){
                while( !stack.isEmpty() && height[stack.peek()]>=height[i]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    right[i]= len;
                }else{
                    right[i]= stack.peek();
                }
            }
            stack.push(i);
        }

        stack.clear();

         for(int i=0;i<len;i++){
            if(stack.isEmpty()){
                left[i]= -1;
            }else if( !stack.isEmpty() && height[stack.peek()]< height[i]){
                left[i]= stack.peek();
            }else if(  !stack.isEmpty() && height[stack.peek()] >=height[i]){
                while( !stack.isEmpty() && height[stack.peek()]>=height[i]){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    left[i]= -1;
                }else{
                    left[i]= stack.peek();
                }
            }
            stack.push(i);
        }


        int maxArea =0;
        for(int i=0;i<len;i++){
            int area = (right[i]-left[i]-1)*height[i];
            maxArea = Math.max(maxArea,area);
        }

        return maxArea;
    }
}