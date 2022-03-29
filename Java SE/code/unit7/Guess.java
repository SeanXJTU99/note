import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main(String []args) {
		Tom t= new Tom();
		int isWinCount = 0;
		int[][] arr1 = new int[3][3];
		int j = 0;
		String[] arr2 = new String[3];
		Scanner scan = new Scanner(System.in);
		for(int i =0; i< 3; i++){
			System.out.println("input your guess");
			int num = scan.nextInt();
			t.setTomGuessNum(num);
			int tomGuess = t.getTomGuessNum();
			arr1[i][j+1] = tomGuess;
			
			int comGuess = t.computerNum();
			arr1[i][j+2] = comGuess;
			
			String isWin = t.vsComputer();
			arr2[i] = isWin;
			arr1[i][j] = t.count;
			
			System.out.println("=================");
			System.out.println("game\tTom\t\tCom\t\tWinner");
			System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" +isWin);;
			System.out.println("=================");
			System.out.println("\n\n");
			isWinCount = t.winCount(isWin);
			
			System.out.println("game\tTom\tCom\t\tWinner");
			for(int a =0; a<arr1.length;a++){
				for(int b = 0; b<arr1[a].length; b++){
					System.out.print(arr1[a][b] + "\t\t\t");
				}
				System.out.print(arr2[a]);
				System.out.println();
			}
			System.out.println("win" +isWinCount + "times");
		}
    }
}
class Tom{
	int tomGuessNum;
	int comGuessNum;
	int winCountNum;
	int count = 1;
	//public void showInfo(){}
	public int computerNum(){
		Random r = new Random();
		comGuessNum = r.nextInt(3);
		return comGuessNum;
	}
	public void setTomGuessNum(int tomGuessNum){
		if(tomGuessNum > 2|| tomGuessNum < 0){
			throw new IllegalArgumentException("input error");
		}this.tomGuessNum = tomGuessNum;
	}
	public int getTomGuessNum(){
		return tomGuessNum;
	}
	public String vsComputer(){
		if(tomGuessNum==0&&comGuessNum==1){
			return "win";
		}else if(tomGuessNum==1&&comGuessNum==2){
			return "win";
		}else if(tomGuessNum==2&&comGuessNum==0){
			return "win";
		}else if(tomGuessNum==comGuessNum){
			return "balance";
		}else{return "lose";}
	}
	public int winCount(String s){
		count ++;
		if("win".equals(s)){
			winCountNum ++;
		}
		return winCountNum;
	}
}