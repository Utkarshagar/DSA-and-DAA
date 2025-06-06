class Solution {
    public String convert(String inputString, int numRows) {
        if(numRows == 1 || inputString.length() < numRows){
            return inputString;
        }
        StringBuilder result = new StringBuilder();
        int distance = (numRows - 1) * 2;
        for(int row = 0; row < numRows; row++){
            int increment = 2 * row;
            for(int index = row; index < inputString.length(); index += increment){
                result.append(inputString.charAt(index));
                increment = distance - increment;
                increment = (increment == 0) ? distance : increment;
            }
        }
        return result.toString();
    }
}
