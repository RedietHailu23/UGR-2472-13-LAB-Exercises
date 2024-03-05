void functionWithException() {
  
  bool condition = true;

  
  if (condition) {
    throw Exception('An error occurred');
  }
}

void main() {
  try {
    
    functionWithException();
   
    print('Function completed successfully');
  } catch (e) {
   
    print('Exception caught: $e');
  }
}
