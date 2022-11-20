/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizno_2;

/**
 *
 * @author Fadhil Ramadhan
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Overriding extends DataIuran{


    public void inputDataIuran(String nik){
        Integer NIK=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Data Iuran Pokok ***");
        do{
            System.out.println("NIK : ");
            NIK = sc.nextInt();
            if(!NIK.toString().equalsIgnoreCase(nik)){
                System.out.println("NIK Tidak Sesuai");
            }
            setNIK(NIK);
        }while (!NIK.toString().equalsIgnoreCase(nik));

        System.out.println("Masukan Iuran Sampah : ");
        setSampah(sc.nextInt());
        System.out.println("Masukan Iuran Keamanan : ");
        setKeamanan(sc.nextInt());
        System.out.println("*** Data Iuran Sekunder ***");
        System.out.println("Masukan Sumbangan : ");
        setSumbangan(sc.nextInt());
    }

    public List<Integer> getResult(){
        List<Integer> dataReturn=new ArrayList();

        dataReturn.add(getNIK());
        dataReturn.add(getSampah()+getKeamanan()+getSumbangan());

        return dataReturn;
    }
}
