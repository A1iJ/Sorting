package bubble;

public class NewSort {

	public static void main(String[] args) {
		
		int arr[] = { 90, 80, 60, 40, 10, 30, 20, 100, 70, 50};
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
