/*Задача 2.
Создать приложение, которое подсчитывает количество различных символов во введенной строке.
Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем:
A - 3
D - 2
S - 3*/
fun main(){
    print("Введите последовательность символов: ")
    var array= readln().toCharArray()
    array.sort()
    var count =0;
    for(i in array.indices) {
        count=0
        for(f in i..<array.size){
            if (array[i]== array[f] || (array[i] == array[f] && array[i+1] != array[f] && i< array.size-1)){
                count++
            }
            if(i>0 && array[i-1]== array[f]){
                count=0
                break
            }
        }
        if(count>0) {
            println(array[i] + " - " + "$count")
        }
    }
}