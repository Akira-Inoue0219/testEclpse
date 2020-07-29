package gitgit;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello git");

		System.out.println("数を入力");
		int a = new java.util.Scanner(System.in).nextInt();
		int r =new java.util.Random().nextInt(4);
		if(a==r) {
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}
		System.out.println("hello github");

	}

}
