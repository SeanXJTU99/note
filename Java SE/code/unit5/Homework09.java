public class Homework09{
	public static void main(String []args) {
		int sum = 0;
		for(int i = 1; i <= 100; i ++){
			int count = 0;
			for (int j=1;j<=i;j++){
				count += j;
			}
			sum += count;
		}
		System.out.println(sum);
	}
}