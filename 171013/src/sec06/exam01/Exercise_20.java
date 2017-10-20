package sec06.exam01;

public class Exercise_20 {
	
	public static int[] shuffle(int []arr) {
		if(arr == null || arr.length == 0)
			return arr;
		
		for(int x=0; x<arr.length*2; x++) {
			int i = (int)(Math.random()*arr.length);
			int j = (int)(Math.random()*arr.length);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] O_arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(O_arr));
		
		int[] result = shuffle(O_arr);
		System.out.println(java.util.Arrays.toString(result));
	}

}
