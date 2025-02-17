import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String phoneNum;
        int inputMenuNum;

        System.out.print("당신의 이름을 입력하세요 : ");
        name = br.readLine();

        System.out.print("연락처를 입력하세요 : ");
        phoneNum = br.readLine();

        System.out.println("**************************************************");
        System.out.println("\t\t\tWelcome to Shopping Mall");
        System.out.println("\t\t\tWelcome to Book Market!");
        System.out.println("**************************************************");
        System.out.println(" 1. 고객 정보 확인하기\t\t 4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기\t 5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기\t\t\t 6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기\t\t\t 8. 종료");
        System.out.println("**************************************************");

        while (true) {
            System.out.print("메뉴 번호를 선택해주세요. ");
            inputMenuNum = Integer.parseInt(br.readLine());
            System.out.println(inputMenuNum + "번을 선택했습니다.");

            if (inputMenuNum == 8)
                break;
        }
    }
}
