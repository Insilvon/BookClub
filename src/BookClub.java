public class BookClub {
    public static void main(String[] args) {
        //System.out.println(characterCheck("actoer"));
        //System.out.println(permutationCheck("ere", "reee"));
        //rotate2DArray(3);
        rotate2DArray2(3);
    }
    /*
    Makes sure that all elements of the string are unique
     */
    public static boolean characterCheck(String a){
        for (int i = 0; i<a.length(); i++){
            if (a.substring(i+1).contains(a.charAt(i)+"")) return false;
        }
        return true;
    }
    /*
    Checks if String b is a permutation of String a
     */
    public static boolean permutationCheck(String a, String b){
        StringBuilder test = new StringBuilder(b);
        for (int i = 0; i<a.length(); i++){
            int index = test.indexOf(a.charAt(i)+"");
            if (index != -1) test.deleteCharAt(index);
            else return false;
        }
        return (test.length()==0);
    }
    /*
    Rotate a 2D array - Bryan Edition
     */
    public static void rotate2DArray2(int col){
        String[] original = {"a","b","c","d","e","f","g","h","i"};
        String[] rotated = new String[original.length];
        int n = col;
        int pointer = original.length-n;
        int newIndex = 0;
        while(original.length!=rotated.length){
            if (pointer>0){
                rotated[newIndex] = original[pointer];
                newIndex++;
                pointer-=n;
            }
            else {
                pointer = n-(-1*pointer)+1;
                rotated[newIndex] = original[pointer];
                newIndex++;
                pointer -=n;
            }
        }
        for (String num:rotated){
            System.out.print(num+" ");
        }
    }
    /*
    Rotate 2D array - Colin Edition
     */
    public static void rotate2DArray(int col){
        String[] originalMatrix = {"a","b","c","d","e","f","g","h","i"};
        String[] newMatrix = new String[originalMatrix.length];
        int newMatrixIndex = 0;
        int counter = col;
        while (counter > 0){
            int loopPointer = originalMatrix.length-counter;
            while (loopPointer >= 0){
                newMatrix[newMatrixIndex] = originalMatrix[loopPointer];
                loopPointer-=3;
                newMatrixIndex++;
            }
            counter--;
        }
        for (String num:newMatrix){
            System.out.print(num+" ");
        }
    }
}
