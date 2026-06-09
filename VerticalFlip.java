public class VerticalFlip {
    public static void main(String[] args) {
        int arr[][] = {
        {1,2,3},  // 00 01 02
        {4,5,6},  // 10 11 12
        {7,8,9}   // 20 21 22
      };
      // 3 2 1    02 01 00
      // 6 5 4    12 11 10
      // 9 8 7    22 21 20
      for(int i=arr.length-1;i>=0;i--){
        for(int j=0;j<arr.length;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}
