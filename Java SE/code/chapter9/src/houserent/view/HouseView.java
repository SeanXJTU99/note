package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收输入
 * 3.调用其他类(Service)完成增删改查
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户输入
    private HouseService houseService = new HouseService(2);//设置数组大小


    //update根据Id修改信息
    public void update() {
        System.out.println("====修改房屋信息====");
        System.out.print("输入待修改的房屋id(-1退出):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=====放弃修改====");
            return;
        }

        //这里返回的是引用类型（就是数组的元素
        //house.Setxx()会直接修改 HouseService数组的元素
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=====修改的房屋信息编号不存在=====");
            return;
        }

        System.out.println("name(" + house.getName() + "): ");
        String name = Utility.readString(8, "");//若直接回车表示不修改
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.println("phone(" + house.getPhone() + "): ");
        String phone = Utility.readString(12, "");//若直接回车表示不修改
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        System.out.println("address(" + house.getAddress() + "): ");
        String add = Utility.readString(16, "");//若直接回车表示不修改
        if (!"".equals(add)) {
            house.setAddress(add);
        }
        System.out.println("rent(" + house.getRent() + "): ");
        int rent = Utility.readInt();//若直接回车表示不修改
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("status(" + house.getStatus() + "): ");
        String status = Utility.readString(3, "");//若直接回车表示不修改
        if (!"".equals(status)) {
            house.setStatus(status);
        }
        System.out.println("=====修改信息成功======");
    }

    //findHouse()接收输入id，调用Service 的 find方法
    public void findHouse() {
        System.out.println("=====查找房屋信息======");
        System.out.print("输入查找的id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("=====查找的房屋id不存在====");
        }
    }

    //退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //delHouse()接收输入的id，调用 Service 的 del 方法
    public void delHouse() {
        System.out.println("=====删除房屋信息=====");
        System.out.print("id to delete:(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("======放弃删除=====");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("====删除成功====");
            } else {
                System.out.println("====编号不存在，删除失败====");
            }
        } else {
            System.out.println("======放弃删除=====");
        }
    }

    //addHouse()接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("======添加房屋======");
        //房屋id自增长，不接收输入
        System.out.println("name:");
        String name = Utility.readString(8);
        System.out.println("phone:");
        String phone = Utility.readString(12);
        System.out.println("address:");
        String address = Utility.readString(16);
        System.out.println("rent");
        int rent = Utility.readInt();
        System.out.println("status:");
        String status = Utility.readString(3);
        //创建一个新House对象
        House newHouse = new House(0, name, phone, address, rent, status);
        if (houseService.add(newHouse)) {
            System.out.println("======添加房屋成功=====");
        } else {
            System.out.println("======添加失败=====");
        }
    }

    //listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("=====房屋列表=====");
        System.out.println("编号\t\t姓名\t\t电话\t\t地址\t\t租金\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) continue;
            System.out.println(houses[i]);
        }
        System.out.println("=====房屋列表显示完毕=====");
    }


    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n====房屋出租系统菜单=====");
            System.out.println("\t\t1.新增房源");
            System.out.println("\t\t2.查找房屋");
            System.out.println("\t\t3.删除房屋");
            System.out.println("\t\t4.修改房屋信息");
            System.out.println("\t\t5.显示房屋列表");
            System.out.println("\t\t6.退出");
            System.out.print("请选择1-6:");
            key = Utility.readChar();
            switch (key) {
                case '1':
//                    System.out.println("1.新增房源");
                    addHouse();
                    break;
                case '2':
//                    System.out.println("2.查找房屋");
                    findHouse();
                    break;
                case '3':
//                    System.out.println("3.删除房屋");
                    delHouse();
                    break;
                case '4':
//                    System.out.println("4.修改房屋信息");
                    update();
                    break;
                case '5':
//                    System.out.println("5.显示房屋列表");
                    listHouses();
                    break;
                case '6':
//                    System.out.println("6 退出系统");
                    exit();
                    break;
                default:
                    System.out.println("error, choose again");
            }
        } while (loop == true);
    }
}
