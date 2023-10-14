class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            for(int i=0; i<(image[0].length+1)/2; i++){// loop to flip each row
                int temp = row[i] ^ 1; //doing XOR with 1 to get the inverted integer
                row[i] = row[image[0].length-1-i] ^ 1;
                row[image[0].length-1-i] = temp;
            }
        }
        return image;
    }
}
