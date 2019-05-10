import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 9, 7, 3, 0, -5, -2, 10, 11};
        //
        int concreteValue = 2;
        /*
        //1.Найти сумму элементов массива
        int sumOfArrayElements = stream(arr).sum();
        System.out.println("Sum of array elements : " + sumOfArrayElements);
        */
        /*
        //2.Найти максимальный элемент, значение и индекс
        IntStream.range(0,arr.length).reduce((a, b) -> arr[a] < arr[b] ? b : a)
                .ifPresent( index -> System.out.println("Index max : " + index + ", value : " + arr[index]));
        */
        /*
        //3.Найти минимальный элемент, значение и индекс
        IntStream.range(0,arr.length).reduce((a,b) -> arr[a] < arr[b] ? a : b)
                .ifPresent( index -> System.out.println("Index min : " + index + ", value : " + arr[index]) );
        */
        /*
        //4.Найти среднее значение элементов массива
        double averageValueOfArray = stream(arr).average().orElse(9999);
        System.out.println("Average value of arr elements : " + averageValueOfArray);
        */
        /*
        //5.Посчитать количество элементов равных заданному
        long counterOfConcreteValue = stream(arr).filter( x -> x == concreteValue).count();
        System.out.println("Number of elements that equals " + concreteValue + " --> " + counterOfConcreteValue);
        */
        /*
        //6.Посчитать количество элементов равных нулю
        long elementsEqualsZero = stream(arr).filter( x-> x == 0).count();
        System.out.println("Number of element that equals 0 : " + elementsEqualsZero);
        */
        /*
        //7.Посчитать количество элементов больше нуля
        long elementsBiggerZero = stream(arr).filter(x -> x > 0).count();
        System.out.println("Number of element that bigger than 0 : " + elementsBiggerZero);
        */
        /*
        //8.Помножить элементы массива на число
        int[] multipliedArray = stream(arr).map(x -> x * 2).toArray();
        System.out.println("Multiplied array : \n" + Arrays.toString(multipliedArray));
        */
        /*
        //9.Прибавить к элементам массива их индекс
        int[] addedIndexValueToArrayElements = IntStream.range(0, arr.length).map(a -> arr[a] = arr[a] + a).toArray();
        System.out.println("Add index to element of Array : \n" + Arrays.toString(addedIndexValueToArrayElements));
        */
        /*
        //10.Обнулить четные по значению элементы массива
        int[] zeroEvenValue = IntStream.range(0, arr.length).map(a -> (arr[a] % 2 == 0) ? (arr[a] = 0) : arr[a]).toArray();
        System.out.println("Even values get 0 : \n" + Arrays.toString(zeroEvenValue));
        */
        /*
        //11.Обнулить элементы  с нечетным индексом.
        int[] zeroOddValue = IntStream.range(0, arr.length).map(a -> (arr[a] % 2 != 0) ? arr[a] = 0 : arr[a]).toArray();
        System.out.println("Even values get 0 : \n" + Arrays.toString(zeroOddValue));
        */
        /*
        //12.Найти первый положительный элемент
        int firstPositiveValue = stream(arr).filter(x -> x > 0).findFirst().orElse(999);
        System.out.println("First positive number in array : " + firstPositiveValue);
        */
        /*
        //13.Найти последний отрицательный элемент
        int lastNegativeElement = Arrays.stream(arr).filter( x -> x < 0).reduce( (a,b) -> b).orElse(999);
        System.out.println("Last negative element : " + lastNegativeElement);
        */
        /*
        //14.Посчитать количество элементов равных заданному
        int[] indexOfElementEqualsValue = IntStream.range(0, arr.length).filter(a -> arr[a] == concreteValue).toArray();
        System.out.println("Indexes of element that equals concrete value : " + Arrays.toString(indexOfElementEqualsValue));
        */
        /*
        //15.Найти индексы вхождения элемента в массив
        int[] indexesEqualsValueFromArr = IntStream.range(0, arr.length).filter(x -> arr[x] == concreteValue).toArray();
        System.out.println("Indexes of elements that equals given value" + Arrays.toString(indexesEqualsValueFromArr));
        */
        /*
        //16.Проверить массив на упорядоченность элементов по возрастанию
        Arrays.sort(arr);
        IntStream.range(0, arr.length - 1).map( a -> (arr[a] < arr[a+1] || arr[a] == arr[a + 1]) ? 1 : 0).reduce((a,b) -> (a == 1 && b == 1) ? 1 : 0)
                .ifPresent( x -> System.out.println("Sorted array :  " +  (x == 1) ));
        */
        /*
        //17.Проверить массив на упорядоченность элементов по спаданию
        Arrays.sort(arr);
        IntStream.range(0, arr.length - 1).map( a -> (arr[a] > arr[a+1] || arr[a] == arr[a + 1]) ? 1 : 0).reduce((a,b) -> (a == 1 && b == 1) ? 1 : 0)
                .ifPresent( x -> System.out.println("Sorted by DISCR array :  " +  (x == 1) ));
        boolean b = IntStream.range(0, arr.length - 1).allMatch(x -> arr[x] < arr[x + 1] || arr[x] == arr[x + 1]);
        System.out.println("Is array sorted by INC :" + b);
        */
    }
}
