package movie;

public class Movie {
	// 필드
	String movieName;// 영화명
	int price;// 금액
	int age;// 나이
	int money;// 실구매금액
	double rate;// 할인율

	String way;// 구매방법

	// 생성자 
	public Movie(String movieName, int price, int age, String way) {
		// 매개변수로 값을 받아서 멤버변수에 넣기

		this.movieName = movieName; // this를 사용해 필드에 있는 데이터타입을 생성자로 가지고 온다.
		this.price = price;
		this.age = age;
		this.way = way;

	}

	void dataPrint() { // 반환값이 없는 void로 rateCal(할인율),moneyCal(금액)을 불러온다.
		rateCal();
		moneyCal();
		// 영화명, 금액, 나이, 할인들어간실구매가격을 불러온다.
		System.out.println(movieName + "\t\t" + price + "\t\t" + age + "\t\t" + money);

	}

	void moneyCal() { // 할인이들어간 실구매가격을 불러온다.
		money = price - (int) (price * rate);
	}

	void rateCal() { // 할인율
		switch (way) {
		case "인터넷": // 인터넷 구매할때는 5%할인
			rate = 0.05;
			break;
		case "현장": // 현장 구매할때는 할인이 없다.
			rate = 0;
			break;
		case "쿠폰": // 쿠폰 구매할때는 10%할인
			rate = 0.10;
			break;
		}
		if (age < 20) // 20살 미만일때는 case들 구매 할인율에 25%할인이 더 들어간다.
			rate += 0.25;
		else if (age >= 20 && age < 30) // 20살~29살까지는 case 구매 할인율에 20%할인이 더 들어간다.
			rate += 0.20;
		else // 30살 이상이면 case 구매 할인율에 15%할인이 더 들어간다.
			rate += 0.15;
	}

	void titlePrint() { // 영화명, 금액, 나이, 실구매가격을 프린트해서 콘솔에 보여준다.
		System.out.println("영화명\t\t금액\t\t나이\t\t실구매가격\n");
	}

	// 메소드
	// 1. 할인율 ->void rateCal()
	// 2. 실구매금액 ->void moneyCal()
	// 3. 제목인쇄하기 ->void titlePrint()
	// 4. 내용 출력하기 ->void dataPrint()
}
