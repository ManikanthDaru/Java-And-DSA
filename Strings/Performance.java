public class Performance {
    public static void main(String[] args) {
//        here the performance is very low
//        every the for loop runs new objects are created which results in waste of memory
//        if we want to make string mutable then we have to us string builder
        String str="";
        for(int i=0;i<26;i++) {
            char ch=(char)('a'+i);
            str=str+ch;
        }
        System.out.println(str);
    }
}
