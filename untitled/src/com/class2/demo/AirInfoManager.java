package com.class2.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirInfoManager extends AirInfo {
AirInfo airInfos1= new AirInfo();
List<AirInfo> airInfos =new ArrayList<>();
      int index;
    Scanner scanner =new Scanner(System.in);
    public void show(){
while(true){
    System.out.println("=============欢迎使用航班信息管理系统=============");
    System.out.println("请选择操作：");
    System.out.println("1.列出所有航班");
    System.out.println("2.按起飞时间查询");
    System.out.println("3.按目的地查询");
    System.out.println("4.更新航班");
    System.out.println("5.删除航班");
    System.out.println("6.退出系统");
    index=scanner.nextInt();
    if(index==6)
    {
        System.out.println("退出成功");
        break;
    }
    switch (index) {

        case 1:
            all_flight(airInfos);
            break;
        case 2:
            inquiry_date(airInfos);
            break;
        case 3:
            inquiry_destination(airInfos);
            break;
        case 4:
            add( airInfos);
            break;
        case 5:
            delete_flight(airInfos);
            break;
        case 6:
            System.out.println("退出成功");
            break;
    }
}
    }
    public  void add(List<AirInfo> airInfos)
    {
        System.out.println("请输入航班号(例如:CA1551)");
        String num = scanner.next();
       airInfos1.setFlight_number(num);
        System.out.println("请输入航班编号(例如:001");
        int num1= scanner.nextInt();
        airInfos1.setId(num1);
        System.out.println("请输入目的地(例如:北京)");
        String string = scanner.next();
        airInfos1.setDestination(string);
        System.out.println("请输入起飞日期 (例如:2024-1-1 )");
        String string1 = scanner.next();
        airInfos1.setFlight_date(string1);
        airInfos.add(airInfos1);
        System.out.println("添加成功！！！");
    }
    public void delete_flight(List<AirInfo> flight){
        System.out.print("请输入需要删除的航班编号：");
        Scanner in=new Scanner(System.in);
        List delList = new ArrayList();
        int id=in.nextInt();
        for(AirInfo e:flight)
        {
            if(e.getId()==(id))
                delList.add(e);
        }
        flight.removeAll(delList);
        System.out.println("删除成功！");
    }
    public void all_flight(List<AirInfo> flight){
        System.out.println("编号\t 航班号\t目的地\t\t起飞日期");
        for(AirInfo e:flight)
            System.out.println(e.getId()+"\t"+e.getFlight_number()+"\t"+e.getDestination()+"    "+e.getFlight_date());

    }
    public void inquiry_date(List<AirInfo> flight){
        System.out.print("请输入日期：");
        Scanner in=new Scanner(System.in);
        String date=in.next();
        for(AirInfo e:flight)
        {
            if(e.getFlight_date().equals(date)){
                System.out.println("编号\t 航班号\t目的地\t\t起飞日期");
                System.out.println(e.getId()+"\t"+e.getFlight_number()+"\t"+e.getDestination()+"    "+e.getFlight_date());
            }else{
                System.out.println("没有这个日期的航班");
            }
        }
    }
    public void inquiry_destination(List<AirInfo> flight){
        System.out.print("请输入目的地：");
        Scanner in=new Scanner(System.in);
        String destination=in.next();
        for(AirInfo e:flight)
        {
            if(e.getDestination().equals(destination)){
                System.out.println("编号\t 航班号\t目的地\t\t起飞日期");
                System.out.println(e.getId()+"\t"+e.getFlight_number()+"\t"+e.getDestination()+"    "+e.getFlight_date());
            }else {
                System.out.println("没有此目的地的航班");
            }
            }
        }
    }


