class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Add numbers to the current row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // First and last elements are always 1
                    row.add(1);
                } else {
                    // Middle elements are the sum of two numbers above
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }

            // Add the current row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    
}