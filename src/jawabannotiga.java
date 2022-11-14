
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

    public class jawabannotiga {
        public static int Kuotabus = 200;
        public static String[] Toplevel = new String[90];
        public static String[] Middlelevel = new String[30];
        public static String [] Regularstaff = new String[50];
        public static String [] Staff = new String[30];

        public static Scanner inputuser = new Scanner(System.in);


        public static void InfoBus(){
            while (true){
                System.out.println(" ============== Touring Karyawan KFC (Kamir From Cinde) ============== ");
                System.out.println(" ===================================================================== ");

                System.out.print("Masukkan Nik anda = ");
                String nik = inputuser.next();
                System.out.println();
                System.out.println(" Level Jabatan Anda ");
                System.out.println("1. CEO");
                System.out.println("2. Manager ");
                System.out.println("3. Supervisor");
                System.out.println("4. Staff");
                System.out.print("Jawaban Anda =");
                int jabatan = inputuser.nextInt();
                switch (jabatan){
                    case 1 ->
                    {
                        inputdatakeArray(Toplevel,nik);
                        System.out.println( "NIK "+nik +" Masuk ke Bus 01. Top Level");
                        tampilkansemuadatapenumpang();

                    }
                    case 2 ->
                    {
                        inputdatakeArray(Middlelevel,nik);
                        System.out.println( "NIK " +nik +" Masuk ke Bus 02. MiddleLevel");
                        tampilkansemuadatapenumpang();

                    }
                    case 3 ->
                    {
                        inputdatakeArray(Regularstaff, nik);
                        System.out.println("NIK " +nik+ " Masuk ke Bus 03. Regular Staff ");
                        tampilkansemuadatapenumpang();


                    }
                    case  4 ->
                    {
                        inputdatakeArray(Staff,nik);
                        System.out.println("NIK " +nik +" Masuk Ke Bus 04. Staff");
                        tampilkansemuadatapenumpang();

                    }
                    default ->
                    {
                        System.out.println("Pilihan Tidak Tersedia");
                    }

                }



                if (nik.isBlank()){
                    System.out.println("Lengkapi nik anda dengan lengkap");
                    InfoBus();

                }
                else {
                    System.out.println();
                    //System.out.println("Nik " + nik + " masuk ke Bus " + jabatan);
                }
                System.out.println();

            }

        }
        public static void inputdatakeArray(String []namaArray,String nikbaru ){
            for (int j = 0 ; j < namaArray.length; j++){
                namaArray [j] =  nikbaru;
                break;
            }

        }
        public static void tampilkansemuadatapenumpang (){
            int sisadatapenumpang = 0;
            int toplevelData = 0;
            for ( int i =0; i < Toplevel.length ; i++){
                if (Toplevel [i] != null){
                    toplevelData++;
                }
            }
            int middleleveldata =0;
            for (int i = 0;i < Middlelevel.length;i++){
                if (Middlelevel [i] != null){
                    middleleveldata++;
                }
            }
            int regularstaffdata = 0;
            for (int i = 0 ; i< Regularstaff.length ; i++ ){
                if (Regularstaff [i] != null){
                    regularstaffdata++;
                }
            }
            int staffdata = 0;
            for (int i = 0 ; i < Staff.length; i++){
                if(Staff [i] != null){
                    staffdata++;
                }
            }

            sisadatapenumpang = Kuotabus - sisadatapenumpang - toplevelData - middleleveldata - regularstaffdata - staffdata;
            System.out.println();
            System.out.println("\nkuota Orang Top Level adalah " + toplevelData);
            System.out.println("kuota Orang Middle Level adalah " + middleleveldata);
            System.out.println("Kuota Orang Regular Staff adalah " + regularstaffdata);
            System.out.println("kuota Orang Staff adalah " + staffdata);
            System.out.println("Total penumpang Bus adalah " + Kuotabus + "dan Sisa Kuotanya adalah "  + sisadatapenumpang);
        }

        public static void main(String[] args) {

            InfoBus();

        }




}
