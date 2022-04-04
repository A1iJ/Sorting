package bubble;
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = { 9, 8, 6, 4, 1, 3, 2, 0, 7, 5};
		int temp;
		
		for(int i = 0; i<10; i++)
		{
			for(int j = i; j<10; j++){
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(arr[i]);
		}

	}

}