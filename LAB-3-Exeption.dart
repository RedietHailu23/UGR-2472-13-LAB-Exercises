void main() {
  try {
   
    print('Inside try block');
    throw Exception('An error occurred');
  } catch (e) {
  
    print('Exception caught: $e');
  } finally {
   
    print('Inside finally block');
  }
  print('Outside finally block');
}
