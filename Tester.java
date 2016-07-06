package lab8;
import java.util.Scanner;

public class Tester {
	
public static void main(String[] args)
{
	Scanner sc;
	sc = new Scanner(System.in);
	int i =sc.nextInt();
	sc.nextLine();
	emp[] e = new emp[i];
	for(int j=0; j<i; j++)
	{
		String a[];
		a=sc.nextLine().split(" ");
		e[j]=new emp(a[0],a[1],a[2],a[3]);
	}
	int k = sc.nextInt();
	sc.nextLine();
	search[] s = new search[k];
	for(int j=0; j<k; j++)
	{
		String b[];
		b=sc.nextLine().split(" ");
		s[j]=new search(b[0],b[1]);
	}
	search.compare(i,e,k,s);
	sc.close();}}
