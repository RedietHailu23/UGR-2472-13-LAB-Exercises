List<T> removeDuplicates<T>(List<T> list) {
  
  Set<T> uniqueSet = {};

  for (var element in list) {
    uniqueSet.add(element);
  }

  List<T> uniqueList = uniqueSet.toList();

  return uniqueList;
}

void main() {
  
  List<int> numbersWithDuplicates = [1, 2, 3, 2, 4, 5, 6, 3];
  List<int> uniqueNumbers = removeDuplicates(numbersWithDuplicates);
  print('List with duplicates: $numbersWithDuplicates');
  print('List without duplicates: $uniqueNumbers');
}
