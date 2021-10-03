// File: T07AFraction.java
public class T07AFraction {
 //Method Penjumlahan Pecahan
    static void sumFraction(int e1, int d1, int e2, int d2){    
        int es, ds;
        es = (e1 * d2 + e2 * d1) ;  //Pembilang
        ds = (d1 * d2);             //Penyebut
        //Menyeleksi hasil pecahan
        if (es==ds) {                    
            System.out.println("1/1");   //Apabila nilai pembilang=penyebut (pecahan bernilai 1)
        } else {                         
            jawaban(es, ds);             //Apabila nilai pembilang != penyebut
        }
    }
    
    //Method Perkalian Pecahan
    static void productFraction(int e1, int d1, int e2, int d2 ){  
        int ep,dp;
        ep = (e1 * e2);  //Pembilang
        dp = (d1 * d2);  //Penyebut
        //Menyeleksi hasil pecahan
        if (ep==dp) {                    //Apabila nilai pembilang=penyebut (pecahan bernilai 1)  
            System.out.println("1/1");   
        } else {                         //Apabila nilai pembilang != penyebut
            jawaban(ep, dp);             
        }
    }

    //Menyederhanakan Pecahan

    //Method mencari pembagi bilangan
    static int pembagi(int a, int b){   
        if(b == 0){
            return a;
        } else{
            return pembagi(b, a % b);
        }
    }

    //Method untuk menulis jawaban
   static void jawaban(int c, int d){     
        int faktor = pembagi(c, d);
        //menyederhanakan pecahan
        c = c / faktor;
        d = d / faktor;
        if (c == d || d == 1) {
            int hasil = c / d;
            System.out.println(hasil);
        }else{
            System.out.println(c+"/"+d);
        }
   }

   //Method untuk mencetak hasil keluaran
    static void printFraction(){        
        sumFraction(1,2,2,3);           //Memanggil method sumFraction dan memasukkan nilai ke dalamnya
        sumFraction(1,3,3,4);            
        productFraction(1,2,2,3);        //Memanggil method productFraction dan memasukkan nilai ke dalamnya
        productFraction(1,4,2,3);        
    }
  
  public static void main(String[] args) {
    //Menampilkan output sekaligus mewakili jalannya seluruh program
        printFraction();
  }
}
