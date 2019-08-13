package chap4;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.print("name is "+name);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();           
        
        System.out.print("Plaease enter your salary : ");
        int salary = sc.nextInt();
        
        System.out.print("Employee name "+name);
        System.out.println(",age :"+age+",salary:"+salary);
       
        if (age>=1&&age<=11) {
            System.out.println("วัยเด็ก");
        }else if (age>=12&&age<=20) {
             System.out.println("วัยรุ่น");
        }else if (age>=21&&age<=40) {
            System.out.println("วัยผู้ใหญ่");
        }else if (age>=41&&age<=60) {
            System.out.println("วัยกลางคน");
        }else if(age>=61&&age>=65) {
            System.out.println("วัยสูงอายุ");
        }else{
            System.out.println("อายุไม่ตรงตามเงื่อนไข");}
       
       
            System.out.print("Enter degree : ");
        int degree = sc.nextInt();
        switch(degree){
            case 1:
                System.out.println("ปริญญาตรี");
                break;
           
            case 2:
                System.out.println("ปริญญาโท");
                break;
            
            case 3:
                System.out.println("ปริญญาเอก");
                break;
            default:
                System.out.println("กรุณาระบุบให้ถูกต้อง");
            
        }   
                    
        }   

            
        
                          
    }

