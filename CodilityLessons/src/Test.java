
public class Test {

	public static void main(String[] args) {
		int[] arr = { -2, 3,-5 };
		System.out.println(getMinSubArray(arr));
	}

	private static int getMaxSubArray(int[] paramArr) {

		if (paramArr.length > 2) {
			int max = paramArr[0], maxCurrent = paramArr[0];
			for (int i = 0; i < paramArr.length - 1; i++) {
				maxCurrent = paramArr[i] > maxCurrent + paramArr[i] ? paramArr[i] : maxCurrent + paramArr[i];
				max = maxCurrent > max ? maxCurrent : max;
			}
			return max;
		} else {
			return paramArr.length > 1 ? paramArr[0] > paramArr[1] ? paramArr[0] : paramArr[1] : paramArr[0];
		}

	}
	
	
	
	private static int getMinSubArray(int[] paramArr) {

		if (paramArr.length > 2) {
			int min = paramArr[0], minCurrent = paramArr[0];
			for (int i = 0; i < paramArr.length - 1; i++) {
				minCurrent = paramArr[i] < minCurrent - paramArr[i] ? paramArr[i] : minCurrent - paramArr[i];
				min = minCurrent < min ? minCurrent : min;
			}
			return min;
		} else {
			return paramArr.length < 1 ? paramArr[0] < paramArr[1] ? paramArr[0] : paramArr[1] : paramArr[0];
		}

	}

}
