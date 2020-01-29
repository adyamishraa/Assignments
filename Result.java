package Homework;

public class Result 
	{

	int val1,val2;
	
	void fetchResult(String str1, String str2) 
		{
		int len1=str1.length();
		int len2=str2.length();
		if(len1== 0 && len2==0) 
			{
			System.out.println("0"); // empty string handling
			}
		if(len1== 0 || len2==0) 
			{
			if(len1==0) 
				{
				System.out.println("-1");
				}
			else 
				{
				System.out.println("1");
				}
			}
		 if(len1>len2) 
		 			{
			String swap=str1; // to make sure the smaller length is considered
			str1=str2;
			str2=swap;
			
		 			}
		for(int i=0; i<len1;i++) 
				{
			
			int ASCII_str1=str1.charAt(i);
			int ASCII_str2=str2.charAt(i);

			if(66<ASCII_str1 && ASCII_str1<91) {
				if(66<ASCII_str2 && ASCII_str2<91)
				{
				val1=ASCII_str1+32; // for ignore case section
				val2=ASCII_str1+32;
					}
			}
			else 
					{
				val1=ASCII_str1;
				val2=ASCII_str2;	
					}
			int Res_ASCII=val1-val2;

				if(Res_ASCII==0) 
					{
					if(i==len1-1)
					System.out.println("0");
				
					}
				else if(Res_ASCII<0) 
					{
					System.out.println("-1");
					break;
					}
				else  
					{
					System.out.println("1");
					break;
			
					}	
				}
		}
	}

		
