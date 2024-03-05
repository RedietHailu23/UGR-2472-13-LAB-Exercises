double calculateAverage(List<num> numbers) {
    if (numbers.isEmpty) {
        throw ArgumentError('The list cannot be empty');
    }

    double sum = 0;

    for (var number in numbers) {
        sum += number;
    }

    double average = sum / numbers.length;

    return average;
}

void main() {
  
    List<num> numbers = [10, 20, 30, 40, 50];
    double average = calculateAverage(numbers);
    print('The average of the numbers is: $average');
}
