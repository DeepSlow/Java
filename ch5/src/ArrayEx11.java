import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		// 배열 numArr의 모든 값이 일치할 때까지 반복
		a1: while(true) {
			for(int i=0; i < numArr.length; i++) {
				numArr[i] = (int)(Math.random() * 10);	// 0~9의 임의의 수를 배열에 저장
			} // end for i
			a2: for(int j=0; j < numArr.length-1; j++) {
					if(numArr[j] == numArr[j+1]) {		// numArr[j] 와 numArr[j+1] 같은 값이면 건너뛰기
						continue a2;
					} else {							// numArr[j] 와 numArr[j+1] 다른 값이면 while 반복
						continue a1;
					}
			} // end for j
			break;
		} // end while
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i < numArr.length; i++) 
			counter[numArr[i]]++;
		
		for(int i=0; i < numArr.length; i++)
		System.out.println(i+"의 개수: "+ counter[i]);
	}
}