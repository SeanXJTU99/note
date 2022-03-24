public class Return01{
	public static void main(String []args) {
		for (int j=0; j<=4;j++){
			if(j==2){
				System.out.println("Sean" + j);
				//break;
				//continue;
				return;
			}
			System.out.println("Hello world");
		}
		System.out.println("go on. ..");
	}
}