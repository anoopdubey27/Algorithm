package algorithm;

import java.util.Scanner;

public class HelpSachinDevSahoo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			String str=s.next();
			int k=s.nextInt();
			char[] res=new char[str.length()];
			boolean chang=true;
			for(int j=0;j<str.length();j++) {
				res[j]=str.charAt(j);
				if(res[j]=='0') chang=false;
			}
			int resc=0;
			if(!chang)
			for(int j=0;j<=str.length()-k;j++) {
			char ch1=res[j];
			if(j!=str.length()-k && res[j]=='1' ) {
				continue;
			}
			for(int l=j;l<j+k;l++) {
				char temp=res[l];
				res[l]=res[l]=='0'?'1':'0';
				if(temp!=res[l]) chang=true;
			}
			
			if(chang) resc++;
			int count=0;
			for(int l=0;l<str.length();l++) {
				if(res[l]=='1') count++;
			}
			if(count==str.length()) break;
			}
			
			for(int j=0;j<res.length;j++) {
				if(res[j]=='0') {
					resc=-1;
					break;
				}
			}
			System.out.println(resc);
		}

	}

}
