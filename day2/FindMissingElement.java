package week1.day2;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
	

	int num [] = {1,4,3,2,8,6,7};
	Arrays.sort(num);
	int len = num.length;
	
	for (int i =0;i<len;i++)
	{
		if(num[i] != i+1)
{
	System.out.println("Missing element is " + (i+1));
	break;
}
	}
	
}
}