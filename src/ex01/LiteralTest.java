package ex01;

public class LiteralTest {

	public static void main(String[] args) {
		// Data : Literal (코드에 직접 적은 값)
		int num = 1;
		String name = "카리나";
		double height = 167.3;
		float weight = 48.5f;          // float은 실수 뒤에 f
		int bYear = 2003;
		int tYear = 2026;
		String address = "집주소";
		char grade = 'A';
		boolean adult = true;
		boolean male = false;
		long lBalance = 12345678900L;  // int 범위 초과 → 뒤에 L

		int age = tYear - bYear;

		System.out.println("번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("생년: " + bYear);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("등급: " + grade);
		System.out.println("성인: " + adult);
		System.out.println("남성: " + male);
		System.out.println("잔액: " + lBalance);

		int data = 65;
		System.out.printf("문자: %c 숫자: %d%n", data, data);  // %c는 글자, %d는 정수
	}
}