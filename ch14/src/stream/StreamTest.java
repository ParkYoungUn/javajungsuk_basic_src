package stream;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// 1-1. 무한 스트림 생성 generate 메서드
		System.out.print("1-1. generate : ");
		Stream.generate(Math::random)	// 랜덤 수  num -> Math.ramdom(num) 같음
				.limit(6)	// 6번째까지 자름, limit 없다면 무한 루프
				.map(num -> num * 45)	// 랜덤 수에 45를 곱함
				.map(Math::round)		// 반올림 num -> Math.round(num) 같음
				.forEach(num -> System.out.print("[" + num + "]"));	

		// 1-2. 무한 스트림 생성 iterate 메서드
		System.out.print("\n1-2. iterate : ");
		Stream.iterate(BigDecimal.ZERO, num -> num.add(BigDecimal.ONE))	// 0부터 +1 누적
				.skip(1)	// 처음 n개의 요소를 버림 
				.limit(7)	// 7번째까지 자름 , limit 없다면 무한 루프 
				.forEach(num -> System.out.print("[" + num + "]"));

		// 2. 스트림 결합 concat 메서드
		System.out.print("\n2. concat : ");
		Stream<String> hello = Stream.of("H", "e", "l", "l", "o", ". ");
		Stream<String> world = Stream.of("World!!");
		Stream.concat(hello, world).forEach(System.out::print);

		// 3. 스트림 중복요소 제거 distinct 메서드, 스트림 정렬 sorted 메서드
		System.out.print("\n3. distinct & sorted : ");
		Stream<String> programing = Stream.of("Javascript", "C", "Java", "Nodejs", "Java", "PHP", "Java", "PHP", "C");
		programing.distinct()	// 중복 제거
				.sorted(Comparator.comparing(String::length).reversed()) // 글자 길이로 정렬. reversed(): 내림차순
				.forEach(str -> System.out.print("[" + str + "]"));

		// 4. peek 메서드
		System.out.print("\n4. peek : ");
		Stream.iterate(BigDecimal.ONE, num -> num.add(BigDecimal.ONE) )
						.peek(e -> System.out.print("[" + e + "]"))	// 중간처리 메서드 (디버깅용으로 유용)
						.limit(5);	// 최종처리 메서드
						
	}
}
