import java.util.Scanner;

public class cafe2 {

	public static void main(String[] args) {
		
		System.out.println("커피 주문하세요");
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		String coffee;
		coffee = scanner.next();
		int count = scanner.nextInt();
		int price = 0;
		
		if(coffee.equals("에스프레소"))
			price = 2000 * count;
		else if (coffee.equals("아메리카노"))
			price = 2500 * count;
		else if (coffee.equals("카푸치노"))
			price = 3000 * count;
		else if (coffee.equals("카페라떼"))
			price = 3500 * count;
		else 
			System.out.println("메뉴를 다시 주문해주세요");
				
		System.out.println(price + "원입니다.");	
	}

}
