import java.util.Scanner;
public class SeqSearch{
    public static void main(String []args) {
		String[] names = {"name1","name2","name3","name4"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("input name plz");
		String findName = myScanner.next();
		int index = -1;
		for(int i = 0; i < names.length; i ++){
			//equals
			if(findName.equals(names[i])){
				System.out.println("found name");
				System.out.println("index is "+i);
				index = i;
				break;
			}
		}
		if(index == -1){
			System.out.println("not found");
		}
    }
}