package loveProgramming;

public class StringBuilder {
    public static void main(String[] args) {
        String myString = "";

        for(char c = 'a'; c<='z';c++){
            myString=myString+c;
        }

        System.out.println(myString);

        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        for(char c = 'a';c<='z';c++){
//            sb.append(c).;
        }

        System.out.println(sb);

        java.lang.StringBuilder builder = new java.lang.StringBuilder("Start");
        builder.append("-Middle");
        System.out.println(builder);
        java.lang.StringBuilder anotherStringBuilder = builder.append("-End");
        System.out.println(anotherStringBuilder);

        //String str = anotherStringBuilder.append("HashCode").toString();

        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherStringBuilder));

        java.lang.StringBuilder myBuilder = new java.lang.StringBuilder();
        System.out.println("size is = "+myBuilder.length());
        System.out.println("capacity is ="+myBuilder.capacity());



    }
}


