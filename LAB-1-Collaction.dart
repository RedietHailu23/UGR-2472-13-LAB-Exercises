int findHighestNumber(List<int> numbers) {
  if (numbers.isEmpty) {
    throw ArgumentError('The list cannot be empty');
  }

  int highest = numbers[0];

  for (var number in numbers) {
    if (number > highest) {
      highest = number;
    }
  }

  return highest;
}

void main() {
  
  List<int> numbers = [10, 20, 30, 40, 50];
  int highestNumber = findHighestNumber(numbers);
  print('The highest number in the list is: $highestNumber');
}
