package lab1;

public class Program15a_ListPrimeNumbers {
	public static void main(String[] args) {
		int n=100;
		boolean arr[]=new boolean[n+1];
		int i,j;
		/** using sieve of eranthoses
		 *  to list out the primes
		 */
		for(i=2;i<=n;i++)
			arr[i]=true;
		for(i=2;i*i<=n;i++)
		{
			if(arr[i]==true)
			{
				for(j=i*i;j<=n;j=j+i)
				{
					arr[j]=false;
				}
			}
		}
		System.out.println("List of Primes from 1 to 100 is ");
		for(i=2;i<=n;i++)
		{
			if(arr[i]==true) {
				System.out.println(i);
			}
		}
	}
}
