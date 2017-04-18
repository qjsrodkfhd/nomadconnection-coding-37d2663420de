import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestingTest {
	/**
	 * 1과 같은 값이 리턴되는지 테스트 합니다
	 */
	@Test
	public void quest2Test1() {
		assertEquals(1, Questing.quest1(2));
	}

	/**
	 * 0과 같은 값이 리턴되는지 테스트 합니다
	 */
	@Test
	public void quest2Test2()  {
		assertEquals(0, Questing.quest1(0.97));
	}

	/**
	 * 7과 같은 값이 리턴되는지 테스트 합니다
	 */
	@Test
	public void quest2Test3()  {
		assertEquals(7, Questing.quest1(14.64));
	}

	/**
	 * 800과 같은 값이 리턴되는지 테스트 합니다
	 */
	@Test
	public void quest2Test4()  {
		assertEquals(800, Questing.quest1(1600.20));
	}

	/**
	 * 40과 같은 값이 리턴되는지 테스트 합니다
	 */
	@Test
	public void quest2Test5()  {
		assertEquals(40, Questing.quest1(80));
	}

	/**
	 * True 가 정상적으로 리턴되는지를 테스트 합니다
	 */
	@Test
	public void quest1Test1() {
		final String bracket = "({}[])";
		assertEquals(true, Questing.quest2(bracket));
	}

	/**
	 * False 가 정상적으로 리턴되는지를 테스트 합니다
	 */
	@Test
	public void quest1Test2() {
		final String bracket = "({[}])";
		assertEquals(false, Questing.quest2(bracket));
		System.out.println("false = " + Questing.quest2(bracket));
	}

}