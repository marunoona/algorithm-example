package sorting;

public class HeapSort {
    class Heap {
        private int heapSize;
        private int[] itemHeap;

        Heap() {
            heapSize = 0;
            itemHeap = new int[50];
        }

        void insertHeap(int item) {
            int i = ++heapSize;
            while ((i != 1) && (item > itemHeap[i / 2])) {
                itemHeap[i] = itemHeap[i / 2];
                i /= 2;
            }
            itemHeap[i] = item;
        }

        int deleteHeap() {
            int parent, child;
            int item, tmp;
            item = itemHeap[1];
            tmp = itemHeap[heapSize--];
            parent = 1;
            child = 2;

            while(child <= heapSize){
                if( (child < heapSize) && (itemHeap[child] < itemHeap[child+1]))
                    child++;
                if(tmp >= itemHeap[child])
                    break;
                itemHeap[parent] = itemHeap[child];
                parent = child;
                child *= 2;
            }

            itemHeap[parent] = tmp;
            return item;
        }
    }

    private void sort(int[] data){
        Heap heap = new Heap();

        for (int datum : data) {
            heap.insertHeap(datum);
        }

        for(int i = data.length -1; i >= 0; --i){
            data[i] = heap.deleteHeap();
        }

        System.out.println("힙 정렬 결과 :");
        Util.printArr(data);
    }

    public static void main(String[] args) {
        int[] data = { 69, 10, 30, 2, 16, 8, 31, 22 };
        HeapSort heapSort = new HeapSort();
        //정렬
        heapSort.sort(data);
    }
}
