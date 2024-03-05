void functionWithException() {
  // Simulate a condition that leads to a specific type of exception
  bool condition = true;

  // Check the condition and throw a specific type of exception if it's true
  if (condition) {
    throw FormatException('An error occurred: FormatException');
  }
}

void main() {
  try {
    // Call the function that may throw a specific type of exception
    functionWithException();
    
    // This code will not be executed if an exception is thrown
    print('Function completed successfully');
  } on FormatException catch (e) {
    // Handle the specific type of exception
    print('FormatException caught: $e');
  } catch (e) {
    // Handle other types of exceptions
    print('Exception caught: $e');
  }
}
