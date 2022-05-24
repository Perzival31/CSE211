package arraylist;

//Class ArrayIntList can be used to store a list of integers.

public class ArrayIntList {
 private int[] elementData; // list of integers
 private int size;          // current number of elements in the list

 public static final int DEFAULT_CAPACITY = 100;

 // post: constructs an empty list of default capacity
 public ArrayIntList() {
     this(DEFAULT_CAPACITY);
 }

 // pre : capacity >= 0
 // post: constructs an empty list with the given capacity
 public ArrayIntList(int capacity) {
     elementData = new int[capacity];
     size = 0;
 }

 // post: returns the current number of elements in the list
 public int size() {
     return size;
 }

 // pre : 0 <= index < size()
 // post: returns the integer at the given index in the list
 public int get(int index) {
     return elementData[index];
 }

 // post: creates a comma-separated, bracketed version of the list
 public String toString() {
     if (size == 0) {
         return "[]";
     } else {
         String result = "[" + elementData[0];
         for (int i = 1; i < size; i++) {
             result += ", " + elementData[i];
         }
         result += "]";
         return result;
     }
 }

 // post : returns the position of the first occurrence of the given
 //        value (-1 if not found)
 public int indexOf(int value) {
     for (int i = 0; i < size; i++) {
         if (elementData[i] == value) {
             return i;
         }
     }
     return -1;
 }

 // pre : size() < capacity
 // post: appends the given value to the end of the list
 public void add(int value) {
     elementData[size] = value;
     size++;
 }

 // pre: size() < capacity && 0 <= index <= size()
 // post: inserts the given value at the given index, shifting subsequent
 //       values right
 public void add(int index, int value) {
     for (int i = size; i > index; i--) {
         elementData[i] = elementData[i - 1];
     }
     elementData[index] = value;
     size++;
 }

 // pre : 0 <= index < size()
 // post: removes value at the given index, shifting subsequent values left
 public void remove(int index) {
     for (int i = index; i < size - 1; i++) {
         elementData[i] = elementData[i + 1];
     }
     size--;
 }
//Exercise 1
public int lastIndexOf(int value) {
	for (int i = size; i > 0; i--) {
         if (elementData[i] == value) {
             return i;
         }
     }
     return -1;
 }
// Exercise 2
public int indexOfSubList(ArrayIntList list2) {
	for (int i = 0; i < size; i++) {
		
		if (elementData[i] == list2.get(0)) {
			boolean wholestring = true;
			
			for (int j = i; j < list2.size(); j++) {
				if (elementData[i+j] != list2.get(j)) {
					wholestring = false;
				}		
			}
			if (wholestring) {
				return i;
			}
		}
	}
	return -1;
 }
//Exercise 5
public ArrayIntList runningTotal() {
	ArrayIntList result = new ArrayIntList(size);
	int sum = 0;
	for (int i = 0; i < size; i++) {
		sum += elementData[i];
		result.add(sum);
	}
	return result;
	
 }
//Exercise 8
public int count(int value) {
	int count = 0;
	for (int i = 0; i < size; i++) {
		if (elementData[i] == value) {
			count += 1;
		}
	}
	return count;
 }
//Exercise 11
public int removeLast() {
	int last = elementData[size - 1];
	size = size - 1;
	return last;
 }
}
