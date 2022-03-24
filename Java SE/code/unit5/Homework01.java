public class Homework01{
	public static void main(String []args) {
		int total = 100000;
		double left = total;
		int n = 0;
		/*while (left > 0){
			if (left>50000){
				left *= 0.95;
				n ++ ;
			}else{
				left -= 1000;
				if (left<0)break;
				n++;
			}
		}*/
		while (left > 0){
			if (left>50000){
				left *= 0.95;
				n ++ ;
			}else if(left>=1000){
				left -= 1000;
				n++;
			}else{
				break;
			}
		}
		System.out.println(n);
	}
}