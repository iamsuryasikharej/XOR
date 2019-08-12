class XOR
{
	static int arr[]={0,0,0,1,0,0};
	static int arr1[]={0,0,0,1,0,1};
	static Integer[] sum=new Integer[arr.length];
	public static void main(String[] args) {
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==1 && arr1[i]==1)
			{
				
				sum[i]=0;
			}
			if((arr[i]==0 ) && (arr1[i]==0))
			{
				
				sum[i]=0;
			}
			if((arr[i]==0  && arr1[i]==1) || (arr1[i]==0  && arr[i]==1))
			{
				
				sum[i]=1;
			}
		}
		for(int temp:sum)
		{
			System.out.println(temp);
		}
	}
}