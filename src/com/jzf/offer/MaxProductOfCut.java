package com.jzf.offer;

/*��Ϊn�����ӣ�����m��(m>=1)��ÿ�����ӵĳ��ȼ�Ϊk[0],k[1]...k[m]
 *����k[0],k[1]...k[m]�������ܳ˻��Ƕ��� 
 */
public class MaxProductOfCut {
	/*��̬�滮 ���¶���*/
	public static int maxProductOfCut(int length) {
		int[] product = new int[length + 1];
		product[0] = 0;
		product[1] = 1;
		product[2] = 2;
		product[3] = 3;

		int max = 0;
		for (int i = 4; i <= length; i++) {
			for (int j = 1; j <= i / 2; j++) {
				product[i] = product[j] * product[i - j];
				if (max < product[i])
					max = product[i];
				product[i] = max;
			}
		}
		return product[length];
	}

	public static void main(String[] args) {
		System.out.println(maxProductOfCut(9));
	}
}
