import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi họ tên cần kiểm tra: ");
        var fullName = input.nextLine(); // đọc cả dòng họ tên
        // tiến hành kiểm tra:
        // nếu họ tên không khớp: chỉ chứa chữ cái và dấu cách
        if(!fullName.matches(".*[a-zA-Z\\s]+.*")) {
            System.out.println("Họ tên không hợp lệ.");
        } else { // ngược lại họ tên là hợp lệ
            System.out.println("Chuỗi họ tên hợp lệ.");
        }
    }
}
