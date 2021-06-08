public class Main {
    public static void main(String[] args) {
        System.out.println(findMiddle("abcde"));
        System.out.println(swapString("abcd"));
    }

    public static String findMiddle(String line){
       String newLine ="";
        if(line.length()%2==0){
            newLine+=line.charAt(line.length()/2-1);
        }
        newLine +=line.charAt(line.length()/2);
        return newLine;
    }

    public static String swapString(String line){
        String newLine = "";
        if(line.length()%2==0){
            newLine+= line.substring(line.length()/2);
        }
        else{
            newLine+= line.substring(line.length()/2+1);
            newLine+=line.charAt(line.length()/2);
        }
        newLine+=line.substring(0,line.length()/2);
        return newLine;
    }
}
