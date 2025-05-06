package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        // 자바가 만들어주는 기본 스레드
        System.out.println(Thread.currentThread().getName() + ": main() start");

        // HelloThread 객체생성
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start 호출 전");
        // 객체생성 후 start 수행하면 자바는 스레드를 위한 별도의 스택공간을 할당
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + " : start 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }

    /*
    수행결과
    main: main() start
    main : start 호출 전
    main : start 호출 후
    main : main() end
    Thread-0 : run()

    ---> main스레드는 기다리지 않는다. 순서와 실행기간 모두 보장하지 않는 멀티스레드
    * */
}
