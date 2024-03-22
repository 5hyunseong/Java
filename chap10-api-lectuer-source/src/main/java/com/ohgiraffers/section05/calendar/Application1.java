package com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application1 {

	public static void main(String[] args) {

		/* 수업목표. java.util.Data 클래스 사용법을 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Date 클래스
		 *  JDK 1.0 부터 날짜를 취급하기 위해 사용되던 Date클래스는
		 *  생성자를 비롯하여 대부분의 메소드가 Deprecated 되어 있다. (API문서 참조)
		 *
		 * 필기.
		 *  Deprecated란?
		 *  향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미이다.
		 *  하지만 하위 버젼의 호환성 때문에 한 번에 제거된 것은 아니고 남겨두었기 때문에 사용하는것은 가능하다.
		 * */
		
		/* 필기.
		 *  JDK 1.1부터는 새롭게 제공되는 Calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다.
		 *  하지만 Calendar 클래스는 몇 가지 문제를 가지고 있다.
		 *  1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수정할 수 있다.
		 *  2. 윤초(leap second)를 고려하지 않는다.
		 *     윤초란?
		 *     협정 세계시에서 사용하는 세슘 원자 시계와 실제 지구의 자전/공전 속도를 기준으로 한 태양시의 차이로 인해
		 *     발생한 오차를 보정하기 위해 추가하는 1초이다.
		 *     12월 31일의 마지막에 추가하거나, 혹은 6월 30일의 마지막에 추가한다.
		 *     윤초는 사소해 보이지만 실제 2012년 링크드인 과 같은 대규모 서비스의 서버를 마비시킨 버그를 발생한 적 도 있다.
		 *  3. Calendar 클래스는 월을 나타낼 때 0 부터 11까지로 표현하는 불편함이 있다.
		 *
		 * 필기.
		 *  JDK 1.8에서는 이러한 모든 문제를 해결할 수 있는 time 패키지를 제공하고 있다.
		 * */
		
		/* 필기.
		  *  Date는 java.sql.Date와 java.util.Date가 존재한다.
		 *  한 클래스에서 두 개의 타입을 전부 사용하게 되면 import를 하더라도 사용하는 타입이
		 *  어느 패키지에 있는 Date클래스인지에 대한 모호성이 발생하게 된다.
		 *  따라서 import를 해도 풀 클래스의 이름을 작성해줘야 한다.
		 * */
		
		/* 설명. Date클래스는 두 가지 생성 방법이 존재한다.
		 *  나머지는 Deprecated 되어 있다.
		 * */
		
		/* 목차. 1. 기본생성자 사용하는 방법 */
		/* 필기. 기본 생성자로 인스턴스를 생성하면 운영체제의 날짜/시간 정보를 이용해서 인스턴스를 만들게 된다. */
		Date today = new Date();
		
		/* 설명. toString()메소드가 오버라이딩 되어 있어서 쉽게 필드값을 출력해 볼 수 있다. */
		System.out.println("today: " + today);
		
		/* 목차. 2. Date(long date) 사용하는 방법 */
		
		/* 필기. getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond로 계산해서 long타입으로 반환한다. */
		System.out.println("today.getTime(): " + today.getTime());
		
		/* 설명.
		 *  콘솔에 출력된 긴 숫자를 복사해서 생성자의 인자로 전달한다.
		 *  단 long 타입의 리터럴에 맞게 뒤에 L을 붙여준다.
		 * */
		Date time = new Date(1708258053757L);
		
		/* 설명.
		 *  아까 실행했을 당시 그 시간이 나오게 된다.
		 *  즉, 특정 날짜/시간 정보를 이용해서 Date 인스턴스를 생성하기 위해서는 해당 방법만이 존재한다.
		 *  하지만 계산하려면 매우 복잡하다.
		 *  하루 = 24시간, 1시간 = 60분, 1분 = 60초, 1초 = 1000밀리초
		 *  1000 * 60 * 60 * 24 가 하루가 된다.
		 * */
		System.out.println(time);
	}
}
