/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.stringSamples;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author sds
 */
public class StringSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Encoding, String & bytes
        byte[] bytes = { 72 , 101 , 108 , 108 , 111 };
        String  s1 = new String(bytes);
        System.out.write(bytes);
        System.out.println( s1 );
        byte bytesNational[] ={ (byte)207, (byte)240, (byte)232 , (byte)226, (byte)229 , (byte)242 };
        s1 = new String(bytesNational); // Charset.defaultCharset() result depends on PC
        System.out.println( s1 );
        s1 = new String(bytesNational,"Windows-1251");
        System.out.println( s1 );
        //default charser
        System.out.println(Charset.defaultCharset());
        byte newBytes[] = s1.getBytes();
        System.out.println( Arrays.toString( bytesNational ) );
        System.out.println( Arrays.toString( newBytes ) );
        s1 = new String(newBytes,"Windows-1251");
        System.out.println( s1 );
        
        //String comparing
        System.out.println("=====comparing=========");
        //java features
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s2==s3);
        s3 = "Hello";
        System.out.println(s2==s3);
        s3 = "He"+"llo";
        System.out.println(s2==s3);
        s3 = "He";
        s3 += "llo";
        System.out.println(s2==s3);
        s3 = s3.intern();
        System.out.println(s2==s3);
        //how to compare correctly
        s3 = new String("Hello");
        System.out.println(s2.equals(s3));
        System.out.println( s2.equals("Hello") );
        s2 = null; // from database, or user etc.
        //System.out.println( s2.equals("Hello") );// - Exception
        System.out.println( "Hello".equals(s2) );
        System.out.println( Objects.equals(s2, s3) );
        System.out.println( Objects.equals( null, null) );
        //String is constant!!!!!!
        System.out.println("=======String is constant=========");
        String sh = "    hello world! привіт2   3432432423423423342  ";
        sh.toUpperCase(); //new String();
                          //"";  
        System.out.println(sh);
        System.out.println(sh.toUpperCase());
        sh = sh.toUpperCase();
        System.out.println(sh);
        sh = sh.substring(4);
        System.out.println(sh);
        //but += is working
        sh+=sh; // sh = sh + sh
        System.out.println(sh);
        //but sometimes it is slow
        String buffer="";
        for( int count= 0; count<100_500; count++){
            buffer += 'a';
        }
        System.out.println("finished");
        
        StringBuilder sb = new StringBuilder();
        for( int count= 0; count<100500; count++){
            sb.append( 'a' );
        }
        System.out.println("finished");
        int ii = 3;
        float f = 3.5f;
        System.out.print(String.format("Values = % 6d  %10.3f", ii, f));
        //regular expressions
        String input="world"; 
        if( input.matches("[A-Za-z]+") ){
            System.out.println("String contains only letters");
        }
        input = "123.45";
        if( input.matches("[0-9]+\\.[0-9]+") ){
            System.out.println("String contains only digits");
        }
        
        Pattern lettersPattern = Pattern.compile("[A-Za-z]+");
        Matcher lettersMatcher = lettersPattern.matcher(input);
        if( lettersMatcher.matches() ){
            System.out.println("mathes");
        }else{
            System.out.println("not matches");
            //System.out.format(input, args)
        }
        
        System.out.println("====================");
        sh = "    hello world! привіт2   3432432423423423342  ";
        for (String t : sh.split(" +")) {
            System.out.println(t);
            Matcher matcher = lettersPattern.matcher(t);

            if (matcher.matches()) {
                System.out.println( t + " matches letters");
            }
        }
       // Number
        
        
    }
}
