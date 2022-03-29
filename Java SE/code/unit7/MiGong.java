public class MiGong {
    public static void main(String []args) {
		//make MiGong by Array
		int[][] map =new int[8][7];
		for(int i =0; i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int j = 0; j < 8; j++){
			map[j][6] = 1;
			map[j][0] = 1;
		}
		map[3][1]=1;map[3][2] = 1;map[2][2]=1;
		T t1 = new T();
		t1.Map(map);
		t1.findWay(map,1,1);
		//System.out.println("====find map=====");
		t1.Map(map);
	}
}
class T{
	public boolean findWay(int[][] map, int i, int j){//Map(map);
		if(map[6][5] == 2){
			return true;
		}else{
			if(map[i][j] == 0){
				map[i][j] = 2;
				if (findWay(map, i+1,j)){return true;}
				else if(findWay(map,i,j+1)){return true;}
				else if(findWay(map,i-1,j)){return true;}
				else if(findWay(map,i,j-1)){return true;}
				else{map[i][j] = 3; return false;}
			}else{
				return false;//1,2,3
			}
		}
	}
	public void Map(int[][] map){
		System.out.println("====map=====");
		for(int i =0; i< map.length;i++){
			for(int j= 0; j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}
	}
}