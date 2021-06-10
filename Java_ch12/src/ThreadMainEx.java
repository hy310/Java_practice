// main 스레드 확인과 스레드 정보를 알아내는 코드
// main() 메소드 내에서 현재 스레드 정보를 가진 Thread 객체를 알아내어
// 현재 실행중인 스레드에 관한 다양한 정보 출력

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();              // 스레드 ID 얻기
		String name = Thread.currentThread().getName();        // 스레드 이름 
		int priority = Thread.currentThread().getPriority();   // 스레드 우선순위
		Thread.State s = Thread.currentThread().getState();    // 스레드 상태값
		
		System.out.println("현재 스레드 이름 = " + name);
		System.out.println("현재 스레드 ID = " + id);
		System.out.println("현재 스레드 우선순위 값 = " + priority);
		System.out.println("현재 스레드 상태 = " + s);

	}

}
