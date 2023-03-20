public class Ques8 {
    public static void main(String[] args) {
        String string = args[0];
        int startIndex = Integer.parseInt(args[1]);
        int endIndex = Integer.parseInt(args[2]);
        int length = string.length();
        try{
            if(startIndex<0 || endIndex>=length || endIndex<0 || startIndex>=length){
                throw new StringIndexOutOfBoundsException();
            } else if (startIndex>endIndex){
                throw new StringIndexOutOfBoundsException("StartIndex Cannot Be Greater Than EndIndex");
            }
            System.out.println(string.substring(startIndex, endIndex));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}