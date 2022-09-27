import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chooseFoods, validFee, confirm;
        int stockBiskuit = 5;
        int stockChips = 5;
        int stockOreo = 5;
        int stockTango = 5;
        int stockCoklat = 5;

        while (true){
            //LIST MENU
            System.out.println("      FOOD VENDING MACHINE      ");
            System.out.println("--------------------------------");
            System.out.println(" ");
            System.out.println("1. Biskuit\t: Rp. 6000 | Stock : " + stockBiskuit);
            System.out.println("2. Chips\t: Rp. 8000 | Stock : " + stockChips);
            System.out.println("3. Oreo \t: Rp. 10000 | Stock : " + stockOreo);
            System.out.println("4. Tango\t: Rp. 12000 | Stock : " + stockTango);
            System.out.println("5. Cokelat\t: Rp. 15000 | Stock : " + stockCoklat);
            System.out.println("---------------------------------");
            System.out.println("Pilih makanan \t: ");
            chooseFoods = input.nextInt();

            switch (chooseFoods){
                //Pilih Makanan
                case 1 :
                if (stockBiskuit == 0) {
                    System.out.println("Biskuit Kosong");
                }else {
                    System.out.println("Silahkan masukan uang anda\t: ");
                    validFee = input.nextInt();
                    if (validFee == 2000 || validFee == 5000 || validFee == 10000 || validFee == 20000 || validFee == 50000 ){
                        System.out.println("Sisa uang kembalian tidak tersedia!");
                        System.out.println("Silahkan konfirmasi ulang");
                        System.out.println("Pilih Makanan ? (1) YA || (2) TIDAK");
                        System.out.println("Pilih\t:");
                        confirm = input.nextInt();

                        if (confirm != 1){
                            System.out.println("Uang Anda Kembali");
                            System.out.println("-------------------------------------------");
                        }else {
                            stockBiskuit = stockBiskuit-1;
                            //Bill Pembelian Vending Machine
                            System.out.println("-------------------------------------------");
                            System.out.println("Makanan yang dipilih\t: Biskuit ");
                            System.out.println("Harga Biskuit \t\t\t: Rp. 6.000");
                            System.out.println("Uang yang anda gunakan \t: Rp. " + validFee);
                            System.out.println("Kembalian \t\t\t\t : Rp. " + (validFee-6000));
                            System.out.println("-------------------------------------------");
                        }
                    }else {
                        System.out.println("Uang yang anda masukan tidak valid");
                        System.out.println("Silahkan masukan pecahan Rp. 2.000, Rp. 5.000, Rp.10000, Rp. 20.000 dan Rp. 50.000");
                    }
                }
                case 2 :
                    if (stockChips == 0) {
                        System.out.println("Chips Kosong");
                    }else {
                        System.out.println("Silahkan masukan uang anda\t: ");
                        validFee = input.nextInt();
                        if (validFee == 2000 || validFee == 5000 || validFee == 10000 || validFee == 20000 || validFee == 50000) {
                            System.out.println("Sisa uang kembalian tidak tersedia!");
                            System.out.println("Silahkan konfirmasi ulang");
                            System.out.println("Pilih Makanan ? (1) YA || (2) TIDAK");
                            System.out.println("Pilih\t:");
                            confirm = input.nextInt();

                            if (confirm != 1) {
                                System.out.println("Uang Anda Kembali");
                                System.out.println("-------------------------------------------");
                            } else {
                                stockChips = stockChips - 1;
                                //Bill Pembelian Vending Machine
                                System.out.println("-------------------------------------------");
                                System.out.println("Makanan yang dipilih\t: Chips ");
                                System.out.println("Harga Chips \t\t\t: Rp. 8.000");
                                System.out.println("Uang yang anda gunakan \t: Rp. " + validFee);
                                System.out.println("Kembalian \t\t\t\t : Rp. " + (validFee - 8000));
                                System.out.println("-------------------------------------------");
                            }
                        } else {
                            System.out.println("Uang yang anda masukan tidak valid");
                            System.out.println("Silahkan masukan pecahan Rp. 2.000, Rp. 5.000, Rp.10000, Rp. 20.000 dan Rp. 50.000");
                        }
                    }
                case 3 :
                    if (stockOreo == 0) {
                        System.out.println("Oreo Kosong");
                    }else {
                        System.out.println("Silahkan masukan uang anda\t: ");
                        validFee = input.nextInt();
                        if (validFee == 2000 || validFee == 5000 || validFee == 10000 || validFee == 20000 || validFee == 50000 ){
                            System.out.println("Sisa uang kembalian tidak tersedia!");
                            System.out.println("Silahkan konfirmasi ulang");
                            System.out.println("Pilih Makanan ? (1) YA || (2) TIDAK");
                            System.out.println("Pilih\t:");
                            confirm = input.nextInt();

                            if (confirm != 1){
                                System.out.println("Uang Anda Kembali");
                                System.out.println("-------------------------------------------");
                            }else {
                                stockOreo = stockOreo-1;
                                //Bill Pembelian Vending Machine
                                System.out.println("-------------------------------------------");
                                System.out.println("Makanan yang dipilih\t: Oreo ");
                                System.out.println("Harga Oreo \t\t\t: Rp. 10.000");
                                System.out.println("Uang yang anda gunakan \t: Rp. " + validFee);
                                System.out.println("Kembalian \t\t\t\t : Rp. " + (validFee-10000));
                                System.out.println("-------------------------------------------");
                            }
                        }else {
                            System.out.println("Uang yang anda masukan tidak valid");
                            System.out.println("Silahkan masukan pecahan Rp. 2.000, Rp. 5.000, Rp.10000, Rp. 20.000 dan Rp. 50.000");
                        }
                    }
                case 4 :
                    if (stockTango == 0) {
                        System.out.println("Tango Kosong");
                    }else {
                        System.out.println("Silahkan masukan uang anda\t: ");
                        validFee = input.nextInt();
                        if (validFee == 2000 || validFee == 5000 || validFee == 10000 || validFee == 20000 || validFee == 50000 ){
                            System.out.println("Sisa uang kembalian tidak tersedia!");
                            System.out.println("Silahkan konfirmasi ulang");
                            System.out.println("Pilih Makanan ? (1) YA || (2) TIDAK");
                            System.out.println("Pilih\t:");
                            confirm = input.nextInt();

                            if (confirm != 1){
                                System.out.println("Uang Anda Kembali");
                                System.out.println("-------------------------------------------");
                            }else {
                                stockOreo = stockOreo-1;
                                //Bill Pembelian Vending Machine
                                System.out.println("-------------------------------------------");
                                System.out.println("Makanan yang dipilih\t: Biskuit ");
                                System.out.println("Harga Tango \t\t\t: Rp. 12.000");
                                System.out.println("Uang yang anda gunakan \t: Rp. " + validFee);
                                System.out.println("Kembalian \t\t\t\t : Rp. " + (validFee-12000));
                                System.out.println("-------------------------------------------");
                            }
                        }else {
                            System.out.println("Uang yang anda masukan tidak valid");
                            System.out.println("Silahkan masukan pecahan Rp. 2.000, Rp. 5.000, Rp.10000, Rp. 20.000 dan Rp. 50.000");
                        }
                    }
                case 5 :
                    if (stockCoklat == 0) {
                        System.out.println("Coklat Kosong");
                    }else {
                        System.out.println("Silahkan masukan uang anda\t: ");
                        validFee = input.nextInt();
                        if (validFee == 2000 || validFee == 5000 || validFee == 10000 || validFee == 20000 || validFee == 5000 ){
                            System.out.println("Sisa uang kembalian tidak tersedia!");
                            System.out.println("Silahkan konfirmasi ulang");
                            System.out.println("Pilih Makanan ? (1) YA || (2) TIDAK");
                            System.out.println("Pilih\t:");
                            confirm = input.nextInt();

                            if (confirm != 1){
                                System.out.println("Uang Anda Kembali");
                                System.out.println("-------------------------------------------");
                            }else {
                                stockCoklat = stockCoklat-1;
                                //Bill Pembelian Vending Machine
                                System.out.println("-------------------------------------------");
                                System.out.println("Makanan yang dipilih\t: Coklat ");
                                System.out.println("Harga Coklat \t\t\t: Rp. 15.000");
                                System.out.println("Uang yang anda gunakan \t: Rp. " + validFee);
                                System.out.println("Kembalian \t\t\t\t : Rp. " + (validFee-15000));
                                System.out.println("-------------------------------------------");
                            }
                        }else {
                            System.out.println("Uang yang anda masukan tidak valid");
                            System.out.println("Silahkan masukan pecahan Rp. 2.000, Rp. 5.000, Rp.10000, Rp. 20.000 dan Rp. 50.000");
                        }
                    }
                case 0:
                    break;

                default:
                    System.out.println("Input Salah! Masukan Pilihan Makanan Yang Tersedia");
                    System.out.println("--------------------------------------------------");
            }
        }
    }
}
