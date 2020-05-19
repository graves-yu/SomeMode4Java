/**
 * 
 */
package com.graves;

/**  
 * <p>Title: SortingAlgorithm</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月19日  
 */
public class SortingAlgorithm {
	/**
	 * 	冒泡排序
	 * <p>Title: BubbleSort</p>  
	 * <p>Description: 
 	 * 	　　 a、冒泡排序，是通过每一次遍历获取最大/最小值

　　			b、将最大值/最小值放在尾部/头部

　　			c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值
			
			示例图片：https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531163708186-1703601448.gif
　　		</p>  
	 * @author Graves
	 * @date 2020年5月19日
	 */
	public static void bubbleSort() {
		int arr[] = {8, 5, 3, 2, 4};
		
        //冒泡
        for (int i = 0; i < arr.length; i++) {
            //外层循环，遍历次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                //内层循环一次，获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
	}
	
	/**
	 * 	选择排序
	 * <p>Title: selectSort</p>  
	 * <p>Description: 
	 * 	a、将第一个值看成最小值

　　		b、然后和后续的比较找出最小值和下标

　　		c、交换本次遍历的起始值和最小值

　　		d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。

		示例图片：https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531170205821-1983678643.gif
	 * </p>  
	 * @author Graves
	 * @date 2020年5月19日
	 */
	public static void selectSort() {
		int arr[] = {6, 5, 3, 2, 4};

        //选择
        for (int i = 0; i < arr.length; i++) {
            //默认第一个是最小的。
            int min = arr[i];
            //记录最小的下标
            int index = i;
            //通过与后面的数据进行比较得出，最小值和下标
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            //然后将最小值与本次循环的，开始值交换
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            //说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无序的最小值，做替换
        }
	}
	
	/**
	 * 	插入排序
	 * <p>Title: insertSort</p>  
	 * <p>Description: 
	 *	a、默认从第二个数据开始比较。

　　		b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（交换）。否则，退出循环

　　		c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。
	
		示例图片：https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531170953283-1806153331.gif
	 * </p>  
	 * @author Graves
	 * @date 2020年5月19日
	 */
	public static void insertSort() {
		int arr[] = {7, 5, 3, 2, 4};

        //插入排序
        for (int i = 1; i < arr.length; i++) {
            //外层循环，从第二个开始比较
            for (int j = i; j > 0; j--) {
                //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    //如果不小于，说明插入完毕，退出内层循环
                    break;
                }
            }
        }
	}
	
	/**
	 * 	快速排序
	 * <p>Title: quickSort</p>  
	 * <p>Description: 
	 * 	a、确认列表第一个数据为中间值，第一个值看成空缺（低指针空缺）。

　　		b、然后在剩下的队列中，看成有左右两个指针（高低）。

　　		c、开始高指针向左移动，如果遇到小于中间值的数据，则将这个数据赋值到低指针空缺，并且将高指针的数据看成空缺值（高指针空缺）。然后先向右移动一下低指针，并且切换低指针移动。

　　		d、当低指针移动到大于中间值的时候，赋值到高指针空缺的地方。然后先高指针向左移动，并且切换高指针移动。重复c、d操作。

　　		e、直到高指针和低指针相等时退出，并且将中间值赋值给对应指针位置。

　　		f、然后将中间值的左右两边看成行的列表，进行快速排序操作。

		示例图片：https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531175709515-169602629.gif
	 * </p>  
	 * @author Graves
	 * @date 2020年5月19日
	 */
	public static void quickSort() {
		int arr[] = {7, 5, 3, 2, 4, 1, 8, 9, 6};

        //快速排序
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high); 
	}

	/**  
	 * 	快速排序
	 * <p>Title: quickSort</p>  
	 * <p>Description: 
	 *  a、确认列表第一个数据为中间值，第一个值看成空缺（低指针空缺）。

　　		b、然后在剩下的队列中，看成有左右两个指针（高低）。

　　		c、开始高指针向左移动，如果遇到小于中间值的数据，则将这个数据赋值到低指针空缺，并且将高指针的数据看成空缺值（高指针空缺）。然后先向右移动一下低指针，并且切换低指针移动。

　　		d、当低指针移动到大于中间值的时候，赋值到高指针空缺的地方。然后先高指针向左移动，并且切换高指针移动。重复c、d操作。

　　		e、直到高指针和低指针相等时退出，并且将中间值赋值给对应指针位置。

　　		f、然后将中间值的左右两边看成行的列表，进行快速排序操作。

		示例图片：https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531175709515-169602629.gif
	 * </p>  
	 * @author Graves
	 * @date 2020年5月19日   
	 * @param arr
	 * @param low
	 * @param high  
	 */ 
	private static void quickSort(int[] arr, int low, int high) {
		//如果指针在同一位置(只有一个数据时)，退出
        if (high - low < 1) {
            return;
        }
        //标记，从高指针开始，还是低指针（默认高指针）
        boolean flag = true;
        //记录指针的其实位置
        int start = low;
        int end = high;
        //默认中间值为低指针的第一个值
        int midValue = arr[low];
        while (true) {
            //高指针移动
            if (flag) {
                //如果列表右方的数据大于中间值，则向左移动
                if (arr[high] > midValue) {
                    high--;
                } else if (arr[high] < midValue) {
                    //如果小于，则覆盖最开始的低指针值，并且移动低指针，标志位改成从低指针开始移动
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                //如果低指针数据小于中间值，则低指针向右移动
                if (arr[low] < midValue) {
                    low++;
                } else if (arr[low] > midValue) {
                    //如果低指针的值大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。切换为高指针移动
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }
            //当两个指针的位置相同时，则找到了中间值的位置，并退出循环
            if (low == high) {
                arr[low] = midValue;
                break;
            }
        }
        //然后出现有，中间值左边的小于中间值。右边的大于中间值。
        //然后在对左右两边的列表在进行快速排序
        quickSort(arr, start, low -1);
        quickSort(arr, low + 1, end);
	}
	
	public static void main(String[] args) {
		quickSort();
	}
}
