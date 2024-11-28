import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Supermarket {

    // Method untuk mencetak header login
    public static void loginHeader() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Log in");
        System.out.println("+-----------------------------------------------------+");
    }

    // Method untuk mencetak informasi supermarket
    public static void printSupermarketHeader(String namaSupermarket, String namaKasir) {
        // Menampilkan tanggal dan waktu saat ini
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Selamat Datang di Supermarket " + namaSupermarket);
        System.out.println("Tanggal dan Waktu : " + formatter.format(date));
        System.out.println("+----------------------------------------------------+");
    }

    // Method untuk mengenerate nomor faktur secara random
    public static String generateFaktur() {
        String faktur = "GHN" + (int) (Math.random() * 100000);
        return faktur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Proses login
        boolean loginSuccess = false;
        while (!loginSuccess) {
            loginHeader();
            System.out.print("Username : ");
            String username = scanner.nextLine();

            System.out.print("Password : ");
            String password = scanner.nextLine();

            // Menampilkan Captcha
            String captchaGenerated = "ABCD1234"; // Captcha statis
            System.out.println("Captcha    : " + captchaGenerated);
            System.out.print("Input Captcha: ");
            String captchaInput = scanner.nextLine();

            // Validasi login
            if (username.equals("adminghinalogin") && password.equals("ghinaInimah") && captchaInput.equals(captchaGenerated)) {
                System.out.println("Login berhasil!");
                loginSuccess = true;
            } else {
                System.out.println("Login gagal, silakan coba lagi.");
            }
        }

        // Informasi supermarket
        printSupermarketHeader("G-Mart", "Kasir Syantik");

        // Input detail belanja
        System.out.println("No. Faktur      : " + generateFaktur());
        System.out.print("Kode Barang  : ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Nama Barang : ");
        String namaBarang = scanner.nextLine();

        System.out.print("Harga Barang : ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Jumlah Beli     : ");
        int jumlahBeli = scanner.nextInt();

        // Menghitung total
        double total = hargaBarang * jumlahBeli;

        // Menampilkan struk
        System.out.println("+----------------------------------------------------+");
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Beli     : " + jumlahBeli);
        System.out.println("TOTAL             : " + total);
        System.out.println("+----------------------------------------------------+");
        System.out.println("Kasir : Kasir Syantik");
        System.out.println("+----------------------------------------------------+");

        scanner.close();
    }
}
