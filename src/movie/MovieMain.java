package movie;

/*
1. 프로젝트명 : 영화 예매 하기(MovieTicketProject)
   패키지명 : movie
2. 클래스명 : MovieMain.java -- main( )가 있는 경우(Movie.java--라이브러리클래스)
3. 생성자 초기값 넣기로 자료를 넣어 주세요.   -> 라이브클래스(Movie.java)
   입력자료 : 영화명, 금액, 나이, 구매방법(현장, 인터넷, 쿠폰)
   실구매금액조건  -> swicth ~ case
   1) 나이가 20미만이면 25% 할인, 나이가 20~30이면 20%할인, 30이상이면 15%할인
   2) 현장구매인 경우 0%할인, 인터넷 구매인 경우 추가 5%할인, 쿠폰구매인 경우 10%할인
      예) 1째줄은 11000 * 70% = 7700
         2째줄은 15000 * (100%-20%) = 12000
         3째줄은 12500 * (100%-(15%+10%)) = 9375

4. 입력자료  -> Scanner클래스를 main에 지정한다.
1째 레코드(줄) => 1917 11000 10 인터넷
2째 레코드(줄)==> 주디 1500025 현장
3째 레코드(줄)==> 인비저블맨 12500 40 쿠폰


 */
public class MovieMain {
	public static void main(String[] args) {

		// Movie 클래스를 3개로 나눠 객체화 해서 Movie에 넣었던 데이터타입을 차례대로 불러온다.
		Movie m1 = new Movie("1917", 11000, 10, "인터넷"); 
		Movie m2 = new Movie("주디", 15000, 25, "현장");
		Movie m3 = new Movie("인비저블맨",12500,40,"쿠폰");
		
		m1.titlePrint(); // 프린트로 입력한 타이틀을 불러온다
		m1.dataPrint(); // 프린트로 입력한 데이터를 불러온다
		m2.dataPrint();
		m3.dataPrint();
		

	}
}
