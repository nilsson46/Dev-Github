public class MegaBytesConverter {
    public static void printMegaBytesAndKilobytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kilobytes / 1024;
            int remainingKilobytes = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + megaBytes + " MB " + "and " + remainingKilobytes + " KB");
        }

    }
}