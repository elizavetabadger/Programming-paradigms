/*Реализовать сортировку слиянием в любой парадигме. 
На вход ваша программа получает массив из чисел, а вернуть должна отсортированный массив.
 */

 public static void main(String[] args) {
    Merge testMerge = new Merge();
    int [] result = testMerge.sortArray(new int[]{2,3,1,4});

    for (int i = 0; i < result.length ; i++) {
        System.out.print(result[i] + " ");
    }
}

 public int [] sortArray(int[] arrayA){ 
    if (arrayA == null) {
        return null;
    }
   
    if (arrayA.length < 2) {
        return arrayA; 
    }
    
    int [] arrayB = new int[arrayA.length / 2];
    System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

    int [] arrayC = new int[arrayA.length - arrayA.length / 2];
    System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

    arrayB = sortArray(arrayB);
    arrayC = sortArray(arrayC); 

    return mergeArray(arrayB, arrayC);
}

public int [] mergeArray(int [] arrayА, int [] arrayB) {

    int [] arrayC = int[arrayA.length + arrayB.length];
    int positionA = 0, positionB = 0;
    
    for (int i = 0; i < arrayC.length; i++) {
        if (positionA == arrayA.length){
        arrayC[i] = arrayB[i - positionB];
        positionB++;
        } else if (positionB == arrayB.length) {
        arrayC[i] = arrayA[i - positionA];
        positionA++;
        } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
        arrayC[i] = arrayA[i - positionA];
        positionB++;
        } else {
        arrayC[i] = arrayB[i - positionB];
        positionA++;
        }
    }
    return arrayC;
}

/*Использую процедурную парадигму, потому что это простая сортировка без необходимости создания сложной структуры классов и объектов.*/