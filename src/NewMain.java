
public class NewMain {

  
    public static void main(String[] args) {
         int awal, beda, Un = 10,sn; // 
       
        awal = 10; 
        beda = 5; 
        sn=Un;
        int n = 0; 
        int Sn = 0; 

        System.out.println("Deret Aritmatikanya adalah : "); 
        for (int c = 0; c < 3; c++) { 
            for (int y = 0; y < 5; y++) { 
                System.out.print(sn + " ");
                Sn += sn; 
                sn +=beda;
                n++; 
                
                 
            }
            System.out.println(""); 
        }
        System.out.println("Jumlah deret Aritmatika : " + Sn); 
    }
    
}
