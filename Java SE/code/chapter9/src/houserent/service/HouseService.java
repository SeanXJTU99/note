package houserent.service;

import houserent.domain.House;

/**
 * 1.相应View的调用
 * 2.完成crud（create read update delete
 * 3.定义House[],保存House对象
 */
public class HouseService {
    private House[] houses;//保存House对象，默认为空
    private int houseNum = 1;//记录当前信息数，防止超出数组大小
    private int idCounter = 1;//记录当前id

    public HouseService(int size){
        houses = new House[size];//创建HouseService时指定数组大小
        houses[0] = new House(1,"jac","112",
                "add",2000,"n");
    }

    //find
    public House findById(int findId){
        for (int i = 0; i < houseNum; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //del方法，删除一个房屋信息
    public boolean del(int delId){
        //找到要删除的房屋信息对应的数组下标
        //下标和id不是一回事
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if(delId == houses[i].getId()){//删除的房屋id，是数组下标为i的元素
                index = i;
            }
        }
        if(index == -1){//没找到
            return false;
        }
        //如果找到
        for(int i = index; i<houseNum-1;i++){
            houses[i] = houses[i+1];
        }
        //将当前房屋数组最后一个置空
        houses[houseNum-1] = null;
        houseNum--;
        return true;
    }
    //add方法，添加新对象，返回bool
    public boolean add(House newHouse){
        if(houseNum == houses.length){
            System.out.println("已经满了，不能再添加");
            return false;
        }
        //将newHouse对象加到数组对象
        houses[houseNum] = newHouse;
        houseNum ++;
        //id应当自增长
        newHouse.setId(++idCounter);
        return true;
    }

    //list方法，返回数组
    public House[] list(){
        return houses;
    }
}
