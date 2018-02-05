package algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String acidNaming(String acid_name) {
        // Complete this function
    	String res="";
        if(acid_name.length() >=5 && (acid_name.substring(0,5).compareTo("hydro")==0) && (acid_name.substring(acid_name.length()-2,acid_name.length()).compareTo("ic")==0) ) {
        	res="non-metal acid";
        }else if(acid_name.length()>=2 && acid_name.substring(acid_name.length()-2,acid_name.length()).compareTo("ic")==0) {
        	res="polyatomic acid";
        }else {
        	res="not an acid";
        }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
