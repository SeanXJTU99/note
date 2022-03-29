public class HanoiTower {
    public static void main(String []args) {
		Tower tower = new Tower();
		tower.move(5,'A','B','C');
	}
}
class Tower{
	//a tower, b tower, c tower
	public void move(int num,char a, char b, char c){
		if(num == 1){
			System.out.println(a+"->"+c);		
		}else{
			// upper plates in a move to c by b
			move(num-1, a,c,b);
			// lower plate in a move to c
			System.out.println(a+"->"+c);
			// upper plates in b move to c
			move(num-1, b,a,c);
		}
	}
}