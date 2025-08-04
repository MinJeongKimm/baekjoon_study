import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // 저항 색 배열 (각 색상에 해당하는 숫자값)
        String[] colors = {"black", "brown", "red", "orange", "yellow",
                           "green", "blue", "violet", "grey", "white"};
        
        // 입력받을 배열 
        String[] inputs = new String[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 색 입력 받기
        for (int i = 0; i < 3; i++) {
            inputs[i] = br.readLine();
        }
        
        // 저항 값 계산
        long ans = 0;

        // 첫 번째, 두 번째 색상 값 구하기
        ans = (findColorValue(inputs[0]) * 10) + findColorValue(inputs[1]);

        // 세 번째 색상은 곱셈 계수
        ans *= Math.pow(10, findColorValue(inputs[2]));
        
        // 결과 출력
        System.out.println(ans);
        br.close();
    }
    
    // 색상에 대응하는 값 찾아주는 메서드
    private static int findColorValue(String color) {
        switch (color) {
            case "black": return 0;
            case "brown": return 1;
            case "red": return 2;
            case "orange": return 3;
            case "yellow": return 4;
            case "green": return 5;
            case "blue": return 6;
            case "violet": return 7;
            case "grey": return 8;
            case "white": return 9;
            default: return -1; // 잘못된 색상일 경우
        }
    }
}
