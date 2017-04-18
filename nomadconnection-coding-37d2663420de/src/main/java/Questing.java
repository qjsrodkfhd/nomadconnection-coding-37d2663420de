
/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */

class Questing {

	public static int integer;

	static int quest1(double d) {

		// double형 => int형으로 형변환
		integer = (int) (d / 2);

		return integer;

	}

	static boolean quest2(String s) {
		
		final int SIZE = s.length();
		char stack[] = new char[SIZE / 2];
		int top = -1; // Stack Pointer

		for (int i = 0; i < SIZE; i++) {

			char c = s.charAt(i); // c = current character

			// c의 경우를 3가지로 나누겠습니다 (1.여는 괄호 2.닫는 괄호 3.괄호가 아님)
			if (c == '(' || c == '{' || c == '[') { // 1.여는 괄호

				top += 1;
				
				if (top >= SIZE / 2) { // 문자열의 길이의 절반보다 여는 괄호가 많이 나왔다는 의미
										// => 남은 문자열로 절대 모두 닫을 수 없음 => 무조건 false
					return false;
				}
				
				stack[top] = c;

			} else if (c == ')' || c == '}' || c == ']') { // 2.닫는 괄호

				if (top == -1){
					
					return false; // 스택이 비어있다면 열린 괄호가 하나도 없다는 뜻이므로 닫는 괄호가 나왔다는
									// 것은
									// 문제가 있다는 의미이므로 false를 리턴합니다.
				}
				
				if (c - stack[top] == 1 || c - stack[top] == 2) {
					
					stack[top] = 0;
					top -= 1;
					
				} else { // 두 문자의 아스키코드 값의 차가 1이나 2가 아니라면 서로 알맞지 않은 관계라는 뜻입니다.
					
					return false;
					
				}

			} else { // 3.괄호가 아님
				
				return false;
				
			}
		}

		if (top == -1) { // 스택이 비어있으므로 모든 열어놓은 괄호가 알맞게 닫혔다는 뜻
			
			return true;
			
		} else { // 스택에 열린 괄호가 남아있으므로, 여닫기가 적절히 이루어지지 않았다는 뜻
			
			return false;
			
		}

	}

}
